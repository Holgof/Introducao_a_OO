package exercicio;


public class Casa {
	int LIMITEDEPORTAS = 30; //limite arbitrário
	String id;
	String cor;
	Porta[] portas;

	
	static void pintaCasa(Casa casa) {
		
		System.out.println("De que cor deseja pintar a casa?");
		casa.cor = ScannerMaker.devolverInputEmString();
		System.out.println("Operação de pintura completa.");
	}
	
	
	
	static void criaCasa(Casa casa) {
		
		casa.portas = new Porta[casa.LIMITEDEPORTAS];
		System.out.println("Informe ao programa qual a cor desta casa.");
		casa.cor = ScannerMaker.devolverInputEmString();
	}
	
	
	
	void adicionaPorta(Casa casa) {
		
		Porta porta = new Porta();
		Porta.criaPorta(porta);
		int i = 0;
		
		for (i = 0; i < casa.LIMITEDEPORTAS - 1; i++) {			
			try {
				casa.portas[i].id.equals(null);	
			}
			catch (Exception posicaoNula) {
				casa.portas[i] = porta;
			}
		}		
		
		
		System.out.println("Porta adicionada à casa.");
		System.out.printf("%nid = %s%ncor = %s%ndimensões = %.2f,%.2f,%.2f%n", casa.portas[i].id, casa.portas[i].cor, casa.portas[i].dimensoes.largura, casa.portas[i].dimensoes.altura, casa.portas[i].dimensoes.profundidade);
	}
	
	
	
	int quantasPortasEstaoAbertas(Casa casa) {
		int i;
		int nDePortasAbertas = 0;
		
		for(i = 0; i < portas.length; i++) {
			if (casa.portas[i].estado.equals("aberta")){
				nDePortasAbertas ++;
			}
		}
		
		return nDePortasAbertas;
	}
	
	
	
	
	void editaPorta(Casa casa, Porta porta) {
		String respostaDoUsuario = "sim";
		
		while(respostaDoUsuario.equals("sim")) {
			while(respostaDoUsuario.equals("pintar porta") == false && respostaDoUsuario.equals("abrir porta") == false && respostaDoUsuario.equals("fechar porta") == false && respostaDoUsuario.equals("alterar dimensoes") == false) {
				System.out.printf("pintar porta%nabrir porta%nfechar porta%nalterar dimensões%nQual operação deseja realizar com a porta %s?%n", porta.id);
				respostaDoUsuario = ScannerMaker.devolverInputEmString();	
			}
			
			
			System.out.println(respostaDoUsuario);
			switch (respostaDoUsuario) {
			
				case "pintar porta":
					porta.pintarPorta(porta);
					break;
				
				case "abrir porta":
					porta.abrePorta(porta);
					break;
					
				case "fechar porta":
					porta.fechaPorta(porta);
					break;
					
				case "alterar dimensões":
					porta.mudaDimensoes(porta);
					break;
			}
			
			System.out.printf("%nDeseja realizar uma nova alteração na porta %s? Responda com 'sim' para prosseguir.%n", porta.id);
			respostaDoUsuario = ScannerMaker.devolverInputEmString();
			
		}
	}
	
	void printaCasa(Casa casa) {
		int i = 0;
		
		System.out.println("A casa terminou a interação com a seguinte configuração:");
		System.out.printf("%nCor = %s.%n", casa.cor);
		
		System.out.printf("%nA casa tem %d portas:%n", casa.portas.length);
		for(i = 0; i < casa.portas.length; i++)
		{
			System.out.printf("%nPorta %s:%n", casa.portas[i]);
			System.out.printf("Estado: %s.", casa.portas[i].estado);
			System.out.printf("Cor: %s.", casa.portas[i].cor);
			System.out.printf("Dimensões: altura = %.2f  largura = %.2f  profundidade = %.2f", casa.portas[i].dimensoes.altura, casa.portas[i].dimensoes.largura, casa.portas[i].dimensoes.profundidade);
		}
	}
}