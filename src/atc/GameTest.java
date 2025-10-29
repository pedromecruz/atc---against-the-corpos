package atc;

import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {

		int tempo = 0;
		int option;

		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		// ---------------------------------------------------------------------
		// CONFIGURANDO O JOGO

		// selecao de dificuldade
		System.out.println("Selecione a dificuldade: \n" + "Fácil. \n" + "Normal. \n" + "Dificil.");
		System.out.print("R: ");
		String difficulty = input.nextLine().toUpperCase();
		Player player = new Player();

		while (tempo == 0) {

			if (difficulty.startsWith("F")) {
				player.hp = 120; // mais vida de jogador
				tempo = 5; // mais tempo
				difficulty = "Fácil";

			} else if (difficulty.startsWith("N")) { // define a dificuldade para normal
				player.hp = 100; // vida de jogador padrao
				tempo = 4; // tempo padrao
				difficulty = "Normal";

			} else if (difficulty.startsWith("D")) { // define a dificuldade para dificil
				player.hp = 80; // menos vida de jogador
				tempo = 3; // menos tempo
				difficulty = "Difícil";
			} else {
				System.out.println("Insira uma dificuldade válida");
				System.out.print("R: ");
				difficulty = input.nextLine().toUpperCase();
			}
		}
		System.out.println("Dificildade escolhida: " + difficulty);

		// seleção de classe
		System.out.println("Escolha: \n" + "Força: Par de braços \n" + "Velocidade: Prótese inferior \n"
				+ "Inteligência: Implante cervical");
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

		System.out.println("Opção escolhida: " + player.playerClass);
		System.out.println("Seja bem vindo ao nosso jogo. ");
		System.out.println(" ");

		// __________________________________________________________COMBATE COM BOSS

		int tempBuff;
		int enemyTurn = 0;
		int enemyOption;

		Enemy boss = new Enemy(250); // vida do boss em 250
		boss.status = "Normal";

		do {
			enemyTurn += 1; // no início do loop, o inimigo pode agir

			System.out.println("O que P2 fará?");
			System.out.println("1. Ataque");
			System.out.println("2. Esquiva");
			System.out.println("3. Contra-ataque");
			System.out.print("Escolha sua ação: ");
			option = input.nextInt();

			while (option < 1 || option > 3) {
				System.out.println("Insira uma opção válida.");
				option = input.nextInt();
			}

			switch (option) {
			case 1: // ataque comum
				player.hit = player.getAttack(); // o método retorna um valor entre 1 e 20

				if (player.hit == 20) { // acerto crítico
					boss.hp -= (player.getDamage() * 2);
					enemyTurn -= 2;
					System.out.println("P2 consegue mirar em uma falha na cyber-armadura d'O Chefe. Acerto crítico.");

				} else if (player.hit == 1) { // falha crítica
					System.out.println("O pé de P2 pisa milimetros no lugar errado.");
					System.out.println("—Você é um clone antigo, P2. Ultrapassado. Você erra demais!");
					System.out.println("O Chefe retorna um ataque no tórax de P2 \n" + " ");
					player.hp -= boss.getAttack();

				} else { // acerto comum
					boss.hp -= player.getDamage();
					System.out.println("P2 consegue acertar um sólido soco na costela d'O Chefe. \n");
				}
				break;

			case 2: // esquiva
				player.dodge = player.getDodge();
				if (player.dodge == 20) { // esquiva crítica
					System.out.println(
							"P2 atrai O Chefe para um ataque... e consegue um passo perfeito. O Chefe está desbalanceado.");
					enemyTurn = -2;

				} else if (player.dodge == 1) { // falha crítica
					System.out.println(
							"P2 atrai O Chefe para um ataque... mas erra o passo. Erra de forma terrível. O chefe tem uma chance clara de contra-ataque, e não falha.");
					player.hp -= boss.getDamage();

				} else if (player.dodge > boss.getAttack()) { // esquiva comum
					System.out.println(
							"P2 atrai O Chefe para um ataque... e consegue um bom passo. O Chefe abre uma oportunidade. \n"
									+ " ");
					enemyTurn = 0;

				} else { // erro comum
					System.out.println(
							"P2 atrai O Chefe para um ataque... mas erra o passo. Isso abre uma pequena oportunidade, que O Chefe aproveita. ");
					player.hp -= (boss.getDamage() / 2);
				}
				break;

			case 3: // Contra-ataque
				player.counter = player.getCounter();

				if (player.counter == 20) { // acerto crítico
					System.out.println(
							"P2 atrai O Chefe para um ataque... e consegue um passo ofensivo perfeito. Com isso, desfere 2 fortes golpes n'O Chefe. Isso o desbalancea. \n"
									+ " ");
					boss.hp -= player.getDamage();
					boss.hp -= player.getDamage();
					enemyTurn = -1;

				} else if (player.counter == 1) { // falha crítica
					System.out.println("P2 atrai O Chefe para um ataque... mas perde totalmente o passo ofensivo. Uma ótima oportunidade se apresenta, e O Chefe não desperdiça. \n"
							+ " ");
					player.hp -= boss.getDamage();

				} else if (player.counter > boss.getAttack()) { //contra-ataque comum
					System.out.println("P2 atrai O Chefe para um ataque... e consegue um passo ofensivo perfeito. Com isso, desfere um limpo soco n'O Chefe. Isso o desbalancea.");
					boss.hp -= player.getDamage();
					enemyTurn = -1;
					
				} else { //erro comum
					System.out.println("P2 atrai O Chefe para um ataque... mas erra o passo ofensivo. Isso abre uma pequena oportunidade, que O Chefe aproveita. ");
					player.hp -= (boss.getDamage() /2);
				}
				break;
			}

			System.out.println("P2 está com " + player.hp + " de vida.");
			System.out.println("O Chefe está com " + boss.hp + " de vida. \n" + " ");
//_________________________________ ENCERRAMENTO DE TURNO 

			if (enemyTurn > 0) { // ação do chefe

			} else { // chefe perdeu ação
				System.out.println("O Chefe está usando suas energias para se recuperar. \n" + " ");
			}

		} while (player.hp > 0 && boss.hp > 0);

	}

}
