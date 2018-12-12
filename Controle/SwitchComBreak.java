package Controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		int nota = 5;
		switch (nota) {

		case 10:
		case 9:
			conceito = "A";
			break; // caso nota receba 10 / 9 imprima "A"
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "c";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = null;
			break; // caso n atenda nenhum desses casos o valor é nulo

		}
		if (conceito != null) { // se conceito é diferente de nulo
			System.out.println(" conceito " + conceito);
		} else {// se for igual a nulo
			System.out.println("nota invalida");
		}
	}

}
