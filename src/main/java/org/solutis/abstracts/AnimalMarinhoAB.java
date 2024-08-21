package org.solutis.abstracts;

import org.solutis.Enums.TipoAnimal;

public  abstract class AnimalMarinhoAB extends AnimalAB{
    public AnimalMarinhoAB(String especie,String nome, TipoAnimal tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(especie,nome, tipoAnimal , idade, habitat, altura, peso);
    }

    public abstract void nadar(int distancia);

}
