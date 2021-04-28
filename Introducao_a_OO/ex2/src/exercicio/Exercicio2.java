package exercicio;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fazerOutroAniversario = "";
		
		System.out.printf("Cria��o da pessoa:%n%n");
		Pessoa pessoa = new Pessoa().criarPessoa();
		
		
		do {
			System.out.printf("Deseja que %s fa�a anivers�rio? responda com 'sim' ou 'n�o'.", pessoa.nome);
			fazerOutroAniversario = input.nextLine();
			
			
			if (fazerOutroAniversario.equals("sim") == false && fazerOutroAniversario.equals("n�o") == false) {
				System.out.println("Resposta inv�lida");
				continue;
			}
			
			else if (fazerOutroAniversario.equals("sim")) {
				pessoa.fazerAniversario();
			}
			
		} while (fazerOutroAniversario.equals("sim"));
		
		input.close();
		System.out.printf("A idade final de %s � %d", pessoa.nome, pessoa.idade);
	}
}
