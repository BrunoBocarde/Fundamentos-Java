package Controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas=0;
		double nota =0;
		int indice =0;
		
		while(indice <3) { // le 3 notas 
			nota = scanner.nextDouble();
			somaDasNotas += nota; // incrementa nas notas os valores digitados 
			indice++; // sempre coloque a variavel indice ++ para somar la em cima 
		}
		scanner.close();
		System.out.printf("a media é %.2f", somaDasNotas / 3);
	}

}
