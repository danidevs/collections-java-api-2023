package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Feijão");
        conjuntoLinguagens.adicionarPalavra("Arroz");
        conjuntoLinguagens.adicionarPalavra("Macarrão");
        conjuntoLinguagens.adicionarPalavra("Óleo");
        conjuntoLinguagens.adicionarPalavra("Açucar");
        conjuntoLinguagens.adicionarPalavra("Café");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("òleo");
        conjuntoLinguagens.exibirPalavrasUnicas();

        System.out
                .println("O ingrediente  'Feijão' está no carrinho? " + conjuntoLinguagens.verificarPalavra("Feijão"));
        System.out.println("O ingrediente  'Arroz' está no carrinho? " + conjuntoLinguagens.verificarPalavra("Arroz"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
