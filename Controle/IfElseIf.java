package Controle;

import java.util.Scanner;


public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		
		System.out.println(" qual a nota da prova do aluno bruno?");
		nota = sc.nextDouble();
		
		if(nota>=9) { // se nota maior que 9 
			System.out.println("quadro de honra");
		}else if(nota>=7) {
			System.out.println("Aprovado");
		}else if (nota >=5) {
			System.out.println("recuperação");
		}else if(nota >=3.5) {
			System.out.println("recuperação + trabalho");
		}else {
			System.out.println("Reprovado");
		}
	}
}
