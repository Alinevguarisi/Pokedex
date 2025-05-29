import java.util.ArrayList;

public class Equipe {

	    private ArrayList<PokemonEntry> equipe = new ArrayList<PokemonEntry>();
	    private final float TEAM_SIZE = 6;

	   
	    private Equipe() {
	    }

	    private static Equipe instance = null;

	    public static Equipe getInstance() {
	        if (instance == null) {
	            instance = new Equipe();
	        }
	        return instance;
	    }

	    public void adicionarPokemon(PokemonEntry pokemonEntry) throws Exception {
	        if (equipe.size() < TEAM_SIZE) {
	            equipe.add(pokemonEntry);
	        } else {
	            throw new Exception("Equipe cheia!");
	        }
	    }

	    public void substituirPokemon(int index, PokemonEntry pokemonEntry) throws Exception {
	        if (index <= 0 || index > equipe.size()) {
	            throw new Exception("Índice inválido!");
	        }
	        equipe.set(index - 1, pokemonEntry);
	    }

	    public String toString() {
	        String equipeString = "";
	        for (int i = 0; i < equipe.size(); i++) {
	            equipeString += "[" + (i + 1) + " - " + equipe.get(i).toString() + "]\n";
	        }
	        return equipeString;
	    }
	}

	

