package classe;

public class dataTeste {
	public static void main(String[] args) {
		data nascimento = new data(); // criando um novo objeto e utilizando dia mes e ano do data 
		nascimento.dia = 27;
		nascimento.mes = 8;
		nascimento.ano = 1997;
		
		
		System.out.println(nascimento.dia +"/" + nascimento.mes +"/" + nascimento.ano ); // mas esse metodo ja foi usada no objeto data
		System.out.println(nascimento.formatar()); // usando o formatar que esta instaciado no objetov data 
		
		data casamento = new data(20, 10 ,1980);
		
		System.out.println(casamento.formatar());
	}

}
