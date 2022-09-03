import java.util.Scanner;
public class Exercicio01 {
	
	
	public static int Media(int media,int numero1, int numero2, int numero3) {
		media = (numero1 + numero2 + numero3)/4;
		System.out.printf("Resulta da média dos números: %d", media);
		return media;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numero1 = 0, numero2 = 0, numero3 = 0, media = 0, escolha = 0;
		
		while(escolha!=4) {
			
		
		
		System.out.print("\n1- Verificar qual dos números é maior, \n2- Calcular a média dos três médias, \n3- Verificar se os números digitados são maiores que zero, \n4- Sair: ");
		escolha = input.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.print("\nDigite qualquer número: ");
			numero1 = input.nextInt();
			
			System.out.print("\nDigite qualquer número: ");
			numero2 = input.nextInt();
			
			System.out.print("Digite qualquer número: ");
			numero3 = input.nextInt();
			if(numero1>numero2 && numero1>numero3) {
				System.out.print("O primeiro número é maior");
				
			} else if(numero2>numero1 && numero1>numero3) {
				System.out.print("O segundo número é maior");
				
			} else if(numero3>numero1 && numero3>numero2) {
				System.out.print("O terceiro número é maior");
				
			} else {
				System.out.print("Todos números são iguais");
			}
			
			break;
		
		case 2:
			System.out.print("\nDigite qualquer número: ");
			numero1 = input.nextInt();
			
			System.out.print("\nDigite qualquer número: ");
			numero2 = input.nextInt();
			
			System.out.print("Digite qualquer número: ");
			numero3 = input.nextInt();
			media = Media(media,numero1, numero2, numero3);
			break;
			
		case 3:
			System.out.print("\nDigite qualquer número: ");
			numero1 = input.nextInt();
			
			System.out.print("Digite qualquer número: ");
			numero2 = input.nextInt();
			
			System.out.print("\nDigite qualquer número: ");
			numero3 = input.nextInt();
			
			if(numero1>0) {
				System.out.print("\nO primeiro número é maior que zero");
				
			} if(numero1<0) {
				System.out.print("O primeiro número é menor que zero");
				
			} if(numero2>0) {
				System.out.print("\nO segundo número é maior que zero");
				
			} if(numero2<0) {
				System.out.print("O segundo número é menor que zero");
				
			} if(numero3>0) {
				System.out.print("\nO terceiro número é maior que zero");
				
			} if(numero3<0) {
				System.out.print("O terceiro número é menor que zero");
			}
			break;
			
		case 4:
			System.out.print("saindo...");
			break;
			
		default:
			System.out.print("Opção inváldia");
			
		}
		} //fechamento do while
	}

}
