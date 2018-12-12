package Controle;

import java.util.Scanner;

public class exercico1_DeZeroaDezeSePar {
	public static void main(String[] args) {
		// EXE 1Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

		 Scanner sc = new Scanner(System.in);
		 int numero =0; 
		 int resto =0;
		 System.out.println("digite um numero inteiro qualquer ");
		 	numero = sc.nextInt();	 
		 if(numero>=0 && numero<=10) {
			 System.out.println("o seu numero esta entre 0 e 10 ele é "+numero);		 
		 		}else {
		 			System.out.println("seu numero não esta entre 0 e 10 ele, é "+numero);
		 			}
		 
		resto = numero %2;
		
		if(resto !=1) { // se resto foi diferente de 1
			System.out.println("seu numero é par");			
				}else {
					System.out.println("seu numero é impar");
					}
			
	}
}
