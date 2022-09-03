import java.util.Scanner;
public class Exercicio2 {
	
	public static double SalarioBrutoOnze(double salarioDesconto, double salario, String nome) {
		salarioDesconto = salario - salario*0.11;
		
		System.out.printf("Nome: %s\nINSS: %.2f",nome, salarioDesconto);
		return salarioDesconto;
	}
	
	public static double SalarioBrutoNove(double salarioDesconto, double salario, String nome) {
		salarioDesconto = salario - salario*0.09;
		
		System.out.printf("Nome: %s\nINSS: %.2f",nome, salarioDesconto);
		return salarioDesconto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		double salario = 0, salarioDesconto = 0, sair = 0;
		
	
		while(sair!=4) {
			
			
		System.out.print("\nDigite o seu nome: ");
		nome = input.nextLine();
			
		System.out.print("\nInsira o seu salário: ");
		salario = input.nextDouble();
			
		if(salario>=1000) {
			
			salarioDesconto = SalarioBrutoOnze(salarioDesconto,salario,nome);

		} else {
			
			salarioDesconto = SalarioBrutoNove(salarioDesconto,salario,nome);
		}
		System.out.print("\nDigite 4 para abandonar o progresso: ");
		sair = input.nextDouble();
			
		System.out.print("\nSaindo... ");
		}
		
	}
}


