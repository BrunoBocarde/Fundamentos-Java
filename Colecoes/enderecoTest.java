package Colecoes;

public class enderecoTest {
	public static void main(String[] args) {
		endereco endereco1 = new endereco("rua looping infinito ", 1, "sala 1001");
		endereco endereco2 = new endereco("rua looping infinito ", 1, "sala 1001");
		System.out.println(endereco1 == endereco2);
		/*
		 * ele da o resultado false pq o endereço de memoria esta difirente sao objetos
		 * diferentes com os msm dados dados mas alocados em locais diferentes na
		 * memoria
		 * 
		 */
		System.out.println(endereco1.equals(endereco2));

	}

}
