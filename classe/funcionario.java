package classe;

public class funcionario {
	
	String nome ="";
	String funcao ="";
	int salario =0;
	
	funcionario(){
	
		
	}
	
	funcionario( String n,String f, int s){
		
		nome =n;
		funcao = f;
		salario = s;
	}
	String escrita() {
		return String.format("%s,%s,%d",nome,funcao,salario);
	}
}
