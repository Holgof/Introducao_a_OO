package exercicio;
import java.util.Scanner;

class Agenda {
	Contato[] contatos = new Contato[50];  //50 escolhido como limite de forma arbitrária
	
	
	void adicionaContato(Scanner input) {
		String nome, numero;
		
		System.out.println("Insira o nome do contato.");
		nome = input.nextLine();
		System.out.println("Insira o número de celular do contato");
		numero = input.nextLine();
		
		if (contatos[0] != null) {
			sortAddContato(nome, numero);
		}
		
		else {
			System.out.println(contatos[0]);
			contatos[0].nomeDoContato = nome;
			contatos[0].numeroDeCelular = numero;
		}
	}
	
	
	
	void removeContato(Scanner input) {
		
		System.out.println("Digite o nome do contato que deseja remover:");
		String nome = input.nextLine();
		
		sortRemoveContato(nome);
	}
	
	
	
	String retornaNumero(Scanner input) {
		int i = 0;
		String nome;
		
		System.out.println("Insira o nome Do contato para obter seu número de telefone.");
		nome = input.nextLine();
		
		
		for(i = 0; i < contatos.length; i++) {
			if (contatos[i].nomeDoContato.equals(nome) == true) {
				return contatos[i].numeroDeCelular;
			}
		}
		System.out.println("Esta pessoa não consta na sua lista de contatos.");
		return "error";
	}
	
	
	
	void sortAddContato(String nome, String numero) {
		int i = 0, j;
		for(i = 0; i < contatos.length; i++) {
			if (nome.compareToIgnoreCase(contatos[i].nomeDoContato) > 0 && nome.compareToIgnoreCase(contatos[i-1].nomeDoContato) < 0) {
				j = i;
				for(i = j; i < contatos.length; i++) {
					contatos[i+1].nomeDoContato = contatos[i].nomeDoContato;
					contatos[i+1].numeroDeCelular = contatos[i].numeroDeCelular;
				}
				contatos[j].nomeDoContato = nome;
				contatos[j].numeroDeCelular = numero;
			}
		}
	}
	
	
	
	void sortRemoveContato(String nome) {
		int i = 0, j;
		for(i = 0; i < contatos.length; i++) {
			if (nome.compareToIgnoreCase(contatos[i].nomeDoContato) == 0) {
				j = i;
				for(i = j; i < contatos.length; i++) {
					contatos[i].nomeDoContato = contatos[i+1].nomeDoContato;
					contatos[i+1].numeroDeCelular = contatos[i+1].numeroDeCelular;
				}
				contatos[i].nomeDoContato = null;
				contatos[i].numeroDeCelular = null;
			}
		}
	}
	
	
	void verLista() {
		int i = 0;
		
		if (contatos[i].nomeDoContato == null) {
			System.out.println("A agenda está vazia.");
			System.exit(1);
		}
		
		while(contatos[i].nomeDoContato != null) {
			System.out.println(contatos[i].nomeDoContato);
		}
	}
}