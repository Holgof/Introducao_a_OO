package exercicio;

public class Exercicio3 {
	public static void main(String[] args) {
		Porta porta = new Porta();
		String respostaDoUsuario;
		
		Porta.criaPorta(porta);
		
		do {
			do	{
				System.out.printf("pintar porta%nabrir porta%nfechar porta%nalterar dimens�es%nQual opera��o deseja realizar com a porta %s?%n", porta.id);
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
					
				case "alterar dimens�es":
					porta.mudaDimensoes(porta);
					break;
			}
			
			System.out.printf("%nDeseja realizar uma nova altera��o na porta %s? Responda com 'sim' para prosseguir.%n", porta.id);
			respostaDoUsuario = ScannerMaker.devolverInputEmString();
			
		}while(respostaDoUsuario.equals("sim"));
	
		System.out.printf("%n%nA porta %s terminou com a seguinte configura��o.%n", porta.id);
		System.out.printf("Cor(s): %s.%n", porta.cor);
		System.out.printf("Estado: %s.%n", porta.estado);
		System.out.printf("Dimens�es: altura = %.2f.  largura = %.2f. profundidade = %.2f.%n", porta.dimensoes.altura, porta.dimensoes.largura, porta.dimensoes.profundidade);
	}
}