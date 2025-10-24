package atc;

import java.util.Scanner;
import java.util.Random;

public class Game {

	// ---------------------------------------------------------------------
	// INICIALIZANDO O SISTEMA
	public static void main(String[] args) {

		int tempo = 0;
		int option;
		int playerTurn;
		int enemyTurn;
		int enemyOption;

		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		// ---------------------------------------------------------------------
		// CONFIGURANDO O JOGO
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

		System.out.println("Selecione a classe: \n" + "Velocidade. \n" + "Força. \n" + "Inteligência.");
		// o trecho acima define a classe
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
				System.out.println("Insira uma classe válida!");
				System.out.print("R: ");
				playerClass = input.nextLine().toUpperCase();
			}
		} while (!playerClass.startsWith("V") && !playerClass.startsWith("F") && !playerClass.startsWith("I"));

		System.out.println("Classe escolhida: " + player.getPlayerClass());
		System.out.println("Seja bem vindo ao nosso jogo. ");
		System.out.println(" ");

//--------------------------------------------------------------------- COMEÇANDO O JOGO 

		// ---------------------------------------------------------------------
		// SIMULANDO O COMBATE

		Enemy enemy1 = new Enemy(100); // construtor do inimigo ja entregando o hp
		enemy1.defense = 12;
		enemy1.setDefense(12);
		enemyTurn = 1;
		playerTurn = 1;

		while (enemy1.hp > 0 && player.hp > 0) {

			playerTurn = 1; // resetando o turno do jogador
			enemyTurn = 1;// resetando o turno do inimigo

			// -------------------------------ACAO DO JOGADOR
			if (playerTurn > 0) {

				System.out.println("Sua vez!");
				System.out.println("Selecione sua ação: \n" + "1. Ataque \n" + "2. Esquiva \n" + "3. Contra-ataque");
				option = input.nextInt();

				while (option > 3 && option < 1) {
					System.out.println("Insira uma opção válida!");
					option = input.nextInt();
				}

				switch (option) {

				case 1: // acao de ataque
					System.out.println("Você tenta atacar o inimigo.");
					player.getAttack();
					if (player.hit >= enemy1.defense) {
						System.out.println("Você acerta!");
						enemy1.hp -= player.getDamage();
						System.out.println("Vida inimiga: " + enemy1.hp);
					} else {
						System.out.println("Errou o ataque!");
					}
					System.out.println(" ");
					System.out.println("-------------------------------------");

					break;

				case 2: // acao de esquiva
					System.out.println("Você induziu seu inimigo a um ataque...");
					player.getDodge();
					enemy1.getAttack();
					if (player.dodge > enemy1.hit) {
						System.out.println("Você esquivou com sucesso!");
						System.out.println("Seu inimigo perdeu o turno errando o ataque!");
						enemyTurn = 0; // definiu o turno do inimigo para 0, pois perdeu o turno errando o ataque
					} else if (player.dodge <= enemy1.hit) {
						System.out.println("Você não esquivou bem o suficiente e levou uma pancada leve.");
						player.hp -= (enemy1.getDamage() / 2);
						System.out.println("Vida do jogador: " + player.hp);

					}
					System.out.println(" ");
					System.out.println("-------------------------------------");

					break;

				case 3: // acao de contra-ataque
					System.out.println("Você induziu seu inimigo a um ataque...");
					player.getCounter();
					enemy1.getAttack();
					if (player.counter > enemy1.hit) {
						System.out.println("Você esquivou e contra-atacou com sucesso!");
						enemy1.hp -= player.getDamage();
						System.out.println("Seu inimigo perdeu o turno errando o ataque!");
						System.out.println("Vida inimiga: " + enemy1.hp);
						enemyTurn = 0; // definiu o turno do inimigo para 0, pois perdeu o turno errando o ataque
					} else if (player.counter <= enemy1.hit) {
						System.out.println("Você não esquivou bem o suficiente e levou uma pancada leve.");
						player.hp -= (enemy1.getDamage() / 2);
						System.out.println("Vida do jogador: " + player.hp);

					}
					System.out.println(" ");
					System.out.println("-------------------------------------");

					break;
				}
			} else {
				System.out.println("Você perdeu seu turno!");
			}

			// -------------------------------ACAO DO INIMIGO

			if (enemy1.hp > 0) {

				if (enemyTurn > 0) {
					enemyOption = generator.nextInt(4);
					if (enemyOption == 0) {
						enemyOption += 1;
					}
					switch (enemyOption) {

					case 1: // acao de ataque inimiga
						System.out.println("O inimigo tentou te atacar.");
						enemy1.getAttack();
						if (enemy1.hit >= player.defense) {
							System.out.println("Ele acerta!");
							player.hp -= enemy1.getDamage();
							System.out.println("Vida do jogador: " + player.hp);
						} else {
							System.out.println("O inimigo errou o ataque!");
						}
						System.out.println(" ");
						System.out.println("-------------------------------------");

						break;

					case 2: // acao de esquiva inimiga
						System.out.println("O inimigo induziu o jogador à um ataque...");
						enemy1.getDodge();
						player.getAttack();
						if (enemy1.dodge > player.hit) {
							System.out.println("O inimigo esquivou com sucesso.");
							System.out.println("Você perdeu seu turno devido ao ataque desperdiçado!");
							playerTurn = 0;
						} else if (enemy1.dodge <= player.hit) {
							System.out.println("O inimigo não esquivou bem o suficiente e levou uma pancada leve.");
							enemy1.hp -= (player.getDamage() / 2);
							System.out.println("Vida inimiga: " + enemy1.hp);

						}
						System.out.println(" ");
						System.out.println("-------------------------------------");

						break;

					case 3: // acao de contra-ataque
						System.out.println("O inimigo induziu o jogador à um ataque...");
						enemy1.getCounter();
						player.getAttack();
						if (enemy1.counter > player.hit) {
							System.out.println("O inimigo esquivou e contra-atacou com sucesso.");
							player.hp -= enemy1.getDamage();
							System.out.println("Vida do jogador: " + player.hp);
						} else if (enemy1.counter <= player.hit) {
							System.out.println("O inimigo não esquivou bem o suficiente e levou uma pancada leve.");
							enemy1.hp -= (player.getDamage() / 2);
							System.out.println("Vida inimiga: " + enemy1.hp);

						}
						System.out.println(" ");
						System.out.println("-------------------------------------");

						break;
					}

				} else {
					System.out.println("O inimigo perdeu seu turno!");
				}

			} else {
				System.out.println("Você derrotou o inimigo!");
			}
		}
	}

}
