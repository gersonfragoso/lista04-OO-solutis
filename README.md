# Solutis Desafio 04

## Orientação a Objetos Avançada em Java

Durante a realização deste desafio, consegui implementar todas as etapas propostas sem grandes dificuldades. No entanto, percebi que a necessidade de criar modelos específicos para cada tipo de animal (como Cachorro, Gato, Elefante, Leão, Pombo, e Peixe) poderia gerar um código mais difícil de manter.

Como desenvolvedor, acredito que essa abordagem não é ideal, pois exige muita manutenção. Assim, apesar de ter seguido as instruções e criado os modelos específicos para cada animal, também pensei em uma solução para melhorar o design.

### Solução Proposta

Uma das questões solicitava a criação das classes abstratas `AnimalMarinhoAB`, `AnimalVoadorAB` e `AnimalTerrestreAB`. Decidi, então, criar modelos mais genéricos para cada uma dessas classes abstratas. Desenvolvi as classes `AnimalMarinho`, `AnimalVoador` e `AnimalTerrestre`, adicionando duas variáveis extras: uma para a espécie do animal e outra para armazenar uma lista com todos os animais daquele tipo.

Com essa abordagem, ao criar um animal terrestre, por exemplo, ele pode representar qualquer tipo de animal terrestre. A lista permite manipulações utilizando streams, como filtrar animais por espécie ou aqueles que mais comeram, entre outras possibilidades. Isso torna o código mais genérico e melhora a estrutura orientada a objetos.

## Estrutura de Pacotes

O código foi organizado em pacotes da seguinte forma:

### `org.solutis`

- **`controller`**
  - Contém as classes que chamam os métodos de serviços.
  - `AnimalMarinhoController.java`
  - `AnimalTerrestreController.java`
  - `AnimalVoadorController.java`
  
- **`service`**
  - Contém as classes que manipulam as listas de animais.
  - `AnimalMarinhoService.java`
  - `AnimalTerrestreService.java`
  - `AnimalVoadorService.java`
  
- **`model-generico`**
  - Contém os modelos genéricos para cada tipo de animal, além dos métodos como `comer`, `mover` (caminhar, voar, nadar) e `dormir`, e métodos auxiliares como getters.
  - `AnimalMarinho.java`
  - `AnimalTerrestre.java`
  - `AnimalVoador.java`
  
- **`interfaces`**
  - Contém a interface conforme solicitado.
  - `AnimalIF.java`
  
- **`enums`**
  - Contém os enums, sendo que atualmente só há um: `TipoAnimal`.
  - `TipoAnimal.java`
  
- **`abstracts`**
  - Contém as classes abstratas.
  - `AnimalAB.java`
  - `AnimalTerrestreAB.java`
  - `AnimalMarinhoAB.java`
  - `AnimalVoadorAB.java`
  
- **`Main`**
  - Contém testes para cada função e a inicialização dos métodos, com todos os trechos comentados.
