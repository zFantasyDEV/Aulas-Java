// Aula sobre sa�da de dados.

package saida.dados.curso;

import java.util.Locale;

public class SaidaDeDados {
	
	public static void main (String[] args) {
		
		double peso = 40.5654616314;
		
		// System.out.print("Ele imprime o conte�do em apenas uma linha, sou seja, sem quebra de linha. ");
		//System.out.println("Ele imprime o conte�do quebrando a linha para o pr�ximo conte�do..");
		System.out.printf("%.2f%n", peso);
		System.out.printf("%.4f%n", peso);
		Locale.setDefault(Locale.US);
		System.out.printf("%.5f%n", peso);
	}
	
}
