package org.solutis.controller;

import org.solutis.models_generico.AnimalTerrestre;
import org.solutis.models_generico.AnimalVoador;
import org.solutis.services.AnimalTerrestreService;
import org.solutis.services.AnimalVoadorService;

import java.util.List;

public class AnimalVoadorController {
    AnimalVoadorService animalVoadorService;

    public AnimalVoadorController() {
        this.animalVoadorService = new AnimalVoadorService();
    }

    public String ListaOrdenadaByEspecie(List<AnimalVoador> lista) {
        List<String> listaOrdenadaNome = this.animalVoadorService.getAnimalByEspecie(lista);
        System.out.println("------  Lista animais voadores Ordenados por Especie ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisComeu(List<AnimalVoador> lista) {
        List<String> listaOrdenadaNome = this.animalVoadorService.getAnimalByMaisComeu(lista);
        System.out.println("------  Lista animais voadores Ordenados por quem mais comeu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisDormiu(List<AnimalVoador> lista) {
        List<String> listaOrdenadaNome = this.animalVoadorService.getAnimalByMaisDormiu(lista);
        System.out.println("------  Lista animais voadores Ordenados por quem mais dormiu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisAndou(List<AnimalVoador> lista) {
        List<String> listaOrdenadaNome = this.animalVoadorService.getAnimalByMaisAndou(lista);
        System.out.println("------  Lista animais voadores Ordenados por quem mais Andou ------");
        return String.join("\n", listaOrdenadaNome);
    }
}
