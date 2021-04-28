package exercicio;
import java.util.Scanner;

public class Pessoa {
	String nome;
	int idade = 0;
	
	
	
	public Pessoa criarPessoa(){
		Scanner input = new Scanner(System.in);
		Pessoa newborn = new Pessoa();
		String nomeBatismo;
		int idadeInicial;
		
		
		System.out.println("Nomeie esta pessoa:");
		nomeBatismo = input.nextLine();
		System.out.println("Insira a idade inicial para esta pessoa.");
		idadeInicial = input.nextInt();
		
		
		newborn.nome = nomeBatismo;
		newborn.idade = idadeInicial;
		
		
		return newborn;
	}
	
	
	void fazerAniversario() {
		System.out.println("Parabéns! Feliz aniversário!");
		idade ++;
	}
}
