package classe;

public class calculadoraTest {
	
	public static void main(String[] args) {
		calculadora calc = new calculadora(); // referencia ao objeto calculadora
		
		System.out.println(calc.somar(4.5, 9)); // somar 2 variaveis
		calc.acresentar(10); // acresentar 10
		System.out.println(calc.obterResultado());// imprimir o resultado
		calc.limparCalduladora();
		System.out.println(calc.obterResultado());
		
		
		
		
	}
}
