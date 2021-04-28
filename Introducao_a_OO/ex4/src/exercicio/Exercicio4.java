package exercicio;


public class Exercicio4 {
	public static void main(String[] args) {
	
		
		String proximaAcao;
		String desejaContinuar = "sim";
		int nDePortas = 0;
		int nDePortasAbertas;
		Casa casa = new Casa();
		Casa.criaCasa(casa);
		
		while (desejaContinuar.equals("sim")) {
			System.out.printf("Qual alteração deseja realizar nesta casa? Digite uma das seguintes opções %n%n");
			System.out.println("pintar casa");
			System.out.println("adicionar porta");
			System.out.println("quantas portas estão abertas");
			System.out.println("editar porta");
			
			proximaAcao = ScannerMaker.devolverInputEmString();
			
			switch(proximaAcao) {
			
			case "pintar casa": {
				Casa.pintaCasa(casa);
				break;
			}
			
			case "adicionar porta": {
				casa.adicionaPorta(casa);
				nDePortas++;
				break;
			}
			
			case "quantas portas estão abertas": {
				nDePortasAbertas =  casa.quantasPortasEstaoAbertas(casa);
				System.out.printf("%n%d portas estão abertas.%n", nDePortasAbertas);
				break;
			}
			
			case "editar porta": {
				String qualPorta;
				int i = 0;
				
				System.out.println("Qual porta deseja edita? Responda com sua identificação.");
				qualPorta = ScannerMaker.devolverInputEmString();
				for(i = 0; i < nDePortas; i++) {
				
					if (casa.portas[i].id.equals(qualPorta)){
						casa.editaPorta(casa, casa.portas[i]);
						break;
					}
				}
				System.out.println("Esta porta não existe.");
				break;
				}
			}
			
			System.out.println("Deseja realizar uma nova operação? Responda com 'sim' pra continuar.");
			desejaContinuar = ScannerMaker.devolverInputEmString();
		}
		
		casa.printaCasa(casa);
		
	}
}
