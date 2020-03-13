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
		System.out.println("        Operações      ");
		System.out.println("       1 para soma     ");
		System.out.println("    2 para subtração   ");
		System.out.println("  3 para multiplicação ");
		System.out.println("    4 para divisão     ");
		System.out.println("=======================");
		
		do {
			System.out.print("Selecione uma operação: ");
			operacao = scanner.nextByte();
			if(operacao < 1 || operacao > 4) {
				System.out.println("Dígito inválido. Tente novamente!");
			}
		} while(operacao < 1 || operacao > 4);
		
		System.out.print("Digite o primeiro número: ");
		num1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = scanner.nextInt();
		
		Thread calc = new Thread(new Calculadora(num1, num2, operacao));
		calc.start();
		
		scanner.close();

	}

}
