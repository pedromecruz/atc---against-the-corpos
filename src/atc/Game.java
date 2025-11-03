package atc;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		// VARIAVEIS USADAS NO FUNCIONAMENTO DO JOGO
		int tempo = 0;
		int option = 0;
		int textSpeed = 100000;

		// INSTANCIA O JOGADOR
		Player player = new Player();

		// INPUT DE OPÇÕES
		Scanner input = new Scanner(System.in);

		// ABERTURA
		TextUtils.slowPrint(GameTexts.opening(), 35);

		// DEFINE A VELOCIDADE DO TEXTO DO JOGO
		textSpeed = GameConfigs.gameSpeed(textSpeed, input);

		// SELECAO DE DIFICULDADE
		String difficulty = GameConfigs.gameDifficulty(player, input, tempo);
		System.out.println("\n" + "DIFICULDADE ESCOLHIDA: " + difficulty + "\n");
		GameConfigs.clearConsole();

		// FIM DA CONFIGURACAO
		
		// TEXTO DE PROLOGO
		TextUtils.slowPrint(GameTexts.prologue(), textSpeed);

		// SELECAO DE CLASSE
		GameConfigs.selectPlayerClass(player, input);
		System.out.println("CLASSE ESCOLHIDA: " + player.playerClass + "\n");

		TextUtils.wait(3000);
		GameConfigs.clearConsole();

	

		// TEXTO DO ATO 1 - INTRO
		TextUtils.slowPrint(GameTexts.act1Intro(), textSpeed);

		// ESCOLHA DE ROTA ATO 1
		tempo = Routes.act1ChooseRoute(tempo, input, option, player, textSpeed);
		TextUtils.wait(3000);
		GameConfigs.clearConsole();

		// TEXTO DO ATO 2 - INTRO
		TextUtils.slowPrint(GameTexts.act2Intro(), textSpeed);

		// ESCOLHA DE ROTA ATO 2
		tempo = Routes.act2ChooseRoute(tempo, input, option, player, textSpeed);
		TextUtils.wait(3000);
		GameConfigs.clearConsole();

		// TEXTO DO ATO 3
		TextUtils.slowPrint(GameTexts.act3Intro(), textSpeed);

		// ESCOLHA DE ROTA ATO 3
		tempo = Routes.act3ChooseRoute(tempo, input, option, player, textSpeed);
		TextUtils.wait(3000);
		GameConfigs.clearConsole();
		
		//TEXTO DO ATO 4
		TextUtils.slowPrint(GameTexts.act4Intro(), textSpeed);
		if (player.hp <= 50) {
			TextUtils.slowPrint(GameTexts.act4LowHealth(), textSpeed);
		}
		if (tempo <= 0) {
			TextUtils.slowPrint(GameTexts.act4ZeroTime(), textSpeed);
		}
		TextUtils.slowPrint(GameTexts.act4Choose(), textSpeed);
		
		//ESCOLHA DE ROTA ATO 4
		tempo = Routes.act4ChooseRoute(tempo, input, option, player, textSpeed);
		TextUtils.wait(3000);
		GameConfigs.clearConsole();
		
		//ATO 5
		Routes.act5(tempo, input, option, player, textSpeed);		

	}
}
