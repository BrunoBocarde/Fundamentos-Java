package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("qual a primiera nota do aluno? ");
		String resposta2 = JOptionPane.showInputDialog("qual a segunda nota do aluno? " );
		System.out.println(resposta1 + resposta2);
		 	
			// convencao de string para double 
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		System.out.println(total / 2);
	}
	
}
