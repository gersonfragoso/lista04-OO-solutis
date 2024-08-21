package org.solutis.models;

import org.solutis.abstracts.AnimalMarinhoAB;


public class Peixe extends AnimalMarinhoAB {
    @Override
    public void comer(int quantidade) {
        this.quantidadeDeComida += quantidade;
        System.out.println("O peixe comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void mover(int distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.tempoDormido += horas;
        System.out.println("O peixe dormiu " + horas + " horas.");
    }

    @Override
    public void nadar(int distancia) {
        this.distancia += distancia;
        System.out.println("O peixe nadou " + distancia + " metros.");
    }
}
