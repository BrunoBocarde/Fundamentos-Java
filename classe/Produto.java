package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(){
		
	}
	
	Produto (String nome, double preco){
		 // usa o this para falar q é difrente do nome/preco do objeto 
		this.nome = nome;
		this.preco = preco;
		
		
	}
	
	double precoComDescoto() {
		return preco - preco*desconto;
	}
	
}
