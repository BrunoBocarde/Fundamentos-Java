package classe;

public class calculadora {

	double resultado =0;
	
	double somar(double a, double b) {
		resultado = a+b;
		return resultado; // quando nao é void sempre retorna algo 		
	}
	void acresentar(double a) { // esse double nao é igual a o de cima 
		resultado += a;  // acresenta a variavel a no resutado 
	}
	double obterResultado () { // apenas retornar o resultado 
		return resultado;
	}
	
	void limparCalduladora() { // para limpar o resultado da calculadora 
		resultado =0;
	}
}

