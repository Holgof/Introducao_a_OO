package exercicio;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fazerOutroAniversario = "";
		
		System.out.printf("Criação da pessoa:%n%n");
		Pessoa pessoa = new Pessoa().criarPessoa();
		
		
		do {
			System.out.printf("Deseja que %s faça aniversário? responda com 'sim' ou 'não'.", pessoa.nome);
			fazerOutroAniversario = input.nextLine();
			
			
			if (fazerOutroAniversario.equals("sim") == false && fazerOutroAniversario.equals("não") == false) {
				System.out.println("Resposta inválida");
				continue;
			}
			
			else if (fazerOutroAniversario.equals("sim")) {
				pessoa.fazerAniversario();
			}
			
		} while (fazerOutroAniversario.equals("sim"));
		
		input.close();
		System.out.printf("A idade final de %s é %d", pessoa.nome, pessoa.idade);
	}
}
