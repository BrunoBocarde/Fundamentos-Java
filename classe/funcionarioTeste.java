package classe;

public class funcionarioTeste {
	public static void main(String[] args) {
		
		funcionario ti = new funcionario();
		ti.nome = "bruno";
		ti.funcao = "estagio";
		ti.salario = 900;
		System.out.println("o funcionario " + ti.nome + "  tem a funcao de " + ti.funcao + " com o salario de " + ti.salario);
		System.out.println(ti.escrita());
		
		
		funcionario adm = new funcionario("julia","adm",2500);
		System.out.println(adm.escrita());
		
	}

}
