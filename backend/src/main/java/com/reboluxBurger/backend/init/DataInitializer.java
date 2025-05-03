package com.reboluxBurger.backend.init;

import com.reboluxBurger.backend.entity.Menu;
import com.reboluxBurger.backend.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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
                    new Menu(null, "nombre", "descripcion", Burger, Smash, 1000L, ""),
                    new Menu(null, "Furia Urbana", "Explosión callejera de doble carne, cheddar fundido, bacon crujiente y cebolla caramelizada. Una bomba de sabor sin reglas.", Burger, Medallón, 1000L),
                    new Menu(null, "El Capo", "Carne smash doble, doble queso, cebolla morada, pepinillos y alioli mafioso. Puro poder con cada mordida.", Burger, Smash, 1000L),
                    new Menu(null, "Garden Punk", "Veggie rebelde con alcachofa crunchy, verdes frescos y mayonesa de ajo. Para los que comen verde sin ser aburridos.", Burger, Vegana, 1000L),
                    new Menu(null, "nombre", "descripcion", Burger, Smash, 1000L),


                    ));
            System.out.println("Datos iniciales cargados");
        }
    }
}

