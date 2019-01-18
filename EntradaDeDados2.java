// Segunda aula sobre entrada de dados.

package entrada.de.dados.curso.dois;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		//b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		//4.32
		double n2 = sc.nextDouble();
		
		// Maria F 23 1.68
		String nome = sc.next();
		char ch = sc.next().charAt(0);
		int idade = sc.nextInt();
		double altura = sc.nextDouble();

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(nome);
		System.out.println(ch);
		System.out.println(idade);
		System.out.println(altura);
		
		sc.close();
	}
}
