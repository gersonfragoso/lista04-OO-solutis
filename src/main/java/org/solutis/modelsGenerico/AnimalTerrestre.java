package org.solutis.modelsGenerico;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalTerrestreAB;

import java.util.List;

public class AnimalTerrestre extends AnimalTerrestreAB {
    public AnimalTerrestre(List<AnimalTerrestre>listaAnimaisTerrestre,String especie,String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantPatas, double altura, double peso) {
        super(especie,nome, tipoAnimal, idade, habitat, quantPatas, altura, peso);
        listaAnimaisTerrestre.add(this);
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O "+ especie + " de nome "+ nome +" comeu " + quantComida + " unidade de comida");
    }

    @Override
    public void mover(int distancia) {
        this.distancia += distancia;
        System.out.println("O "+ especie + " de nome "+ nome +" caminhou " + distancia + " metros");
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido = tempoDormido;
        System.out.println("O "+ especie + " de nome "+ nome +" dormiu " + tempoDormido + " horas");
    }

    @Override
    public void caminhar(int distancia) {
        mover(distancia);
    }
    @Override
    public String toString() {
        return "Animal Terrestre: \n" +
                "Especie = " + especie +"\n"+
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
