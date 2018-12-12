package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapa {
	public static void main(String[] args) {

		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "pedro"); // put add na coluna 1 e na coluna 2 na coluna 1 nao pode haver numeros iguais
									// pois ira aver sobreposição
		aprovados.put(2, "ana");
		aprovados.put(3, "bia");
		aprovados.put(4, "carlos");
		// obter dados do MAP
		System.out.println(aprovados.keySet()); // mostra as chaves adicionadas
		System.out.println(aprovados.values()); // mostras os valores das chaves
		System.out.println(aprovados.entrySet()); // mostra as chaves e seus respectivos valores

		aprovados.put(3, "Beatriz"); // substituiu a chave 3
		System.out.println(aprovados.get(3));

		System.out.println(aprovados.containsKey(3)); // se contem chave 3
		System.out.println(aprovados.containsValue("bia")); // se contem o valor bia

		System.out.println("valores + resgistro");
		for (Entry<Integer, String> registro : aprovados.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());

		}

	}

}
