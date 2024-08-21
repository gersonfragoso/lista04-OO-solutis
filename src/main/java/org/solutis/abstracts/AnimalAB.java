package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;
import org.solutis.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected TipoAnimal tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantPatas;
    protected int quantAsas;
    protected int envergaduraAsa;
    protected double altura;
    protected double peso;
    protected int quantComida;
    protected int distancia;
    protected  int tempoDormido;

    public AnimalAB(String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
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
