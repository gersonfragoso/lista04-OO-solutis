package org.solutis.models_generico;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalVoadorAB;

import java.util.List;

public class AnimalVoador extends AnimalVoadorAB {

    public AnimalVoador(List<AnimalVoador> listaAnimaisVoadores, String especie, String nome, TipoAnimal tipoAnimal, int idade, String habitat, int quantAsas, int envergaduraAsa, double altura, double peso) {
        super(especie, nome, tipoAnimal, idade, habitat, quantAsas, envergaduraAsa, altura, peso);
        listaAnimaisVoadores.add(this);
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
            System.out.println("O " + especie + "de nome " + nome + " nadou " + distancia + " metros");
            chamouPeloOmetodoCerto = false;
        } else {
            System.out.println("Você precisar chamar pelo o metodo voar. Para o " + this.getNome() + " da especie " + getEspecie() + " possar se mover.");
        }
    }

    @Override
    public void dormir(int tempoDormido) {
        this.tempoDormido = tempoDormido;
        System.out.println("O " + especie + " de nome " + nome + " dormiu " + tempoDormido + " horas");

    }

    @Override
    public void voar(int distancia) {
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

    public String toString() {
        return "Animal Voador: \n" +
                "Especie = " + especie + "\n" +
                "Nome = " + nome + "\n" +
                "Tipo Animal = " + tipoAnimal + "\n" +
                "Idade = " + idade +
                "Habitat = " + habitat + "\n" +
                "Quantidade de asas = " + quantAsas + "\n" +
                "Envergadura = " + envergaduraAsa + "\n" +
                "Altura = " + altura + "\n" +
                "Peso = " + peso + "\n" +
                "Quantidade de comida = " + quantComida + "\n" +
                "Distancia percorrida = " + distancia + "\n" +
                "Tempo dormida = " + tempoDormido + "\n";
    }
}
