package atc;

import java.util.Random;
import java.util.Scanner;

public class Routes {

	static int answer;
	static int number;

	Routes() {

	}

	public static int act1ChooseRoute(int tempo, Scanner input, int option, Player player, int textSpeed) {

		System.out.print("R: ");
		option = input.nextInt();

		while (option > 3 && option < 1) {
			System.out.println("Insira uma opção válida!");
			System.out.print("R: ");
			option = input.nextInt();
		}

		switch (option) {

		case 1:
			TextUtils.slowPrint(GameTexts.act1Route1(), textSpeed);
			tempo -= 1;
			break;

		case 2:
			if (player.playerClass.startsWith("F")) {
				TextUtils.slowPrint(GameTexts.act1Route2Success(), textSpeed);
			} else {
				TextUtils.slowPrint(GameTexts.act1Route2Fail(), textSpeed);
				tempo -= 1;
			}
			break;

		case 3:
			TextUtils.slowPrint(GameTexts.act1Route3(), textSpeed);
			number = Puzzles.puzzle1(textSpeed);
			System.out.print("R: ");
			answer = input.nextInt();

			if (number == answer) {
				TextUtils.slowPrint(GameTexts.act1Route3Success(), textSpeed);
			} else {
				TextUtils.slowPrint(GameTexts.act1Route3Fail(), textSpeed);
				tempo -= 1;
			}

		}

		return tempo;
	}

	public static int act2ChooseRoute(int tempo, Scanner input, int option, Player player, int textSpeed) {

		System.out.print("R: ");
		option = input.nextInt();

		while (option > 3 && option < 1) {
			System.out.println("Insira uma opção válida!");
			System.out.print("R: ");
			option = input.nextInt();
		}

		switch (option) {

		case 1:
			TextUtils.slowPrint(GameTexts.act2Route1(), textSpeed);
			tempo -= 1;
			break;

		case 2:
			if (player.playerClass.startsWith("I")) {
				TextUtils.slowPrint(GameTexts.act2Route3Success(), textSpeed);
			} else {
				TextUtils.slowPrint(GameTexts.act2Route3Fail(), textSpeed);
				tempo -= 1;
			}
			break;

		case 3:
			TextUtils.slowPrint(GameTexts.act2Route3(), textSpeed);
			number = Puzzles.puzzle2(textSpeed);
			if (number == answer) {
				TextUtils.slowPrint(GameTexts.act2Route2Success(), textSpeed);
			} else {
				TextUtils.slowPrint(GameTexts.act2Route2Fail(), textSpeed);
				tempo -= 1;
			}

		}

		return tempo;
	}

	public static int act3ChooseRoute(int tempo, Scanner input, int option, Player player, int textSpeed) {

		System.out.print("R: ");
		option = input.nextInt();

		while (option > 3 && option < 1) {
			System.out.println("Insira uma opção válida!");
			System.out.print("R: ");
			option = input.nextInt();
		}

		switch (option) {

		case 1:
			TextUtils.slowPrint(GameTexts.act3Route1(), textSpeed);
			tempo -= 1;
			break;

		case 2:
			TextUtils.slowPrint(GameTexts.act3Route2(), textSpeed);

			// INSTANCIA O MINI-CHEFE ECHO E DEFINE SUA VIDA
			Enemy echo = new Enemy(120);
			echo.defense = 12;
			Battle.echoBattle(player, echo, input, textSpeed);
		}

		return tempo;
	}

	public static int act4ChooseRoute(int tempo, Scanner input, int option, Player player, int textSpeed) {

		System.out.print("R: ");
		option = input.nextInt();

		while (option > 3 && option < 1) {
			System.out.println("Insira uma opção válida!");
			System.out.print("R: ");
			option = input.nextInt();
		}

		switch (option) {

		case 1:
			TextUtils.slowPrint(GameTexts.act4Route1(), textSpeed);
			tempo -= 1;
			break;

		case 2:
			TextUtils.slowPrint(GameTexts.act4Route2(), textSpeed);
			tempo -= 2;
			break;

		case 3:
			if (player.playerClass.startsWith("V")) {
				TextUtils.slowPrint(GameTexts.act4Route3Success(), textSpeed);
			} else {
				TextUtils.slowPrint(GameTexts.act4Route3Failure(), textSpeed);
			}

		}

		return tempo;
	}

	public static void act5(int tempo, Scanner input, int option, Player player, int textSpeed) {
		TextUtils.slowPrint(GameTexts.act5Intro(), textSpeed);
		if (tempo <= 0) {
			TextUtils.slowPrint(GameTexts.act5Route1(), textSpeed);
		} else {
			TextUtils.slowPrint(GameTexts.act5Route2(), textSpeed);
			Enemy boss = new Enemy(200);
			Battle.bossBattle(player, boss, input, textSpeed);
		}

		if (player.hp > 0) {
			TextUtils.slowPrint(GameTexts.act5Final(), textSpeed);
		} else {

		}

	}

}
