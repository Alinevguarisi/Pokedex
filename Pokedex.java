
	import java.util.HashMap;
	import java.util.Map;

	public class Pokedex {
	    private Map<Integer, PokemonEntry> pokedexMap = new HashMap<Integer, PokemonEntry>();

	    private Pokedex() {
	        initializePokedex();
	    }

	    private static Pokedex instance = null;

	    public static Pokedex getInstance() {
	        if (instance == null) {
	            instance = new Pokedex();
	        }
	        return instance;
	    }

	    public void registerPokemonEntry(PokemonEntry pokemonEntry, boolean capture) {
	        pokemonEntry. setCapturado(capture);
	        int number = pokemonEntry.getPokemon().getNumero();
	        
	        if (capture) {
	            pokedexMap.put(number, pokemonEntry);
	        } else if (!pokedexMap.containsKey(number)) {
	            pokedexMap.put(number, new PokemonEntry(pokemonEntry.getPokemon()));
	        }
	    }

	    public PokemonEntry getPokemonByNumber(int number) {
	        return pokedexMap.get(number);
	    }

	    public String toString() {
	        StringBuilder pokedexMapString = new StringBuilder();

	        for (int number : pokedexMap.keySet()) {
	            pokedexMapString.append("[").append(number).append(" - ");

	            if (pokedexMap.get(number) != null) {
	                pokedexMapString.append(pokedexMap.get(number).toString());
	            } else {
	                pokedexMapString.append("Não Encontrado");
	            }

	            pokedexMapString.append("]\n");
	        }

	        return pokedexMapString.toString();
	    }

	    private void initializePokedex() {
	        for (int number : HashMapPokemon.getAllPokemon().keySet()) {
	            pokedexMap.put(number, null);
	        }
	    }

}
