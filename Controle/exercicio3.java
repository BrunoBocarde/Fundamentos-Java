package Controle;

import java.util.Scanner;

public class exercicio3 {
	
	/*Criar um programa que receba duas notas parciais, calcular a média final. 
	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
	 se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	 caso contrário imprime no console "Reprovado"*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota1 =0;
		float nota2 =0;
		float media =0;
		
		System.out.print(" Nota da primeira Prova :");
			nota1 = sc.nextFloat();
		System.out.print(" Nota da segunda Prova :");
			nota2 = sc.nextFloat();
		media = (nota1+nota2)/2;
		
		if(media>=7) {
			System.out.println("aprovado com a media "+media);
			}else if(media >=4 ) {
				System.out.println("recuperação com a media "+media);
					}else {
						System.out.println("Reprovado com a media "+media);
					}
		
	}
		
	}


