package Fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv35 = executouTrabalho1 ^ executouTrabalho2;
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("tv 50  = " + comprouTv50);
		System.out.println("tv 35 = " + comprouTv35);
	}

}
