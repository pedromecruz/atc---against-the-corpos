package atc;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int tempo = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Selecione a dificuldade: \nNormal. \nDificil.");
		String difficulty = input.nextLine().toUpperCase();

		while (tempo != 3 && tempo != 4) {

			if (difficulty.startsWith("N")) { // define a dificuldade para normal
				Player player = new Player(100); // mais vida de jogador
				tempo = 4; // mais tempo

			} else if (difficulty.startsWith("D")) { // define a dificuldade para dificil
				Player player = new Player(80); // menos vida de jogador
				tempo = 3; // menos tempo
			} else {
				System.out.println("Insira uma dificuldade válida");
				difficulty = input.nextLine().toUpperCase();
			}
		}

		System.out.println("Selecione a classe: \nVelocidade. \\nForça. \nInteligência.");
		String playerClass = input.nextLine().toUpperCase();
		
		

	}

}
