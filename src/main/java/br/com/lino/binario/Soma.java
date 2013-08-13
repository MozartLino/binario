package br.com.lino.binario;

public class Soma {

	String soma = "";
	int vaiUm = 0;

	public int calcula(String valor1, String valor2) {

		int min = Math.min(valor1.length(), valor2.length());
		int max = Math.max(valor1.length(), valor2.length());

		for (int i = min - 1; i >= 0; i--) {
			soma(valor1.charAt(valor1.length() - valor2.length() + i), valor2.charAt(i));
		}

		for (int i = min - max - 1; i >= 0; i--) {
			char maiorArray = valor1.length() > valor2.length() ? valor1.charAt(i) : valor2.charAt(i) ;
			soma(maiorArray);
		}

		if (vaiUm == 1) {
			soma = vaiUm + soma;
		}

		return Integer.parseInt(soma);
	}

	private void soma(char... valores) {
		int aux = extracted(valores) + vaiUm;

		if (aux == 3) {
			soma = 1 + soma;
		} else if (aux == 2) {
			soma = 0 + soma;
			vaiUm = 1;
		} else if (aux == 1) {
			soma = 1 + soma;
			vaiUm = 0;
		} else if (aux == 0) {
			soma = 0 + soma;
		}

	}

	private int extracted(char... valores) {
		int aux = 0;
		for (char i : valores) {
			aux = aux + Integer.parseInt(String.valueOf(i));
		}

		return aux;
	}

}
