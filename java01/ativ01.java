import java.util.Scanner;

import Familia32.�;

public class ativ01 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros 
				//e diga qual deles � o maior.

				int num1, num2, num3;
				Scanner scan= new Scanner (System.in);
			
				System.out.println("\nDigite o primeiro n�mero: ");
				num1= scan.nextInt();
				
				System.out.println("\nDigite o segundo n�mero: ");
				num2= scan.nextInt();
				
				System.out.println("\nDigite o terceiro n�mero: ");
				num3= scan.nextInt();
				
				if (num1 >= num2 && num1 >=num3) {
					System.out.println("\nO n�mero: "+num1+" � maior");
				}
				else if (num2 >= num1 && num2 >=num3) {
					System.out.println("\nO n�mero: "+num2+" � maior");
				}
				else if (num3 >= num1 && num3 >=num2) {
					System.out.println("\nO n�mero: "+num3+" � maior");
				}
				else 
					System.out.println("\nN�mero inv�lido");

	}

}
