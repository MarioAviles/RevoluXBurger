package com.reboluxBurger.backend.init;

import com.reboluxBurger.backend.entity.Menu;
import com.reboluxBurger.backend.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.reboluxBurger.backend.enums.Category.*;
import static com.reboluxBurger.backend.enums.Type.*;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MenuRepository menuRepository;

    public DataInitializer(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (menuRepository.count() == 0) {
            menuRepository.saveAll(List.of(
                    new Menu(null, "Furia Urbana", "Explosión callejera de doble carne, cheddar fundido, bacon crujiente y cebolla caramelizada. Una bomba de sabor sin reglas.", Burger, Medallon, 1000L, "/images/burgers/Furia_Urbana.png"),
                    new Menu(null, "El Capo", "Carne smash doble, doble queso, cebolla morada, pepinillos y alioli mafioso. Puro poder con cada mordida.", Burger, Smash, 1000L, "/images/burgers/El_Capo.png"),
                    new Menu(null, "Garden Punk", "Veggie rebelde con alcachofa crunchy, verdes frescos y mayonesa de ajo. Para los que comen verde sin ser aburridos.", Burger, Vegana, 1000L, "/images/burgers/Garden_Punk.jpg"),
                    new Menu(null, "La Bestia", "Triple cheddar, bacon y salsa secreta. Es rápida, intensa y no perdona.", Burger, Medallon, 1000L, "/images/burgers/La_Bestia.png"),
                    new Menu(null, "El Venerado", "Doble smash, montaña de bacon, cheddar y BBQ dulce. Un culto al cerdo que no perdona.", Burger, Smash, 1000L, "/images/burgers/El_Venerado.png"),
                    new Menu(null, "Extinción Smash", "Carnes prehistóricas, queso fundido y alioli. Tan brutal como una huella fósil.", Burger, Smash, 1000L, "/images/burgers/Extincion_Smash.png"),
                    new Menu(null, "Fuego Cruzado", "Doble carne, queso cheddar, cebolla morada, salsa picante. Te dispara directo al antojo.", Burger, Pollo, 1000L, "/images/burgers/Fuego_Cruzado.png"),
                    new Menu(null, "La Monster", "Cuádruple carne picada, cheddar en capas, bacon, cebolla crispy y mostaza fuerte. El final boss de las hamburguesas.", Burger, Medallon, 1000L, "/images/burgers/La_Monster.jpg"),
                    new Menu(null, "La Patrona", "Picante, poderosa y con estilo. Carne especiada, jalapeños, cheddar y guacamole. Ordena con respeto.", Burger, Medallon, 1000L, "/images/burgers/La_Patrona.jpg"),
                    new Menu(null, "Morena Mía", "Rúcula, queso suave, carne de waygu y cebolla dulce. Elegancia con sabor atrevido.", Burger, Medallon, 1000L, "/images/burgers/Morena_Mia.png"),
                    new Menu(null, "Porcopolis", "Medallon + huevo + bacón + cheddar. Un imperio de las burgers.", Burger, Medallon, 1000L, "/images/burgers/Porcopolis.png"),
                    new Menu(null, "Santa Smash", "Cheddar, lechuga, tomate y mayonesa. La santa trinidad de la hamburguesa bien hecha.", Burger, Smash, 1000L, "/images/burgers/Santa_Smash.png"),
                    new Menu(null, "Triple Crimen", "Tres carnes smash, tres quesos y un crimen perfecto de sabor. Imposible salir ileso.", Burger, Smash, 1000L, "/images/burgers/Triple_Crimen.png"),
                    new Menu(null, "Vinilo & Mostaza", "Revive los 50’s: pepinillos, ketchup, mostaza, cebolla morada, tomate y queso americano. Pura nostalgia entre panes.", Burger, Medallon, 1000L, "/images/burgers/Vinilo_&_Mostaza.png"),
                    new Menu(null, "Western Nights", "Estilo del viejo oeste: carne jugosa, queso suizo, tomate y salsa ranch. Clásico pero letal.", Burger, Medallon, 1000L, "/images/burgers/Western_Nights.png"),
                    new Menu(null, "Agua 1L", "Botella de agua de 1 litro", Bebida, 1000L, "/images/bebidas/Agua.png"),
                    new Menu(null, "Cerveza", "Quinto de cerveza 200ml", Bebida, 1000L, "/images/bebidas/Cerveza.jpg"),
                    new Menu(null, "Coca Cola", "Botella de coca cola de 200ml", Bebida, 1000L, "/images/bebidas/Cocacola.jpg"),
                    new Menu(null, "Limonada", "Vaso de limonada", Bebida, 1000L, "/images/bebidas/Limonada.png"),
                    new Menu(null, "Helado de Chocolate", "Bola de helado de chocolate", Postre, 1000L, "/images/postres/BolaHeladoChocolate.jpg"),
                    new Menu(null, "Helado de Vainilla", "Bola de helado de vainilla", Postre, 1000L, "/images/postres/BolaHeladoVainilla.png"),
                    new Menu(null, "Brownie de Chocolate", "Porción de Brownie de chocolate", Postre, 1000L, "/images/postres/Brownie.jpg"),
                    new Menu(null, "Tarta de Queso", "Porción de tarta de queso", Postre, 1000L, "/images/postres/Cheesecake.png"),
                    new Menu(null, "Mousse", "Mousse de chocolate", Postre, 1000L, "/images/postres/Mousse.png"),
                    new Menu(null, "Mousse de la Abuela", "Mousse tradicional con un pequeño toque de la abuela", Postre, 1000L, "/images/postres/MoussedelaAbuela.png"),
                    new Menu(null, "Mousse de Pistacho", "Mousse de pistacho", Postre, 1000L, "/images/postres/MoussedePistacho.png"),
                    new Menu(null, "Alitas del Bronx", "Alas tiernas con actitud. Jugosas por dentro, doradas por fuera y con una salsa que te va a hacer sudar. No aptas para paladares tímidos.", Entrante, 1000L, "/images/entrantes/AlitasdelBronx.png"),
                    new Menu(null, "Aritos", "Aros de cebolla gigantes, dorados como el verano y crujientes como el primer mordisco de la libertad. Un clásico que no pide permiso.", Entrante, 1000L, "/images/entrantes/Aritos.png"),
                    new Menu(null, "Nachorreo", "Un volcán de nachos bañados en queso fundido, jalapeños rebeldes, guacamole con flow y crema agria. El caos que te mereces.", Entrante, 1000L, "/images/entrantes/Nachorreo.png"),
                    new Menu(null, "Pollokids", " Crujientes bastoncitos de pollo empanado que no juzgan si tienes alma de niño. Bañalos en lo que quieras... o atrévete a comerlos solos. Porque cuando algo está bien hecho, no necesita acompañante.", Entrante, 1000L, "/images/entrantes/Pollokids.png"),
                    new Menu(null, "Tequeños", "Palitos venezolanos rellenos de queso que se derrite en tu boca (y en tu alma). Para mojar en sala... y perder el control.", Entrante, 1000L, "/images/entrantes/Tequeños.png"),
                    new Menu(null, "TequeñosDeluxe", "El arte del queso y lo dulce en un solo bocado. Inspirados en Da Vinci, hechos para genios del antojo. Dales un mordisco y pinta tu día de sabor.", Entrante, 1000L, "/images/entrantes/TequeñosDeluxe.png")
                    
                    ));
            System.out.println("Datos iniciales cargados");
        }
    }
}

