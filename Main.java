import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = Pokedex.getInstance();
        Equipe equipe = Equipe.getInstance();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Ver Pokedex");
            System.out.println("2 - Ver Equipe");
            System.out.println("3 - Encontrar um Pokémon");
            System.out.println("4 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(pokedex.toString());
                    break;
                case 2:
                    System.out.println(equipe.toString());
                    break;
                case 3:
                    EncontroPokemon.RealizarEncontro();
                    System.out.println("Um " + EncontroPokemon.getEncontradoPokemon().getPokemon().getNome() + " selvagem apareceu!");
                    System.out.println("Tentar capturar? (S/N)");
                    String escolha = scanner.next();
                    if (escolha.equalsIgnoreCase("S")) {
                        if (EncontroPokemon.TentarCapturar()) {
                            System.out.println("Pokémon capturado!");
                            System.out.println("Deseja adicionar o Pokémon à sua equipe? (S/N)");
                            String escolha2 = scanner.next();
                            if (escolha2.equalsIgnoreCase("S")) {
                                try {
                                    Equipe.getInstance().adicionarPokemon(EncontroPokemon.getPokemonEntry());
                                    System.out.println("Pokémon adicionado à equipe!");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("Deseja substituir um Pokémon da equipe? (S/N)");
                                    String escolha3 = scanner.next();
                                    if (escolha3.equalsIgnoreCase("S")) {
                                        System.out.println(equipe.toString());
                                        System.out.println("Escolha o índice do Pokémon a ser substituído: ");
                                        int indice = scanner.nextInt();
                                        try {
                                            Equipe.getInstance().substituirPokemon(indice, EncontroPokemon.getPokemonEntry());
                                            System.out.println("Pokémon substituído!");
                                        } catch (Exception e2) {
                                            System.out.println(e2.getMessage());
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("Pokémon fugiu!");
                        }
                    }
                    else {
                        System.out.println("Você fugiu da batalha!");
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }
}
