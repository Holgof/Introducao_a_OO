package exercicio;

public class Porta {
	
	String id;
	String cor;
	String estado;
	Dimensoes dimensoes;
	
	
	
	static void criaPorta(Porta porta) {
		
		porta.dimensoes = new Dimensoes();
		
		System.out.println("Insira uma identifica��o para esta porta (nome, numero, caracter�stica...):");
		porta.id = ScannerMaker.devolverInputEmString();
		
		System.out.println("Insira a cor desejada para esta porta.");
		porta.cor = ScannerMaker.devolverInputEmString();
		
		System.out.println("Diga o estado em que a porta se encontra ('aberta' ou 'fechada').");
		porta.estado = ScannerMaker.devolverInputEmString();
		
		System.out.println("Informe, em ordem, a largura, a altura e a profundidade da porta.");
		porta.dimensoes.largura = ScannerMaker.devolverInputEmFloat();
		porta.dimensoes.altura = ScannerMaker.devolverInputEmFloat();
		porta.dimensoes.profundidade = ScannerMaker.devolverInputEmFloat();
		
		System.out.printf("%nA porta %s foi criada.%n", porta.id);
		
	}
	
	
	
	void pintarPorta(Porta porta) {
		String resposta;
	
		System.out.println("Gostaria de 'adiciionar uma cor' � porta ou 'sobrepor' as cores existentes? Inputs v�lidos marcados por aspas simples.");
		resposta = ScannerMaker.devolverInputEmString();
		
		if(resposta.equals("adicionar uma cor")) {
			System.out.println("Escreva quais cores deseja adicionar � porta.");
			resposta = ScannerMaker.devolverInputEmString();
			porta.cor += ", " + resposta;
			
			System.out.println("Mudan�a efeituada com sucesso!");
		}
		
		else if(resposta.equals("sobrepor")) {
			System.out.println("Informe de que cor(s) deseja pintar a porta.");
			resposta = ScannerMaker.devolverInputEmString();
			
			porta.cor = resposta;
			
			System.out.println("Mudan�a efeituada com sucesso!");
		}
		
	}
	
	
	
	void abrePorta(Porta porta) {
		if(porta.estado.equals("fechada")) {
			porta.estado = "aberta";
			System.out.printf("%nA porta %s foi aberta.%n", porta.id);
		}

		if(porta.estado.equals("aberta")) {
			System.out.printf("%nA porta %s j� est� aberta.%n", porta.id);
		}
	}



	void fechaPorta(Porta porta) {
		if(porta.estado.equals("aberta")) {
			porta.estado = "fechada";
			System.out.printf("%nA porta %s foi fechada.%n", porta.id);
		}

		else if(porta.estado.equals("aberta")) {
			System.out.printf("%nA porta %s j� est� fechada.%n", porta.id);
		}
	}
	
	
	
	
	void mudaDimensoes(Porta porta) {
		
		System.out.printf("%nQuais ser�o as novas dimens�es da porta %s? (altura/largura/profundidade)%n", porta.id);
		
		porta.dimensoes.altura = ScannerMaker.devolverInputEmFloat();
		porta.dimensoes.largura = ScannerMaker.devolverInputEmFloat();
		porta.dimensoes.profundidade = ScannerMaker.devolverInputEmFloat();
		
	}
}