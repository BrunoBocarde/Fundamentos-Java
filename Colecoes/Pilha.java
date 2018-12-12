package Colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Pilha {
	Fila fila;
	String[] x = new String[5];

	public void addNomes(String[] x) {
		for (int i = 0; i < 5; i++) {
			x[i] = JOptionPane.showInputDialog(null, "Entre com um nome de livro: ");
			this.x[i] = x[i];
		}
	}

	public void mostarNome() {
		List<String> lista = Arrays.asList(x);
		Collections.reverse(lista);
		System.out.println("A ordem da pila é: "+lista);

	}

	public static void main(String[] args) {
		Pilha nomes = new Pilha();
		String[] x = new String[5];
		nomes.addNomes(x);
		nomes.mostarNome();

	}
}