package atc;

import java.util.Random;

public class Puzzles {

	static int number;
	static Random generator = new Random();
	static int temp;

	Puzzles() {
	}

	public static int puzzle1(int textSpeed) {

		TextUtils.slowPrint("No terminal de controle, P2 vê uma sequência numérica piscando na tela:\r\n", textSpeed);
		number = generator.nextInt(6);
		if (number < 2) {
			number = 2;
		}

		for (int n = 1; n <= 5; n++) {
			number = number * 2;
			System.out.println(number);
		}

		System.out.println("Qual o próximo número da sequência?");
		number = number*2;
		return number;
	}

	public static int puzzle2(int textSpeed) {

		TextUtils.slowPrint("Para estabilizar o sistema, P2 precisa calcular a energia total de um reator.\r\n"
				+ "O terminal mostra:\r\n"
				+ "“Três núcleos com potências crescentes — o segundo é o dobro do primeiro, e o terceiro é 3 unidades \n"
				+ " acima do segundo. A soma deles é 33. Qual é o valor da potência do primeiro núcleo?”", textSpeed);

		System.out.print("R: ");
		number = 6;
		return number;
	}
}
