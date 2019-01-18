// Aula simples sobre estrutura condicional.

package estrutura.condicional;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Enter an integer number:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		*/
		
		System.out.println("What time is it?");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good morning!");
		}else if (time < 18) {
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good evening!");
		}
		
		sc.close();
	}

}
