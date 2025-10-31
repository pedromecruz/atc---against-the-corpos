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

		Enemy boss = new Enemy(250); // vida do boss em 250

		int playerTurn = 1;

		int tempHP = 0;
		int bossTempHP;
		int tempBuff = 0;
		int enemyTurn = 0;
		int enemyOption;
		boss.status = "Normal";

		do {

			if (tempBuff < 1) { // valida o status do boss
				boss.status = "Normal";
			}

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno
			bossTempHP = boss.hp; // armazena a vida do inicio do turno
			enemyTurn += 1; // no início do loop, o inimigo pode agir
			tempBuff -= 1;
			playerTurn += 1;// no início do loop, o jogador pode agir

			if (playerTurn > 0) {

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
						System.out
								.println("P2 consegue mirar em uma falha na cyber-armadura d'O Chefe. Acerto crítico.");

					} else if (player.hit == 1) { // falha crítica
						System.out.println("O pé de P2 pisa milimetros no lugar errado.");
						System.out.println("—Você é um clone antigo, P2. Ultrapassado. Você erra demais!");
						System.out.println("O Chefe retorna um ataque no tórax de P2 \n" + " ");
						player.hp -= boss.getAttack();

					} else if (player.hit >= boss.defense) { // acerto comum
						boss.hp -= player.getDamage();
						System.out.println("P2 consegue acertar um sólido soco na costela d'O Chefe. \n");
					} else {
						System.out.println("P2 erra seu ataque, sem abrir brechas.");
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
						System.out.println(
								"P2 atrai O Chefe para um ataque... mas perde totalmente o passo ofensivo. Uma ótima oportunidade se apresenta, e O Chefe não desperdiça. \n"
										+ " ");
						player.hp -= boss.getDamage();

					} else if (player.counter > boss.getAttack()) { // contra-ataque comum
						System.out.println(
								"P2 atrai O Chefe para um ataque... e consegue um passo ofensivo perfeito. Com isso, desfere um limpo soco n'O Chefe. Isso o desbalancea.");
						boss.hp -= player.getDamage();
						enemyTurn = -1;

					} else { // erro comum
						System.out.println(
								"P2 atrai O Chefe para um ataque... mas erra o passo ofensivo. Isso abre uma pequena oportunidade, que O Chefe aproveita. ");
						player.hp -= (boss.getDamage() / 2);
					}
					break;
				}

				if (boss.hp != bossTempHP && boss.status.equals("ELECTRIC")) { // aplica o efeito da armadura elétrica
					player.hp -= boss.getElectricDamage();
					System.out.println("Após o ataque, P2 sofreu um choque elétrico da armadura d'O Chefe. \n" + " ");
				}

				if (player.hp != tempHP && boss.status.equals("FORTIFIED")) { // aplica o efeito do fortalecimento do
																				// chefe
					player.hp -= boss.getDamage();
					System.out.println(
							"Com o aprimoramento de impacto d'O Chefe, P2 sente uma dor devastadora, como se outro golpe tivesse o atingido. \n"
									+ " ");
				}
			} else {
				System.out.println("P2 está se recuperando. Não agirá neste turno.");
			}

			System.out.println("P2 está com " + player.hp + " de vida.");
			System.out.println("O Chefe está com " + boss.hp + " de vida. \n" + " ");

