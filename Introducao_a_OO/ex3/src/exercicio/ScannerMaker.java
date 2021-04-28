package exercicio;
import java.util.Scanner;

public class ScannerMaker {
	
	static Scanner input = new Scanner(System.in);

	static public String devolverInputEmString(){

		String respostaDoUsuario;

		respostaDoUsuario = input.nextLine();
		return respostaDoUsuario; 
	}


	static public Float devolverInputEmFloat(){

		float respostaDoUsuario;
		respostaDoUsuario = input.nextFloat();
		return respostaDoUsuario;
	}
}