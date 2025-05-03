package com.reboluxBurger.backend.init;

import com.reboluxBurger.backend.entity.Menu;
import com.reboluxBurger.backend.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.reboluxBurger.backend.enums.Category.Bebida;
import static com.reboluxBurger.backend.enums.Category.Burger;
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
                    new Menu(null, "Furia Urbana", "Explosión callejera de doble carne, cheddar fundido, bacon crujiente y cebolla caramelizada. Una bomba de sabor sin reglas.", Burger, Medallón, 1000L, "/images/burgers/Furia_Urbana.png"),
                    new Menu(null, "El Capo", "Carne smash doble, doble queso, cebolla morada, pepinillos y alioli mafioso. Puro poder con cada mordida.", Burger, Smash, 1000L, "/images/burgers/El_Capo.png"),
                    new Menu(null, "Garden Punk", "Veggie rebelde con alcachofa crunchy, verdes frescos y mayonesa de ajo. Para los que comen verde sin ser aburridos.", Burger, Vegana, 1000L, "/images/burgers/Garden_Punk.jpg"),
                    new Menu(null, "La Bestia", "Triple cheddar, bacon y salsa secreta. Es rápida, intensa y no perdona.", Burger, Medallón, 1000L, "/images/burgers/La_Bestia.png"),
                    new Menu(null, "El Venerado", "Doble smash, montaña de bacon, cheddar y BBQ dulce. Un culto al cerdo que no perdona.", Burger, Smash, 1000L, "/images/burgers/El_Venerado.png"),
                    new Menu(null, "Extinción Smash", "Carnes prehistóricas, queso fundido y alioli. Tan brutal como una huella fósil.", Burger, Smash, 1000L, "/images/burgers/Extinción_Smash.png"),
                    new Menu(null, "Fuego Cruzado", "Doble carne, queso cheddar, cebolla morada, salsa picante. Te dispara directo al antojo.", Burger, Pollo, 1000L, "/images/burgers/Fuego_Cruzado.png"),
                    new Menu(null, "La Monster", "Cuádruple carne picada, cheddar en capas, bacon, cebolla crispy y mostaza fuerte. El final boss de las hamburguesas.", Burger, Medallón, 1000L, "/images/burgers/La_Monster.jpg"),
                    new Menu(null, "La Patrona", "Picante, poderosa y con estilo. Carne especiada, jalapeños, cheddar y guacamole. Ordena con respeto.", Burger, Medallón, 1000L, "/images/burgers/La_Patrona.jpg"),
                    new Menu(null, "Morena Mía", "Rúcula, queso suave, carne de waygu y cebolla dulce. Elegancia con sabor atrevido.", Burger, Medallón, 1000L, "/images/burgers/Morena_Mía.png"),
                    new Menu(null, "Porcopolis", "Medallón + huevo + bacón + cheddar. Un imperio de las burgers.", Burger, Medallón, 1000L, "/images/burgers/Porcopolis.png"),
                    new Menu(null, "Santa Smash", "Cheddar, lechuga, tomate y mayonesa. La santa trinidad de la hamburguesa bien hecha.", Burger, Smash, 1000L, "/images/burgers/Santa_Smash.png"),
                    new Menu(null, "Triple Crimen", "Tres carnes smash, tres quesos y un crimen perfecto de sabor. Imposible salir ileso.", Burger, Smash, 1000L, "/images/burgers/Triple_Crimen.png"),
                    new Menu(null, "Vinilo & Mostaza", "Revive los 50’s: pepinillos, ketchup, mostaza, cebolla morada, tomate y queso americano. Pura nostalgia entre panes.", Burger, Medallón, 1000L, "/images/burgers/Vinilo&Mostaza.png"),
                    new Menu(null, "Western Nights", "Estilo del viejo oeste: carne jugosa, queso suizo, tomate y salsa ranch. Clásico pero letal.", Burger, Medallón, 1000L, "/images/burgers/Western_Nights.png"),
                    new Menu(null, "Agua 1L", "Botella de agua de 1 litro", Bebida, Pollo, 1000L, "/images/burgers/La_Cazuela.png"),


                    ));
            System.out.println("Datos iniciales cargados");
        }
    }
}

