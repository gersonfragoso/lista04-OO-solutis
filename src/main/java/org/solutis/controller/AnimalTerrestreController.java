package org.solutis.controller;

import org.solutis.models_generico.AnimalMarinho;
import org.solutis.models_generico.AnimalTerrestre;
import org.solutis.services.AnimalMarinhoService;
import org.solutis.services.AnimalTerrestreService;

import java.util.List;

public class AnimalTerrestreController {
    AnimalTerrestreService animalTerrestreService;

    public AnimalTerrestreController() {
        this.animalTerrestreService = new AnimalTerrestreService();
    }

    public String ListaOrdenadaByEspecie(List<AnimalTerrestre> lista) {
        List<String> listaOrdenadaNome = this.animalTerrestreService.getAnimalByEspecie(lista);
        System.out.println("------  Lista animais terrestre Ordenados por Especie ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisComeu(List<AnimalTerrestre> lista) {
        List<String> listaOrdenadaNome = this.animalTerrestreService.getAnimalByMaisComeu(lista);
        System.out.println("------  Lista animais terrestre Ordenados por quem mais comeu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisDormiu(List<AnimalTerrestre> lista) {
        List<String> listaOrdenadaNome = this.animalTerrestreService.getAnimalByMaisDormiu(lista);
        System.out.println("------  Lista animais terrestre Ordenados por quem mais dormiu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisAndou(List<AnimalTerrestre> lista) {
        List<String> listaOrdenadaNome = this.animalTerrestreService.getAnimalByMaisAndou(lista);
        System.out.println("------  Lista animais terrestre Ordenados por quem mais Andou ------");
        return String.join("\n", listaOrdenadaNome);
    }
}

