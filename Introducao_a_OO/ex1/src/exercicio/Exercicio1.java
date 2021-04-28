package exercicio;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Agenda agendaTelefonica =  new Agenda();
		String entrada, novaAtividade;
		Scanner input = new Scanner(System.in);
		
		do {
		
			System.out.printf("Insira a operação que deseja realizar:%n%n");
			System.out.println("'adicionar contato' - para adicionar um novo contato.");
			System.out.println("'ver número' - para visualizar o número de um contato existente.");
			System.out.println("'remover contato' - para remover um contato existente.");
			System.out.println("'ver agenda' - para visualizar a lista de contatos.");
		
			entrada = input.nextLine();
		
			switch(entrada) { 
			
			case "adicionar contato":
				agendaTelefonica.adicionaContato(input);
			case "ver numero":
				agendaTelefonica.retornaNumero(input);
			case "remover contato":
				agendaTelefonica.removeContato(input);
			case "ver agenda":
				agendaTelefonica.verLista();
			}
			
			System.out.printf("%n%n Deseja realizar uma nova operação? Responda com sim para continuar.");
			novaAtividade = input.nextLine();
			
		} while(novaAtividade.equals("sim"));
		
		input.close();
	}
}

