package main;

public class Calculadora implements Runnable{
	
	private int numero1;
	private int numero2;
	private int resultado;
	private byte op;
	
	public Calculadora(int numero1, int numero2, byte op) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.op = op;
	}

	@Override
	public void run() {
		if(op == 1) {
			resultado = numero1 + numero2;
			System.out.println("A soma dos números é " + resultado);
		}
		if(op == 2) {
			resultado = numero1 - numero2;
			System.out.println("A subtração dos números é " + resultado);
		}
		if(op == 3) {
			resultado = numero1 * numero2;
			System.out.println("A multiplicação dos números é " + resultado);
		}
		if(op == 4) {
			resultado = numero1 / numero2;
			System.out.println("A divisão dos números é " + resultado);
		}
	}
	
}
