package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // variavel auxiliar para ler dados do teclado 
		int qntdenotas =0;
		double somaDasNotas = 0;
		double nota = 0;
		while (nota != -1) { // nota tem q ser difirente de -1  colocando not -1 sai do laço 
			nota = sc.nextDouble(); // fazer a leitura da nota do usuario
			
			if(nota <= 10 && nota >= 0) { // && tem q obedecer as 2 condicoes 
				somaDasNotas += nota;
				qntdenotas++;
				
			}
			
		}
		sc.close();
		System.out.printf("a media é %.2f", somaDasNotas / qntdenotas);
	}
		
}
	

