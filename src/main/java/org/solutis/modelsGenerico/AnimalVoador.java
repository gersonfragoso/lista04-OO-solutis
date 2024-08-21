package org.solutis.modelsGenerico;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalVoadorAB;

import java.util.List;

public class AnimalVoador extends AnimalVoadorAB {

    public AnimalVoador(List<AnimalVoador>listaAnimaisVoadores,String especie,String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantAsas, int envergaduraAsa, double altura, double peso) {
        super(especie,nome, tipoAnimal, idade, habitat, quantAsas, envergaduraAsa, altura, peso);
        listaAnimaisVoadores.add(this);
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O "+ especie + " de nome "+ nome +" comeu " + quantComida + " unidade de comida");
    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O "+ especie + " de nome "+ nome +" voou " + distancia + " metros");
    }
    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido = tempoDormido;
        System.out.println("O "+ especie + " de nome "+ nome +" dormiu " + tempoDormido + " horas");

    }
    @Override
    public void voar(int distancia) {
        mover(distancia);

    }
    public String toString() {
        return "Animal Voador: \n" +
                "Especie = " + especie +"\n"+
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
