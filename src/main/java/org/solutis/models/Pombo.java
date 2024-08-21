package org.solutis.models;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantidadeAssas, int envergaduraAssa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadeAssas, envergaduraAssa, altura, peso);
    }

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