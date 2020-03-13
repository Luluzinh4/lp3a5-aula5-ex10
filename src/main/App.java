package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int num1;
		int num2;
		byte operacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora de Inteiros");
		System.out.println("=======================");
		System.out.println("        Opera��es      ");
		System.out.println("       1 para soma     ");
		System.out.println("    2 para subtra��o   ");
		System.out.println("  3 para multiplica��o ");
		System.out.println("    4 para divis�o     ");
		System.out.println("=======================");
		
		do {
			System.out.print("Selecione uma opera��o: ");
			operacao = scanner.nextByte();
			if(operacao < 1 || operacao > 4) {
				System.out.println("D�gito inv�lido. Tente novamente!");
			}
		} while(operacao < 1 || operacao > 4);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = scanner.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = scanner.nextInt();
		
		Thread calc = new Thread(new Calculadora(num1, num2, operacao));
		calc.start();
		
		scanner.close();

	}

}
