package org.solutis.models;

import org.solutis.abstracts.AnimalAB;

public class Leao extends AnimalAB {
    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O leao comeu " + quantComida + " unidade de comida");

    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O leao andou " + distancia + " metros");
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido += tempoDormido;
        System.out.println("O leao dormiu " + tempoDormido + " horas");
    }
}
