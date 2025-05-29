
public class PokemonEntry {
	    private Pokemon pokemon;
	    private double peso, altura;
	    private boolean capturado = false;

	    public PokemonEntry(Pokemon pokemon, double peso, double altura) {
	        this.pokemon = pokemon;
	        this.peso = peso;
	        this.altura = altura;
	    }

	    public PokemonEntry(Pokemon pokemon) {
	        this.pokemon = pokemon;
	    }

	    public boolean isCapturado() {
	        return capturado;
	    }

	    public void setCapturado(boolean capturado) {
	        this.capturado = capturado;
	    }

	    public Pokemon getPokemon() {
	        return pokemon;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public double getAltura() {
	        return altura;
	    }


	    public String toString() {
	        return "Pokemon: " + pokemon.getNome() + " | Peso: " + peso + " | Altura: " + altura + " | Capturado: " + (capturado ? "Sim" : "Não");
	    }
	}

