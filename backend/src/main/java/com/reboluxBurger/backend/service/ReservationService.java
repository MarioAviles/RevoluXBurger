package com.reboluxBurger.backend.service;

import com.reboluxBurger.backend.dto.ReservationRequest;
import com.reboluxBurger.backend.entity.Reservation;
import com.reboluxBurger.backend.entity.User;
import com.reboluxBurger.backend.enums.Role;
import com.reboluxBurger.backend.repository.ReservationRepository;
import com.reboluxBurger.backend.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository;

    public ReservationService(ReservationRepository reservationRepository, UserRepository userRepository) {
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
    }

    public List<ReservationRequest> getAllReservations() {
        User currentUser = getCurrentUser();
        if (currentUser.getRole() == Role.ADMIN) {
            return reservationRepository.findAll().stream().map(reservation -> new ReservationRequest(reservation.getId(), reservation.getDescription(), reservation.getDate(), reservation.getUser().getId()))
                    .collect(Collectors.toList());
        }
        return reservationRepository.findByUserId(currentUser.getId()).stream().map(reservation -> new ReservationRequest(reservation.getId(), reservation.getDescription(), reservation.getDate(), reservation.getUser().getId()))
                .collect(Collectors.toList());
    }

    public Reservation createReservation(Reservation reservation) {
        User currentUser = getCurrentUser();
        reservation.setUser(currentUser);
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Long reservationId, Reservation updatedReservation) {
        Reservation existingReservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new RuntimeException("No existe una reserva con ese id"));
        User currentUser = getCurrentUser();
        if (existingReservation.getUser().getId().equals(currentUser.getId()) || currentUser.getRole() == Role.ADMIN) {
            existingReservation.setDate(updatedReservation.getDate());
            existingReservation.setDescription(updatedReservation.getDescription());
            return reservationRepository.save(existingReservation);
        }
        throw new RuntimeException("No tienes autorización para actualizar esta reserva");
    }

    public void deleteReservation(Long reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new RuntimeException("reservation no encontrado"));
        User currentUser = getCurrentUser();
        if (reservation.getUser().getId().equals(currentUser.getId()) || currentUser.getRole() == Role.ADMIN) {
            reservationRepository.delete(reservation);
        } else {
            throw new RuntimeException("No tienes autorización para borrar esta reserva");
        }
    }

    private User getCurrentUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}
