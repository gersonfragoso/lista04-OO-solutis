package org.solutis;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalAB;
import org.solutis.abstracts.AnimalTerrestreAB;
import org.solutis.models.*;

import static org.solutis.Enums.TipoAnimal.*;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex",TERRESTRE, 5, "domestico",4, 0.6, 15);
        cachorro.comer(5);
        cachorro.caminhar(10);
        cachorro.dormir(8);
        System.out.println();

        Gato gato = new Gato("Nami", TERRESTRE, 3,"domestico",4,0.6, 1);
        gato.comer(5);
        gato.caminhar(10);
        gato.dormir(8);
        System.out.println();

        Elefante elefante = new Elefante("Dumbo", TERRESTRE,15,"Savana",4,5,2);
        elefante.comer(5);
        elefante.caminhar(10);
        elefante.dormir(8);
        System.out.println();

        Leao leao = new Leao("Simba",TERRESTRE,4,"Savana",4,2,300);
        leao.comer(5);
        leao.caminhar(10);
        leao.dormir(8);
        System.out.println();


        Peixe peixe = new Peixe("Nemo",AQUATICO,1,"Mar",2,100);
        peixe.nadar(15);
        peixe.comer(8);
        peixe.dormir(8);
        System.out.println();


        Pombo pombo = new Pombo("Popo",VOADOR,1,"Cidade",2,40,20,300);
        pombo.voar(15);
        pombo.comer(5);
        pombo.dormir(8);
        System.out.println();

        System.out.println(cachorro.toString());
        System.out.println(gato.toString());
        System.out.println(elefante.toString());
        System.out.println(leao.toString());
        System.out.println(peixe.toString());
        System.out.println(pombo.toString());

    }
}
