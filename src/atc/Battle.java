package atc;

import java.util.Random;
import java.util.Scanner;

public class Battle {

	static int playerTurn = 1;
	static int tempHP = 0;
	static int bossTempHP;
	static int tempBuff = 0;
	static int enemyTurn = 0;

	// GERADOR PARA ESCOLHA DOS INIMIGOS
	static Random generator = new Random();

	Battle() {
	}

	public static void echoBattle(Player player, Enemy echo, Scanner input, int textSpeed) {

		do {

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno
			bossTempHP = echo.hp; // armazena a vida do inicio do turno
			enemyTurn += 1; // no início do loop, o inimigo pode agir
			tempBuff -= 1;
			playerTurn += 1;// no início do loop, o jogador pode agir

			if (playerTurn > 0) {// TODO O LOOP DE AÇÃO DO JOGADOR
				enemyTurn = BattleManager.playerActionEchoBattle(player, echo, enemyTurn, input, tempHP, bossTempHP, textSpeed);

			} else {
				System.out.println("P2 está se recuperando. Não agirá neste turno.");
			}

//_________________________________ ENCERRAMENTO DE TURNO 

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno inimigo
			bossTempHP = echo.hp; // armazena a vida do inicio do turno inimigo

			if (enemyTurn > 0) { // ação do chefe
				playerTurn = BattleManager.echoAction(player, echo, tempBuff, enemyTurn, playerTurn, generator, bossTempHP,
						bossTempHP, textSpeed);

			} else { // chefe perdeu ação
				System.out.println("O Chefe está usando suas energias para se recuperar. \n" + " ");
			}

			System.out.println("P2 está com " + player.hp + " de vida.");
			System.out.println("ECHO-7 está com " + echo.hp + " de vida. \n" + " ");

			TextUtils.wait(3000);
			GameConfigs.clearConsole();

		} while (player.hp > 0 && echo.hp > 0);
		
		if (player.hp >=1) {
			TextUtils.slowPrint(GameTexts.act3Victory(), textSpeed);
		} else {
			TextUtils.slowPrint(GameTexts.act3Death(), textSpeed);
			System.exit(0);
		}

	}

	public static void bossBattle(Player player, Enemy boss, Scanner input, int textSpeed) {
		do {

			if (tempBuff < 1) { // valida o status do boss
				boss.status = "NORMAL";
			}

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno
			bossTempHP = boss.hp; // armazena a vida do inicio do turno
			enemyTurn += 1; // no início do loop, o inimigo pode agir
			tempBuff -= 1;
			playerTurn += 1;// no início do loop, o jogador pode agir

			if (playerTurn > 0) {// TODO O LOOP DE AÇÃO DO JOGADOR
				BattleManager.playerActionFinalBattle(player, boss, enemyTurn, input, tempHP, bossTempHP, textSpeed);

			} else {
				System.out.println("P2 está se recuperando. Não agirá neste turno.");
			}

//_________________________________ ENCERRAMENTO DE TURNO 

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno inimigo
			bossTempHP = boss.hp; // armazena a vida do inicio do turno inimigo

			if (enemyTurn > 0) { // ação do chefe
				BattleManager.bossAction(player, boss, tempBuff, enemyTurn, playerTurn, generator, bossTempHP,
						bossTempHP, textSpeed);

			} else { // chefe perdeu ação
				System.out.println("O Chefe está usando suas energias para se recuperar. \n" + " ");
			}

			System.out.println("\n"
					+ "P2 está com " + player.hp + " de vida.");
			System.out.println("O Chefe está com " + boss.hp + " de vida. \n" + " ");

			TextUtils.wait(3000);
			GameConfigs.clearConsole();

		} while (player.hp > 0 && boss.hp > 0);

		if (player.hp <= 0) {
			TextUtils.slowPrint(GameTexts.act5Final(), textSpeed);
			System.exit(0);
		} else {
			TextUtils.slowPrint(GameTexts.act5BadFinal(), textSpeed);
			System.exit(0);
		}

	}
}
