package org.solutis.models;

import org.solutis.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    @Override
    public void comer(int quantidade) {
        this.quantComida += quantidade;
        System.out.println("O pombo comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void mover(int distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.tempoDormido += horas;
        System.out.println("O pombo dormiu " + horas + " horas.");
    }

    @Override
    public void voar(int distancia) {
        this.distancia += distancia;
        System.out.println("O pombo voou " + distancia + " metros.");
    }
}