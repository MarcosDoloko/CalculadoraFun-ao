import java.util.Scanner;

public class CalculadoraJavaMenu {

	public static Scanner entrada = new Scanner(System.in);

	public static int Soma(int a, int b) {

		int soma;

		soma = a + b;

		return soma;

	}

	public static int Produto(int a, int b) {

		int prod;

		prod = a * b;

		return prod;

	}

	public static int Subtracao(int a, int b) {

		int Sub;

		Sub = a - b;

		return Sub;

	}

	public static int Divisao(int a, int b) {

		int Div;

		Div = a / b;

		return Div;

	}

	public static int raizq(int a) {

		int raiz;

		raiz = a ^ 2;

		return raiz;

	}

	public static int Potencia(int a, int b) {

		int pot;

		pot = a ^ b;

		return pot;

	}

	public static void main(String[] args) {
		int menu = 7;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite sua opção: ");

			do {
				System.out.println("\n(1) Somar");
				System.out.println("(2) Multiplicar");
				System.out.println("(3) Subtrair");
				System.out.println("(4) Dividir");
				System.out.println("(5) Raiz quadrada");
				System.out.println("(6) Potenciação");

				menu = entrada.nextInt();

				System.out.println("entrada de dados");
				int n1, n2;

				n1 = entrada.nextInt();
				n2 = entrada.nextInt();

				int resultadoSoma = Soma(n1, n2);
				int resultadoSub = Subtracao(n1, n2);			
				int resultadoMult = Produto(n1, n2);				
				int resultadoDiv = Divisao(n1, n2);			
				int resultadoRaiz = raizq(n1);				
				int resultadoPot = Potencia(n1, n2);
				
				

				switch (menu) {
				case 1:
					menu = resultadoSoma;
					System.out.println("\nA soma é: " + resultadoSoma);
					break;
				case 2:
					menu = resultadoMult;
					System.out.println("A multiplicação é: " + resultadoMult);
					break;
				case 3:
					menu = resultadoSub;
					System.out.println("A subtração é: " + resultadoSub);
					break;
				case 4:
					menu = resultadoDiv;
					System.out.println("A divisão é: " + resultadoDiv);
					break;
				case 5:
					menu = resultadoRaiz;
					System.out.println("A Raiz quadrada é: " + resultadoRaiz);
					break;
				case 6:
					menu = resultadoPot;
					System.out.println("A Potenciacão é: " + resultadoPot);
					break;
				default:
					System.out.println("Opção ");
					break;
				}
			} while (menu != 7);
		}

	}

}
