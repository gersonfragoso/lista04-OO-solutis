package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;

public abstract class AnimalTerrestreAB extends AnimalAB {
    public AnimalTerrestreAB(String especie, String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantPatas, double altura, double peso) {
        super(especie, nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantPatas = quantPatas;
    }

    public abstract void caminhar(int distancia);
}
