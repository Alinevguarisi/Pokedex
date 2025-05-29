
public class EncontroPokemon {

	    private static PokemonEntry encontradoPokemon;
	    private static Pokedex pokedex = Pokedex.getInstance();

	    
	    public static void RealizarEncontro() {
	        encontradoPokemon = gerarPokemonAleatorio();
	    }

	    public static boolean TentarCapturar() {
	        double chanceCaptura = Math.random();
	        boolean capturado = chanceCaptura < 0.5;
	        pokedex.registerPokemonEntry(encontradoPokemon, capturado);
	        return capturado;
	    }

	    public static PokemonEntry getEncontradoPokemon() {
	        return encontradoPokemon;
	    }

	    private static PokemonEntry gerarPokemonAleatorio() {
	        int numeroAleatorio = (int) (Math.random() * HashMapPokemon.getAllPokemon().size() + 1);
	        int pesoAleatorio = (int) (Math.random() * 10) + 1;
	        int alturaAleatoria = (int) (Math.random() * 10) + 1;
	        return new PokemonEntry(HashMapPokemon.getAllPokemon().get(numeroAleatorio), pesoAleatorio, alturaAleatoria);
	    }

		public static PokemonEntry getPokemonEntry() {
			// TODO Auto-generated method stub
			return null;
		}
	}


