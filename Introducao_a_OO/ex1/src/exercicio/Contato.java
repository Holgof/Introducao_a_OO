package exercicio;

class Contato {
	String nomeDoContato;
	String numeroDeCelular;				//String, pois é uma identificação e não é utilizado para cálculos
	
	void recebeNome(String nome){
		nomeDoContato = nome;
	}
	
	void recebeNumero(String numero) {
		numeroDeCelular = numero;
	}
}