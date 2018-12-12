package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class lista {
	public static void main(String[] args) {
		// FIFO FIST IN FIST OUT
		
		List<String> aprovados = new ArrayList<>();
		aprovados.add("joao");
		aprovados.add("pedro");
		aprovados.add("Maria");
		aprovados.add("rafael");

		System.out.println("get...");
		System.out.println(aprovados.get(1)); // o get seleciona o elemento que estava na posição 1 (vetor começa de 0)

		System.out.println("Add..");
		System.out.println(aprovados.add("Maria"));
		System.out.println(aprovados.size()); // o size mostra o tamanho o vetor
		System.out.println("Remover um elemento da lista");
		System.out.println(aprovados.remove("maria"));
		System.out.println(aprovados.remove("Maria"));

		for (String nome : aprovados) { // para mostrar o nome dos aprovados
			System.out.println(nome);
		}
	}

}
