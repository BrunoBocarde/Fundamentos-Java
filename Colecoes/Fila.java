package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Fila {

	public static void main(String[] args) {
		Queue<String> Fila = new LinkedList<>();

		Fila.offer("Maria"); // offer = add mas se estiver alguma restição para adicionar no vetor ele
								// retorna false, o add retorna um erro
		Fila.offer("Joao");
		Fila.add("Pedro");

		System.out.println("Pekk / Element.....");
		/*
		 * o Peek e o Element verificao o 1° elemento da fila Se a fila estiver vazia o
		 * Peek retorna null Se a fila estiveer vazaia O Element retorna um erro
		 */
		System.out.println(Fila.peek());
		System.out.println(Fila.element());
		

		System.out.println("Pool / Remove"); // removem do 1° até o ultimo elemento
		System.out.println(Fila.poll());
		System.out.println(Fila.remove());
		System.out.println(Fila.poll());
		for (String nome : Fila) { // para mostrar o nome dos aprovados
			System.out.println(nome);

			for (int i = 0; i < Fila.size(); i++) {
				JOptionPane.showMessageDialog(null, Fila);
			} 
		}

		

	}
}
