package classe;

public class produtoTest {
	public static void main(String[] args) {
		
		Produto notebook = new Produto();
		notebook.nome = "Acer 15 polegadas";
		notebook.preco = 2500;
		 Produto.desconto= 0.15;

		System.out.println(notebook.precoComDescoto());
		
		Produto caneta = new Produto ("caneta preta bic",4.0);

		System.out.println(caneta.precoComDescoto());
	}

}
