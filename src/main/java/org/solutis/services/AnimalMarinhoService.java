package org.solutis.services;

import org.solutis.models_generico.AnimalMarinho;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalMarinhoService {

    public List<String> getAnimalByEspecie(List<AnimalMarinho> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalMarinho::getEspecie))
                .map(animal -> "Especie: " + animal.getEspecie() + ", Nome: " + animal.getNome())
                .collect(Collectors.toList());
    }

    public List<String> getAnimalByMaisComeu(List<AnimalMarinho> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalMarinho::getQuantComida))
                .map(animal -> "Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Quantidade de comida: " + animal.getQuantComida())
                .collect(Collectors.toList()).reversed();
    }

    public List<String> getAnimalByMaisDormiu(List<AnimalMarinho> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalMarinho::getQuantTempoDormido))
                .map(animal -> "Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Tempo dormido: " + animal.getQuantTempoDormido())
                .collect(Collectors.toList());
    }

    public List<String> getAnimalByMaisAndou(List<AnimalMarinho> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(AnimalMarinho::getDistanciaPercorrida))
                .map(animal -> "Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Distancia percorrida: " + animal.getDistanciaPercorrida())
                .collect(Collectors.toList());
    }
}
