package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;

public  abstract class AnimalMarinhoAB extends AnimalAB{
    public AnimalMarinhoAB(String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal , idade, habitat, altura, peso);
    }

    public abstract void nadar(int distancia);

    @Override
    public String toString() {
        return "Animal Marinho: \n" +
                "Nome = " + nome + "\n" +
                "Tipo Animal = " + tipoAnimal + "\n" +
                "Idade = " + idade + "\n" +
                "Habitat = " + habitat + "\n" +
                "Altura = " + altura + "cm \n" +
                "Peso = " + peso +"g\n" +
                "Quantidade de comida = " + quantComida +"\n" +
                "Distancia percorrida = " + distancia +"\n" +
                "Tempo dormida = " + tempoDormido +"\n";
    }
}
