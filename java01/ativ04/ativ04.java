package ativ04;

import java.util.Scanner;

public class ativ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num;
		
		Scanner scan= new Scanner(System.in);
			
		System.out.println("\nEntre com um n�mero: ");
		num= scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("\n O n�mero: "+num+" � par e a raiz �: "+Math.sqrt(num));
		}
		else {
			System.out.println("\n O n�mero: "+num+" � impar e ele elevado ao quadrado �: "+Math.pow(num, 2));
		}
	}

}
