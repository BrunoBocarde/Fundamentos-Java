package Fundamentos;

public class operadoresRelacionais {
	
	public static void main(String[] args) {
		/* operadores  
		  	== igualdade 
		 	!= diferen�a ou desigualdade
		 	>= maior igual
		 	> maior
		 	<= menor igual 
		 	< menor 	
		 */
		
		int num1 = 97;
		int num2 = 'a';
		System.out.println(num1 == num2); // igualdade
		System.out.println(3 != 2); // se 3 � diferente de 2 
		System.out.println(3 >= 2); // se 3 � igual ou maior a 2 
		System.out.println(3 > 2); 	// se 3 � maior q 2
		System.out.println(3<= 3 ); // se 3 � menor ou igual a 3
		System.out.println(3 < 4); // se 3 � menor q 4
	}
}
