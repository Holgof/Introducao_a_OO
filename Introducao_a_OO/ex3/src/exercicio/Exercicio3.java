package exercicio;

public class Exercicio3 {
	public static void main(String[] args) {
		Porta porta = new Porta();
		String respostaDoUsuario;
		
		Porta.criaPorta(porta);
		
		do {
			do	{
				System.out.printf("pintar porta%nabrir porta%nfechar porta%nalterar dimensões%nQual operação deseja realizar com a porta %s?%n", porta.id);
				respostaDoUsuario = ScannerMaker.devolverInputEmString();
				
			}while(respostaDoUsuario.equals("pintar porta") == false && respostaDoUsuario.equals("abrir porta") == false && respostaDoUsuario.equals("fechar porta") == false && respostaDoUsuario.equals("alterar dimensoes") == false);
			
			
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
			
		}while(respostaDoUsuario.equals("sim"));
	
		System.out.printf("%n%nA porta %s terminou com a seguinte configuração.%n", porta.id);
		System.out.printf("Cor(s): %s.%n", porta.cor);
		System.out.printf("Estado: %s.%n", porta.estado);
		System.out.printf("Dimensões: altura = %.2f.  largura = %.2f. profundidade = %.2f.%n", porta.dimensoes.altura, porta.dimensoes.largura, porta.dimensoes.profundidade);
	}
}