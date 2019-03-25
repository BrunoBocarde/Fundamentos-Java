package Controle;

import java.util.Scanner;


public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		
		System.out.println("Qual a nota da prova do aluno bruno?");
		nota = sc.nextDouble();
		
		if(nota>=9 && nota<=10) { // se nota maior que 9 
			System.out.println("quadro de honra");
		}else if(nota>=7 && nota<5) {
			System.out.println("Aprovado");
		}else if (nota >=5 && nota<7) {
			System.out.println("recuperação");
		}else if(nota >=3.5 && nota<5) {
			System.out.println("recuperação + trabalho");
		}else if(nota>10 | nota<0)	{ // aqui se a nota for maior q 10 OU menos q 0
			System.out.println("Insira um valor entra 0 e 10 ");		
		}else {
			System.out.println("Reprovado");
		}
	}
}
