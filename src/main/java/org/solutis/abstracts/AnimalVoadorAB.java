package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;

public abstract class AnimalVoadorAB extends AnimalAB{
    public AnimalVoadorAB(String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantAsas, int envergaduraAsa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantAsas = quantAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voar(int distancia);
    public String toString() {
        return "Animal Voador: \n" +
                "Nome = " + nome + "\n" +
                "Tipo Animal = " + tipoAnimal + "\n" +
                "Idade = " + idade +
                "Habitat = " + habitat + "\n" +
                "Quantidade de asas = "+ quantAsas+"\n" +
                "Envergadura = "+ envergaduraAsa+"\n" +
                "Altura = " + altura + "\n" +
                "Peso = " + peso +"\n" +
                "Quantidade de comida = " + quantComida +"\n" +
                "Distancia percorrida = " + distancia +"\n" +
                "Tempo dormida = " + tempoDormido +"\n";
    }
}
