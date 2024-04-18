package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int NUMBER = sc.nextInt();
		int h = sc.nextInt();
		double VALOR = sc.nextDouble();
		
		double SALARY = (VALOR * h);
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		sc.close();
		
	
	}

}
