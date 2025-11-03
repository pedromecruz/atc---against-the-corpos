package atc;

import java.util.Scanner;

public class GameConfigs {

	GameConfigs() {

	}

	public static int gameSpeed(int textSpeed, Scanner input) {

		String textSpeedOption;

		System.out.print("Selecione a velocidade do texto: (Acredite, o jogo tem bastante texto)\n" + "Normal \n"
				+ "Rápido (recomendado para uma primeira jogatina) \n" + "Muito rápido \n" + "Instantâneo (recomendado para testes) \n");

		do {
			System.out.print("R: ");
			textSpeedOption = input.nextLine().toUpperCase();
			System.out.println("");

			if (textSpeedOption.startsWith("N")) {
				textSpeed = 35;
			} else if (textSpeedOption.startsWith("R")) {
				textSpeed = 20;
			} else if (textSpeedOption.startsWith("M")) {
				textSpeed = 5;
			} else if (textSpeedOption.startsWith("I")) {
				textSpeed = 0;
			} else {
				System.out.println("Insira uma resposta válida!");
			}
		} while (textSpeed == 100000);

		return textSpeed;

	}

	public static String gameDifficulty(Player player, Scanner input, int tempo) {

		System.out.println("Selecione a dificuldade: \n" + "Fácil \n" + "Normal \n" + "Dificil");
		System.out.print("R: ");
		String difficulty = input.nextLine().toUpperCase();

		while (tempo == 0) {

			if (difficulty.startsWith("F")) {
				player.hp = 160; // mais vida de jogador
				tempo = 5; // mais tempo
				difficulty = "Fácil";

			} else if (difficulty.startsWith("N")) { // define a dificuldade para normal
				player.hp = 140; // vida de jogador padrao
				tempo = 4; // tempo padrao
				difficulty = "Normal";

			} else if (difficulty.startsWith("D")) { // define a dificuldade para dificil
				player.hp = 120; // menos vida de jogador
				tempo = 3; // menos tempo
				difficulty = "Difícil";
			} else {
				System.out.println("Insira uma dificuldade válida!");
				System.out.print("R: \n");
				difficulty = input.nextLine().toUpperCase();
			}
		}

		return difficulty;

	}

	public static void selectPlayerClass(Player player, Scanner input) {
		System.out.print("R: ");
		String playerClass = input.nextLine().toUpperCase();

		do {

			if (playerClass.startsWith("V")) {
				player.playerClass = "Velocidade";
				player.setPlayerClass("Velocidade");
				// chama o método de definir classe, para garantir que não seja apenas um
				// valorzinho na variável
			} else if (playerClass.startsWith("F")) {
				player.playerClass = "Forca";
				player.setPlayerClass("Forca");

			} else if (playerClass.startsWith("I")) {
				player.playerClass = "Inteligencia";
				player.setPlayerClass("Inteligencia");

			} else {
				System.out.println("Insira uma opção válida!");
				System.out.print("R: ");
				playerClass = input.nextLine().toUpperCase();
			}

		} while (!playerClass.startsWith("V") && !playerClass.startsWith("F") && !playerClass.startsWith("I"));

	}

	public static void clearConsole() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
}
