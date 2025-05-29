public class Pokemon {

    private int numero;
    private String nome, categoria, descricao, tipo1, tipo2;

    public Pokemon(int numero, String nome, String categoria, String descricao, String tipo1, String tipo2) {
        this.numero = numero;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }
}
