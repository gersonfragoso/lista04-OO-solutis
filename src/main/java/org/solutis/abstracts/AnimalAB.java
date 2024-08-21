package org.solutis.abstracts;

import org.solutis.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    private int quantComida;
    private int distancia;
    private int tempoDormido;

    public AnimalAB() {
        this.quantComida = 0;
        this.distancia = 0;
        this.tempoDormido = 0;
    }

    public abstract void comer(int quantComida);

    public abstract void mover(int distancia);

    public abstract void dormir(int tempoDormido);
}
