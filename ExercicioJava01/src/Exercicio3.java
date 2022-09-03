import java.util.Scanner;
public class Exercicio3 {
	
	public static int compra (int estoque, int valorCompra) {
		estoque = estoque + valorCompra;
		
		System.out.printf("Foram comprados %d kg",valorCompra);
		return estoque;
	}
	
	public static int venda (int estoque, int valorVenda) {
		estoque = estoque - valorVenda;
		
		System.out.printf("Foram vendidos %d kg",valorVenda);
		return estoque;
	}
	
	public static int status (int estoque) {
		
		System.out.printf("Status do estoque: %d kg",estoque);
		
		return estoque;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int estoque = 50, valorCompra = 0, valorVenda = 0, escolha = 0;
		
		while(escolha!=4) {
			
		System.out.print("\n1- Compra, 2- Venda, 3- Status do estoque, 4- Sair: ");
		escolha = input.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.print("Quantos kilos de café deseja? ");
			valorCompra = input.nextInt();
			estoque = compra(estoque,valorCompra);
			break;
			
		case 2:
			System.out.print("Deseja vender quantos kilos de café? ");
			valorVenda = input.nextInt();
			estoque = venda(estoque,valorVenda);
			break;
			
		case 3:
			estoque = status(estoque);
			break;
			
		case 4:
			System.out.print("Saindo...");
			break;
			
		default:
			System.out.print("Opção inválida");
		}
		}

	}

}
