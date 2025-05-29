# Pokedex

Simulador de Encontro e Batalha Pokémon
Este projeto é uma simulação simples de um jogo em Java inspirado no universo Pokémon. Ele permite ao jogador encontrar Pokémon, adicioná-los à sua equipe, visualizar uma Pokédex e realizar batalhas. O sistema é modularizado em diversas classes, facilitando a manutenção e extensão do código.

# Funcionalidades:

- Captura de Pokémon: Simulação de encontros aleatórios com Pokémon que podem ser capturados e adicionados à equipe do jogador.

- Equipe do Jogador: Gerenciamento de uma equipe com limite de Pokémon.

- Pokédex: Registro de todos os Pokémon encontrados, com suas respectivas entradas.

- Sistema de Batalha (básico): Possibilidade de batalhas entre Pokémon.

- Armazenamento em HashMap: Utilização de HashMap para gerenciamento eficiente da Pokédex.

# Estrutura do Projeto
Main.java: Classe principal que inicializa o jogo e a interface de interação com o usuário.

Jogo.java: Gerencia o ciclo principal do jogo e a lógica de controle.

Pokemon.java: Representa um Pokémon, incluindo atributos como nome, tipo, nível e HP.

PokemonEntry.java: Estrutura utilizada pela Pokédex para armazenar informações sobre encontros com Pokémon.

Equipe.java: Gerencia a equipe de Pokémon do jogador.

Pokedex.java: Responsável pelo registro dos Pokémon encontrados usando um HashMap.

HashMapPokemon.java: Implementação auxiliar para simular a estrutura de armazenamento da Pokédex.

EncontroPokemon.java: Simula os encontros aleatórios com Pokémon selvagens.

# Requisitos
Java 8 ou superior

IDE compatível (Eclipse, IntelliJ, VS Code) ou compilação via terminal
