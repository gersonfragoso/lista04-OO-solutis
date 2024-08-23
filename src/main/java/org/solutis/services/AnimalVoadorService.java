package org.solutis.services;

import org.solutis.models_generico.AnimalVoador;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalVoadorService {
    public List<String> getAnimalByEspecie(List<AnimalVoador> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalVoador::getEspecie))
                .map(animal -> "Especie: " + animal.getEspecie() + ", Nome: " + animal.getNome())
                .collect(Collectors.toList());
    }

    public List<String> getAnimalByMaisComeu(List<AnimalVoador> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalVoador::getQuantComida))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Quantidade de comida: " + animal.getQuantComida())
                .collect(Collectors.toList()).reversed();
    }

    public List<String> getAnimalByMaisDormiu(List<AnimalVoador> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalVoador::getQuantTempoDormido))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Tempo dormido: " + animal.getQuantTempoDormido())
                .collect(Collectors.toList()).reversed();
    }

    public List<String> getAnimalByMaisAndou(List<AnimalVoador> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalVoador::getDistanciaPercorrida))
                .map(animal -> " Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Distancia percorrida: " + animal.getDistanciaPercorrida())
                .collect(Collectors.toList()).reversed();
    }
}
