package org.solutis.services;

import org.solutis.models_generico.AnimalMarinho;
import org.solutis.models_generico.AnimalTerrestre;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalTerrestreService {
    public List<String> getAnimalByEspecie(List<AnimalTerrestre> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalTerrestre::getEspecie))
                .map(animal -> "Especie: " + animal.getEspecie() + ", Nome: " + animal.getNome())
                .collect(Collectors.toList());
    }

    public List<String> getAnimalByMaisComeu(List<AnimalTerrestre> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalTerrestre::getQuantComida))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Quantidade de comida: " + animal.getQuantComida())
                .collect(Collectors.toList()).reversed();
    }

    public List<String> getAnimalByMaisDormiu(List<AnimalTerrestre> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalTerrestre::getQuantTempoDormido))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Tempo dormido: " + animal.getQuantTempoDormido())
                .collect(Collectors.toList()).reversed();
    }

    public List<String> getAnimalByMaisAndou(List<AnimalTerrestre> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalTerrestre::getDistanciaPercorrida))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Distancia percorrida: " + animal.getDistanciaPercorrida())
                .collect(Collectors.toList()).reversed();
    }
}
