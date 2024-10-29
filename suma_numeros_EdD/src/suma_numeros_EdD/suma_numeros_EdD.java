package suma_numeros_EdD;

import java.util.Scanner;

public class suma_numeros_EdD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2;
		System.out.println("La suma da como resultado " + suma);
		
		scanner.close();
	}

}
