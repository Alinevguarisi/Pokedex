import java.util.HashMap;
import java.util.Map;

public class HashMapPokemon {
	private static Map<Integer, Pokemon> initializePokemonMap() {
	    Map<Integer, Pokemon> pokemonMap = new HashMap<>();
	    
	    pokemonMap.put(1, new Pokemon(1, "Vegisaur", "Semente de Planta", "Ele carrega uma semente de planta nas costas desde que nasceu e ela cresce lentamente.", "Tipo Grama", "Tipo Veneno"));
	    pokemonMap.put(2, new Pokemon(2, "Floralith", "Semente de Planta", "Quando a semente em suas costas cresce, ele fica exausto de carregá-la.", "Tipo Grama", "Tipo Veneno"));
	    pokemonMap.put(3, new Pokemon(3, "Blossomander", "Flor nas Costas", "A flor em suas costas floresce absorvendo energia solar, mas ele se move lentamente.", "Tipo Grama", "Tipo Veneno"));
	    pokemonMap.put(4, new Pokemon(4, "Pyrolizard", "Lagarto de Fogo", "Ele adora o calor e, quando chove, o vapor sai da ponta da cauda.", "Tipo Fogo", ""));
	    pokemonMap.put(5, new Pokemon(5, "Aquatortle", "Tartaruga Aquática", "Aquatortle é um Pokémon aquático que dispara jatos d'água de sua boca.", "Tipo Água", ""));
	    pokemonMap.put(6, new Pokemon(6, "Aquaticlaw", "Tartaruga Aquática", "Aquaticlaw é a evolução do Aquatortle e um nadador especialista.", "Tipo Água", ""));
	    pokemonMap.put(7, new Pokemon(7, "Hydroblast", "Tartaruga Aquática", "Hydroblast é a forma final da evolução do Aquatortle, com canhões de água nas costas.", "Tipo Água", ""));
	    pokemonMap.put(8, new Pokemon(8, "Volticat", "Rato Elétrico", "Volticat é um famoso Pokémon elétrico.", "Tipo Elétrico", ""));
	    pokemonMap.put(9, new Pokemon(9, "Melodyball", "Bola de Pelo Cantora", "Melodyball canta uma canção que faz as pessoas dormirem.", "Tipo Normal", "Tipo Fada"));
	    pokemonMap.put(10, new Pokemon(10, "Musclemon", "Super Forte", "Musclemon possui uma força incrível e treina constantemente para ficar mais forte.", "Tipo Lutador", ""));
	    
	    return pokemonMap;
	}

	private static Map<Integer, Pokemon> pokemonMap = initializePokemonMap();

	public static Map<Integer, Pokemon> getAllPokemon() {
	    return pokemonMap;
	}

}
