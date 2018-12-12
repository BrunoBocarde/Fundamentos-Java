package Colecoes;

public class Array {
	public static void main(String[] args) {

		double[] notasJoao = { 7.0, 8.7, 9.2, 4.9, 9.7 }; // notação de array "[]" aqui dentro so valores {.......}

		double[] notasPedro = new double[5]; // [aqui dentro o tamanho do arry]
		notasPedro[0] = 7;
		notasPedro[1] = 8.7;
		notasPedro[2] = 9.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;

		double totalNotasJoao = 0;
		for (int i = 0; i < notasJoao.length; i++) { // legnth associa aso tamanho do array ou do vetor
			totalNotasJoao += notasJoao[i];
		}

		double totalNotasPedro = 0;
		for (int i = 0; i < notasPedro.length; i++) {
			totalNotasPedro += notasPedro[i];
		}
		System.out.println(totalNotasJoao / notasJoao.length);
		System.out.println(totalNotasPedro / notasPedro.length);

		int secao[] = { 1, 2, 3, 4 }; // para ler e somar todos os valores dentro de um vetor
		int soma = 0;
		for (int i = 0; i < secao.length; i++) {
			soma += secao[i];
		}

		System.out.println(soma);
	}

}
