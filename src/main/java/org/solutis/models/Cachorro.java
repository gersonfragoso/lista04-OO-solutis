package org.solutis.models;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalAB;
import org.solutis.abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(String especie,String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantPatas, double altura, double peso) {
        super(especie,nome, tipoAnimal, idade, habitat, quantPatas, altura, peso);
        this.quantPatas = quantPatas;
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O cachorro comeu " + quantComida + " unidade de comida");

    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O cachorro andou " + distancia + " metros");
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido += tempoDormido;
        System.out.println("O cachorro dormiu " + tempoDormido + " horas");
    }

    @Override
    public void caminhar(int distancia) {
        mover(distancia);
    }
}
