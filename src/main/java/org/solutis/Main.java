package org.solutis;

import org.solutis.Enums.TipoAnimal;
import org.solutis.controller.AnimalMarinhoController;
import org.solutis.controller.AnimalTerrestreController;
import org.solutis.controller.AnimalVoadorController;
import org.solutis.models_generico.AnimalMarinho;
import org.solutis.models_generico.AnimalTerrestre;
import org.solutis.models_generico.AnimalVoador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AnimalMarinho> animaisAquaticos = new ArrayList<>();
        List<AnimalTerrestre> animaisTerrestres = new ArrayList<>();
        List<AnimalVoador> animaisVoadores = new ArrayList<>();
        //Iniciando as controller dos metodos que coloquei a mais
        AnimalMarinhoController animal = new AnimalMarinhoController();
        AnimalTerrestreController animal1 = new AnimalTerrestreController();
        AnimalVoadorController animal2 = new AnimalVoadorController();

        // Instâncias de AnimalAquatico
        AnimalMarinho golfinho = new AnimalMarinho(animaisAquaticos, "Golfinho", "Golfinho Flipper", TipoAnimal.AQUATICO, 5, "Oceano", 2.5, 200);
        AnimalMarinho golfinho2 = new AnimalMarinho(animaisAquaticos, "Golfinho", "Chico Bento", TipoAnimal.AQUATICO, 2, "Oceano", 1.7, 140);
        AnimalMarinho tubarao = new AnimalMarinho(animaisAquaticos, "Tubarão", "Tubarão Branco", TipoAnimal.AQUATICO, 10, "Oceano", 6.0, 1200);
        AnimalMarinho peixe = new AnimalMarinho(animaisAquaticos, "Peixe", "Nemo", TipoAnimal.AQUATICO, 1, "Oceano", 0.30, 0.300);
        AnimalMarinho polvo = new AnimalMarinho(animaisAquaticos, "Polvo", "Kraken", TipoAnimal.AQUATICO, 150, "Oceano", 40, 2500);
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

        System.out.println(" Testando o metodo comer: ");
        //Primeiro testar o metodo comida(Vou testar apenas para esse mas todos estão funcionando)
        golfinho.comer(100);
        tubarao.comer(300);
        peixe.comer(50);
        polvo.comer(1000);
        peixe.mover(20);
        polvo.nadar(20);
        polvo.mover(20);
        System.out.println();

        //Agora o metodo dormir(Vou testar apenas para esse mas todos estão funcionando)
        System.out.println(" Testando o metodo dormir: ");
        cachorro.dormir(5);
        gato.dormir(12);
        elefante.dormir(11);
        leao.dormir(9);
        System.out.println();

        //Agora o metodo voar(Vou testar apenas para esse mas todos estão funcionando)
        System.out.println(" Testando o metodo voar: ");
        pombo.voar(500);
        aguia.voar(1200);
        falcao.voar(1000);
        morcego.voar(150);
        System.out.println();

        System.out.println(animal.ListaOrdenadaByEspecie(animaisAquaticos));
        System.out.println(animal.ListaOrdenadaByMaisComeu(animaisAquaticos));
        System.out.println(animal1.ListaOrdenadaByMaisDormiu(animaisTerrestres));
        System.out.println(animal2.ListaOrdenadaByMaisAndou(animaisVoadores));

        //Escrevi isso depois que terminei a lista antes de fazer as alterações pra melhorar o codigo
        //isso literalmente mostra que testei todas as funções antes de fazer minhas alterações
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
    }
}
