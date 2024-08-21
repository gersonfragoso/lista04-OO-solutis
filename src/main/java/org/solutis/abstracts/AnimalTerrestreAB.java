package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;

public abstract class AnimalTerrestreAB extends AnimalAB{
    public AnimalTerrestreAB(String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantPatas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantPatas = quantPatas;
    }

    public abstract void caminhar(int distancia);

    @Override
    public String toString() {
        return "Animal Terrestre: \n" +
                "Nome = " + nome + "\n" +
                "Tipo Animal = " + tipoAnimal + "\n" +
                "Idade = " + idade +
                "Habitat = " + habitat + "\n" +
                "Quantidade de patas = "+ quantPatas+"\n" +
                "Altura = " + altura + "metros\n" +
                "Peso = " + peso +"kg\n" +
                "Quantidade de comida = " + quantComida +"\n" +
                "Distancia percorrida = " + distancia +"\n" +
                "Tempo dormida = " + tempoDormido +"\n";
    }
}
