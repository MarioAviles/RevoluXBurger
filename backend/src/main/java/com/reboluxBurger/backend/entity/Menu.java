package com.reboluxBurger.backend.entity;

import com.reboluxBurger.backend.enums.Category;
import com.reboluxBurger.backend.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "menu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Category category;

    @Column (nullable = false)
    private Type type;

    @Column(nullable = false)
    private Boolean gluten;

}
