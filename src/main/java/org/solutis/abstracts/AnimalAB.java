package org.solutis.abstracts;

import org.solutis.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected int quantComida;
    protected int distancia;
    protected int tempoDormido;

    public AnimalAB() {
        this.quantComida = 0;
        this.distancia = 0;
        this.tempoDormido = 0;
    }

    @Override
    public abstract void comer(int quantComida);
    @Override
    public abstract void mover(int distancia);
    @Override
    public abstract void dormir(int tempoDormido);
}
