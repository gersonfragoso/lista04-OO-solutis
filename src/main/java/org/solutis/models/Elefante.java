package org.solutis.models;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalAB;
import org.solutis.abstracts.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {
    public Elefante(String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
    }

    @Override
    public void caminhar(int distancia) {
        mover(distancia);
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O elefante comeu " + quantComida + " unidade de comida");

    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O elefante andou " + distancia + " metros");
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido += tempoDormido;
        System.out.println("O elefante dormiu " + tempoDormido + " horas");
    }
}
