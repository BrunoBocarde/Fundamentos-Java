package Controle;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas =0;
		double nota =0;
		
		
		for( int indice=0; indice <3; indice++) { // no FOR 1º declaração da variavel,qtns vezes repete e por ultimo ela ++
			nota = scanner.nextDouble();
			somaDasNotas+= nota; // somadasnotas recebe notas 
		}
		scanner.close();
		System.out.printf("a media do aluno é %.2f", somaDasNotas/3);
		
		for(int bo =1; bo < 100; bo++) {
			System.out.println(bo);
		}
	}
}
