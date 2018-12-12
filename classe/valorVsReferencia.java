package classe;

public class valorVsReferencia {
	static void porvalor(double numero) {
		numero++;
	}

	static void porReferencia(Produto produto) {
		produto.preco++;
		
	}
		public static void main(String[] args) {
			double numero =1;
			Produto produto = new Produto("caneta",1);
			
			porvalor(numero);
			porReferencia(produto);
			
			System.out.println(numero);
			System.out.println(produto.preco);
		}
}
