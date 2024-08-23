package org.solutis.models_generico;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalMarinhoAB;

import java.util.List;

public class AnimalMarinho extends AnimalMarinhoAB {
    AnimalMarinho animalMarinho;

    public AnimalMarinho(List<AnimalMarinho> listaAnimaisAquaticos, String especie, String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(especie, nome, tipoAnimal, idade, habitat, altura, peso);
        listaAnimaisAquaticos.add(this);
    }

    @Override
    public void comer(int quantComida) {
        this.quantComida += quantComida;
        System.out.println("O " + especie + " de nome " + nome + " comeu " + quantComida + " unidade de comida");
    }

    boolean chamouPeloOmetodoCerto = false;

    @Override
    public void mover(int distancia) {
        if (chamouPeloOmetodoCerto) {
            this.distancia += distancia;
            System.out.println("O " + especie + " de nome " + nome + " nadou " + distancia + " metros");
            chamouPeloOmetodoCerto = false;
        } else {
            System.out.println("Você precisar chamar pelo o metodo nadar. Para o " + this.getNome() + " da especie " + getEspecie() + " possar se mover.");
        }
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido = tempoDormido;
        System.out.println("O " + especie + "de nome " + nome + " dormiu " + tempoDormido + " horas");

    }

    @Override
    public void nadar(int distancia) {
        chamouPeloOmetodoCerto = true;
        mover(distancia);
    }


    public String getNome() {
        return this.nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public int getQuantComida() {
        return this.quantComida;
    }

    public int getQuantTempoDormido() {
        return this.tempoDormido;
    }

    public int getDistanciaPercorrida() {
        return this.distancia;
    }

    @Override
    public String toString() {
        return "Animal Marinho: \n" +
                "Especie = " + especie + "\n" +
                "Nome = " + nome + "\n" +
                "Tipo Animal = " + tipoAnimal + "\n" +
                "Idade = " + idade + "\n" +
                "Habitat = " + habitat + "\n" +
                "Altura = " + altura + "cm \n" +
                "Peso = " + peso + "g\n" +
                "Quantidade de comida = " + quantComida + "\n" +
                "Distancia percorrida = " + distancia + "\n" +
                "Tempo dormida = " + tempoDormido + "\n";
    }
}
