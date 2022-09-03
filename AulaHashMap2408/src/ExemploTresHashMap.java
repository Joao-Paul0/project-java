import java.util.*;

public class ExemploTresHashMap {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Map<String, infopessoas> caracteristicas = new HashMap<String, infopessoas>();
    Map<String, infoendereco> endereco = new HashMap<String, infoendereco>();

    int resposta = 0;

    while (resposta != 1) {

      System.out.print("Entre com o nome: ");
      String nome = input.nextLine();

      System.out.print("Entre com o peso: ");
      Double peso = Double.parseDouble(input.nextLine());

      System.out.print("Entre com a idade: ");
      Integer idade = Integer.parseInt(input.nextLine());

      System.out.print("Entre com o cep: ");
      Integer cep = Integer.parseInt(input.nextLine());

      System.out.print("Entre com o nï¿½mero da casa: ");
      Integer numero_casa = Integer.parseInt(input.nextLine());

      System.out.print("Entre com o nome da rua: ");
      String nome_rua = input.nextLine();

      caracteristicas.put(nome, new infopessoas(idade, peso));
      endereco.put(nome, new infoendereco(cep, numero_casa, nome_rua));

      System.out.print("1- sair, 2- continuar");
      resposta = Integer.parseInt(input.nextLine());

    }

    System.out.print("1-mostrar caracteristicas, 2- mostrar endereço");
    int opcao = Integer.parseInt(input.nextLine());

    if (opcao == 1) {
      System.out.print(caracteristicas);
    } else {
      System.out.print(endereco);
    }
  }

}

class infopessoas {

  Integer idade;
  Double peso;

  public infopessoas(Integer idade, Double peso) {
    this.idade = idade;
    this.peso = peso;
  }

  public String toString() {
    return "\nIdade: " + idade + "\nPeso: " + peso;
  }

}

class infoendereco {

  Integer cep;
  Integer numero_casa;
  String nome_rua;

  public infoendereco(Integer cep, Integer numero_casa, String nome_rua) {
    this.cep = cep;
    this.numero_casa = numero_casa;
    this.nome_rua = nome_rua;
  }

  public String toString() {
    return "\nCep: " + cep + "\nNumero casa: " + numero_casa + "\nNome rua: " + nome_rua;
  }

}