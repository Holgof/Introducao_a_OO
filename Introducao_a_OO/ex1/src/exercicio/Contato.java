package exercicio;

class Contato {
	String nomeDoContato;
	String numeroDeCelular;				//String, pois � uma identifica��o e n�o � utilizado para c�lculos
	
	void recebeNome(String nome){
		nomeDoContato = nome;
	}
	
	void recebeNumero(String numero) {
		numeroDeCelular = numero;
	}
}