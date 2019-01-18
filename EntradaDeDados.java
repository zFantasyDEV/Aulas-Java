// Aula básica sobre entrada de dados.

package entrada.de.dados.curso;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Cadastro
		
		String sentence = entrada.nextLine();
		String x, y, z;
		
		x = entrada.next();
		y = entrada.next();
		z = entrada.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = entrada.next();
		y = entrada.next();
		z = entrada.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		entrada.close();
	}

}
