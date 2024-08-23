package org.solutis.controller;

import org.solutis.models_generico.AnimalMarinho;
import org.solutis.services.AnimalMarinhoService;

import java.util.List;

public class AnimalMarinhoController {
    AnimalMarinhoService animalMarinhoService;

    public AnimalMarinhoController() {
        this.animalMarinhoService = new AnimalMarinhoService();
    }

    public String ListaOrdenadaByEspecie(List<AnimalMarinho> lista) {
        List<String> listaOrdenadaNome = this.animalMarinhoService.getAnimalByEspecie(lista);
        System.out.println("------  Lista animais marinhos Ordenados por Especie ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisComeu(List<AnimalMarinho> lista) {
        List<String> listaOrdenadaNome = this.animalMarinhoService.getAnimalByMaisComeu(lista);
        System.out.println("------  Lista animais marinhos Ordenados por quem mais comeu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisDormiu(List<AnimalMarinho> lista) {
        List<String> listaOrdenadaNome = this.animalMarinhoService.getAnimalByMaisDormiu(lista);
        System.out.println("------  Lista animais marinhos Ordenados por quem mais dormiu ------");
        return String.join("\n", listaOrdenadaNome);
    }

    public String ListaOrdenadaByMaisAndou(List<AnimalMarinho> lista) {
        List<String> listaOrdenadaNome = this.animalMarinhoService.getAnimalByMaisAndou(lista);
        System.out.println("------  Lista animais marinhos Ordenados por quem mais Andou ------");
        return String.join("\n", listaOrdenadaNome);
    }
}
