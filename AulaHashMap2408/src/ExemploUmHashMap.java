import java.util.*;

public class ExemploUmHashMap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String nome1, nome2, nome3;
		Integer chave1, chave2, chave3;

		Scanner input = new Scanner(System.in);

		System.out.print("Primeiro nome: ");
		nome1 = input.nextLine();
		System.out.print("Segundo nome: ");
		nome2 = input.nextLine();
		System.out.print("Terceiro nome: ");
		nome3 = input.nextLine();

		System.out.print("Primeira chave: ");
		chave1 = input.nextInt();
		System.out.print("Segunda chave: ");
		chave2 = input.nextInt();
		System.out.print("Terceiro nome: ");
		chave3 = input.nextInt();

		Map<Integer, String> nomes = new HashMap<Integer, String>();
		nomes.put(chave1, nome1);
		nomes.put(chave2, nome2);
		nomes.put(chave3, nome3);

		System.out.print(nomes);
		System.out.println("\n");
		System.out.print(nomes.get(2));

		for(int i=1; i<=3; i++) {
		System.out.print(nomes.get(i));
		}

		//Criar um HahsMap, onde a chave será o nome da pessoa, e o valor será o peso dela.
		//uma pessoa



		}
		
	}

