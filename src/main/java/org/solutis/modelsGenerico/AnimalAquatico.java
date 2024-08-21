package org.solutis.modelsGenerico;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalAB;
import org.solutis.abstracts.AnimalMarinhoAB;

import java.util.List;

public class AnimalAquatico extends AnimalMarinhoAB {

    public AnimalAquatico(List<AnimalAquatico> listaAnimaisAquaticos, String especie, String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(especie,nome, tipoAnimal, idade, habitat, altura, peso);
        listaAnimaisAquaticos.add(this);
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O"+ especie + "de nome "+ nome +" comeu " + quantComida + " unidade de comida");
    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O"+ especie + "de nome "+ nome +" nadou " + distancia + " metros");
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido = tempoDormido;
        System.out.println("O"+ especie + "de nome "+ nome +" dormiu " + tempoDormido + " horas");

    }

    @Override
    public void nadar(int distancia) {
        mover(distancia);
    }

    @Override
    public String toString() {
        return "Animal Marinho: \n" +
                "Especie = " + especie +"\n"+
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
