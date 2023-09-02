package list.OperacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private List<Item> itemList;

    public CarrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        carrinhoCompra.adicionarItem("Arroz", 20, 1);
        carrinhoCompra.adicionarItem("Feijâo", 8, 2);
        carrinhoCompra.adicionarItem("Açucar", 5, 6);
        carrinhoCompra.adicionarItem("Café", 15, 2);

        carrinhoCompra.exibirItens();

        carrinhoCompra.removerItem("Feijão");

        carrinhoCompra.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompra.calcularValorTotal());
    }
}
