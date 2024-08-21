package org.solutis;

import org.solutis.Enums.TipoAnimal;
import org.solutis.abstracts.AnimalAB;
import org.solutis.abstracts.AnimalTerrestreAB;
import org.solutis.models.*;
import org.solutis.modelsGenerico.AnimalAquatico;
import org.solutis.modelsGenerico.AnimalTerrestre;
import org.solutis.modelsGenerico.AnimalVoador;

import java.util.ArrayList;
import java.util.List;

import static org.solutis.Enums.TipoAnimal.*;

public class Main {
    public static void main(String[] args) {

        /*
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

         */
        List<AnimalAquatico> animaisAquaticos = new ArrayList<>();
        List<AnimalTerrestre> animaisTerrestres = new ArrayList<>();
        List<AnimalVoador> animaisVoadores = new ArrayList<>();


        // Instâncias de AnimalAquatico
        AnimalAquatico golfinho = new AnimalAquatico(animaisAquaticos, "Golfinho", "Golfinho Flipper", TipoAnimal.AQUATICO, 5, "Oceano", 2.5, 200);
        AnimalAquatico tubarao = new AnimalAquatico(animaisAquaticos, "Tubarão", "Tubarão Branco", TipoAnimal.AQUATICO, 10, "Oceano", 6.0, 1200);
        AnimalAquatico peixe = new AnimalAquatico(animaisAquaticos, "Peixe", "Nemo", TipoAnimal.AQUATICO, 1, "Oceano", 0.30, 0.300);
        AnimalAquatico polvo = new AnimalAquatico(animaisAquaticos, "Polvo", "Kraken", TipoAnimal.AQUATICO, 150, "Oceano", 40, 2500);
        golfinho.nadar(15);

        // Instâncias de AnimalTerrestre
        AnimalTerrestre cachorro = new AnimalTerrestre(animaisTerrestres, "Cachorro", "Rex", TipoAnimal.TERRESTRE, 3, "Doméstico", 4, 0.5, 25);
        AnimalTerrestre gato = new AnimalTerrestre(animaisTerrestres, "Gato", "Miau", TipoAnimal.TERRESTRE, 2, "Doméstico", 4, 0.4, 5);
        AnimalTerrestre elefante = new AnimalTerrestre(animaisTerrestres, "Elefante", "Dumbo", TipoAnimal.TERRESTRE, 25, "Selva", 4, 3.5, 5000);
        AnimalTerrestre leao = new AnimalTerrestre(animaisTerrestres, "Leão", "Simba", TipoAnimal.TERRESTRE, 7, "Savannah", 4, 1.2, 200);

        // Instâncias de AnimalVoador
        AnimalVoador pombo = new AnimalVoador(animaisVoadores, "Pombo", "Pombo Correio", TipoAnimal.VOADOR, 1, "Cidade", 2, 50, 0.3, 0.4);
        AnimalVoador aguia = new AnimalVoador(animaisVoadores, "Águia", "Águia Real", TipoAnimal.VOADOR, 5, "Montanhas", 2, 200, 1.0, 6.5);
        AnimalVoador falcao = new AnimalVoador(animaisVoadores, "Falcão", "Falcão Peregrino", TipoAnimal.VOADOR, 3, "Céu", 2, 120, 0.5, 1.2);
        AnimalVoador morcego = new AnimalVoador(animaisVoadores, "Morcego", "Batman", TipoAnimal.VOADOR, 4, "Caverna", 2, 70, 0.4, 0.3);

    }
}
