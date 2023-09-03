package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {

    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Pessoa> ordenarPorAltura() {

    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("Aline", 45, 1.63);
    ordenacaoPessoas.adicionarPessoa("Daniel", 25, 1.78);
    ordenacaoPessoas.adicionarPessoa("Joaquim", 50, 1.70);
    ordenacaoPessoas.adicionarPessoa("Ragna", 68, 1.00);

    System.out.println(ordenacaoPessoas.pessoaList);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
