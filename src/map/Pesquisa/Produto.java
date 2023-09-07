package map.Pesquisa;

public class Produto {
    private String nome;
    private double preco;
    private int quamtidade;
    private String quantidade;

    public Produto(String nome, double preco, int quamtidade) {
        this.nome = nome;
        this.preco = preco;
        this.quamtidade = quamtidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quamtidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}
