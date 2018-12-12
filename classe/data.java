package classe;

public class data {
		int dia;
		int mes;
		int ano;
		
		data(){
			
		}
		
		data(int dia, int mes, int ano){
			
			this.dia = dia; // this é para referenciar o obejto data 
			this.mes = mes;
			this.ano = ano;
		}
		String formatar() {
			return String.format("%d/%d/%d", dia, mes , ano); 
		}

}