//_________________________________ ENCERRAMENTO DE TURNO 

			tempHP = player.hp; // armazena a vida do jogador no inicio do turno inimigo
			bossTempHP = boss.hp; // armazena a vida do inicio do turno inimigo

			if (enemyTurn > 0) { // ação do chefe

				enemyOption = generator.nextInt(6);
				if (enemyOption == 0) {
					enemyOption = 1;
				}

				switch (enemyOption) {

				case 1: // define o BUFF ELETRICO
					if (tempBuff < 1) {
						boss.setElectricStatus();
						tempBuff = 2;
						break;
					} else {// irá para o próximo case
					}

				case 2: // DEFINE O BUFF FORTIFICADO
					if (tempBuff < 1) {
						boss.setFortifiedStatus();
						tempBuff = 2;
						break;
					} else {// irá para o próximo case
					}

				case 3: // ação de ataque inimiga;
					boss.hit = boss.getAttack();
					if (boss.hit == 20) { // acerto critico
						System.out.println("O golpe d'O Chefe atravessa o ar como um relâmpago.\r\n"
								+ "O impacto é seco, brutal — P2 mal tem tempo de reagir. \n" + " ");
						player.hp -= (boss.getDamage() * 2);

					} else if (boss.hit == 1) { // erro critico
						System.out.println("O Chefe ataca com força demais e perde o equilíbrio.\r\n"
								+ "Seu soco corta o ar e raspa no chão, abrindo uma brecha perigosa.");
						System.out.println("P2 contra-ataca com precisão. \n" + "");
						boss.hp = player.getDamage();

					} else if (boss.hit >= player.defense) { // acerto comum
						System.out.println("O Chefe golpeia o ombro de P2 — um golpe limpo, preciso.\r\n"
								+ "P2 sente dor enquanto o olhar do Chefe permanece frio.\n");
						player.hp -= boss.getDamage();

					} else { // erro comum
						System.out.println("O soco passa a centímetros do alvo, cortando apenas o vento.\r\n"
								+ "P2 recua a tempo, e o Chefe o observa com desprezo contido. \n");
					}
					break;

				case 4: // ação de esquiva
					boss.dodge = boss.getDodge();
					if (boss.dodge == 20) { // esquiva acerto critico
						System.out.println("O Chefe se move antes mesmo do ataque começar.\r\n"
								+ "A esquiva é perfeita — um desvio fluido, quase coreografado. \n"
								+ "“Eu te conheço melhor do que você mesmo.”");
						playerTurn = -2;
					} else if (boss.dodge == 1) { // erro critico
						System.out.println("O Chefe tenta prever o movimento, mas se antecipa demais.\r\n"
								+ "Perde o tempo — e o punho de P2 quase o atravessa.");
						boss.hp = player.getDamage();

					} else if (boss.dodge > player.hit) { // acerto comum
						System.out.println("Ele gira o corpo e o golpe passa de raspão.\r\n"
								+ "A manobra desestabiliza P2, forçando-o a perder o ritmo.");
						playerTurn = -1;

					} else { // erro comum
						System.out.println("A esquiva falha por um instante.\r\n"
								+ "O ataque de P2 acerta o flanco do Chefe, sem grandes estragos.");
						boss.hp -= (player.getDamage() / 2);
					}
					break;

				case 5:
					boss.counter = boss.getCounter();
					if (boss.counter == 20) { // acerto critico
						System.out.println("P2 ataca — mas o Chefe desaparece da linha de visão.\r\n"
								+ "Em um movimento preciso, esquiva e devolve dois golpes seguidos.");
						player.hp -= boss.getDamage();
						player.hp -= boss.getDamage();
						playerTurn = -1;

					} else if (boss.counter == 1) { // erro critico
						System.out.println("O Chefe tenta uma nova esquiva, mas P2 muda o ritmo.\r\n"
								+ "O golpe falha, e a guarda se abre completamente.");
						System.out.println("P2 golpeia com força. ");
						boss.hp -= player.getDamage();

					} else if (boss.counter > player.hit) { // acerto comum
						System.out.println("O Chefe finge vulnerabilidade, e P2 morde a isca.\r\n"
								+ "Um contra-ataque rápido o acerta no flanco.");
						player.hp -= boss.getDamage();
					} else { // erro comum
						System.out.println("O Chefe tenta induzir o ataque, mas P2 o lê por completo.\r\n"
								+ "O punho do clone atinge primeiro.");
						boss.hp -= (player.getDamage() / 2);
					}
				}

				if (boss.hp != bossTempHP && boss.status.equals("ELECTRIC")) { // aplica o efeito da armadura elétrica
					player.hp -= boss.getElectricDamage();
					System.out.println(
							"Após o contra-ataque, P2 sofreu um choque elétrico da armadura d'O Chefe. \n" + " ");
				}

				if (player.hp != tempHP && boss.status.equals("FORTIFIED")) { // aplica o efeito do fortalecimento do
																				// chefe
					player.hp -= boss.getDamage();
					System.out.println(
							"Com o aprimoramento de impacto d'O Chefe, P2 sente uma dor devastadora, como se outro golpe tivesse o atingido. \n"
									+ " ");
				}

			} else { // chefe perdeu ação
				System.out.println("O Chefe está usando suas energias para se recuperar. \n" + " ");
			}

		} while (player.hp > 0 && boss.hp > 0);

	}

}
