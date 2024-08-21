package org.solutis.models;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalMarinhoAB;


public class Peixe extends AnimalMarinhoAB {
    public Peixe(String especie,String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(especie,nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void comer(int quantidade) {
        this.quantComida += quantidade;
        System.out.println("O peixe comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O peixe nadou " + distancia + " metros.");

    }

    @Override
    public void dormir(int horas) {
        this.tempoDormido += horas;
        System.out.println("O peixe dormiu " + horas + " horas.");
    }

    @Override
    public void nadar(int distancia) {
        mover(distancia);
    }
}
