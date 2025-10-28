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

		// __________________________________________________________TESTANDO COMBATE
		
		int tempBuff;
		int enemyTurn;
		int enemyOption;
		
		Enemy boss = new Enemy(250); //vida do boss em 250
		
		do {
		    enemyTurn = 1; // no início do loop, o inimigo pode agir

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
		        case 1:
		            // ⚔️ Ataque normal
		            int atkRoll = player.getAttack(); // o método retorna um valor entre 1 e 20, por exemplo
		            System.out.println("Jogador ataca! (Rolagem: " + atkRoll + ")");

		            if (atkRoll == 20) { // crítico
		                int danoCritico = player.attack * 2;
		                boss.hp -= danoCritico;
		                enemyTurn -= 2;
		                System.out.println("💥 Acerto CRÍTICO! Dano em dobro: " + danoCritico);
		            } else if (atkRoll == 1) { // falha crítica
		                System.out.println("❌ Falha crítica! O inimigo contra-ataca!");
		                player.hp -= boss.attack;
		                System.out.println("P2 recebeu " + boss.attack + " de dano!");
		            } else {
		                boss.hp -= player.attack;
		                System.out.println("O inimigo recebeu " + player.attack + " de dano!");
		            }
		            break;

		        case 2:
		            // 🌀 Esquiva
		            int dodgeRoll = player.getDodge();
		            System.out.println("Jogador tenta esquivar! (Rolagem: " + dodgeRoll + ")");

		            if (dodgeRoll == 20) { // esquiva crítica
		                System.out.println("💨 Esquiva PERFEITA! O inimigo perde 2 turnos!");
		                enemyTurn -= 2;
		            } else if (dodgeRoll == 1) { // falha crítica
		                System.out.println("❌ Falha crítica! O inimigo acerta o jogador!");
		                player.hp -= boss.attack;
		                System.out.println("P2 recebeu " + boss.attack + " de dano!");
		            } else if (dodgeRoll > boss.attack) {
		                System.out.println("✅ Esquiva bem-sucedida! O inimigo perde o próximo turno.");
		                enemyTurn = 0;
		            } else {
		                System.out.println("💢 Esquiva falhou! O inimigo acerta o ataque.");
		                player.hp -= boss.attack;
		                System.out.println("P2 recebeu " + boss.attack + " de dano!");
		            }
		            break;

		        case 3:
		            // ⚡ Contra-ataque
		            int counterRoll = player.getCounterAttack();
		            System.out.println("Jogador tenta um contra-ataque! (Rolagem: " + counterRoll + ")");

		            if (counterRoll == 20) { // crítico
		                System.out.println("💥 Contra-ataque CRÍTICO! O jogador acerta DUAS vezes!");
		                for (int i = 0; i < 2; i++) {
		                    int dano = generator.nextInt(33) + 1;
		                    boss.hp -= dano;
		                    System.out.println("Golpe #" + (i + 1) + ": causou " + dano + " de dano!");
		                }
		                enemyTurn -= 2;
		            } else if (counterRoll == 1) { // falha crítica
		                System.out.println("❌ Falha crítica! O inimigo aproveita e acerta o jogador!");
		                player.hp -= boss.attack;
		                System.out.println("P2 recebeu " + boss.attack + " de dano!");
		            } else if (counterRoll > boss.attack) {
		                int dano = generator.nextInt(33) + 1;
		                System.out.println("✅ Contra-ataque bem-sucedido! Dano: " + dano);
		                boss.hp -= dano;
		                enemyTurn = 0;
		            } else {
		                System.out.println("💢 O inimigo foi mais rápido! O jogador leva o ataque.");
		                player.hp -= boss.attack;
		                System.out.println("P2 recebeu " + boss.attack + " de dano!");
		            }
		            break;
		    }

		    // Exibe status ao fim da ação
		    System.out.println("\n[STATUS]");
		    System.out.println("P2 HP: " + player.hp);
		    System.out.println("Boss HP: " + boss.hp);
		    System.out.println("EnemyTurn: " + enemyTurn);

		} while (player.hp > 0 && boss.hp > 0);
		
	}

}
