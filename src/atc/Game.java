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
		
		//selecao de dificuldade
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

		
		//seleção de classe
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

//--------------------------------------------------------------------- COMEÇANDO O JOGO 

		//ATO 1
		System.out.println("Como P2 deve tentar invadir? \n"
				+ "1. Subir a escada. \n"
				+ "2. Forçar o portão \n"
				+ "3. Consertar o sistema de controle");
		option = input.nextInt();
		
		switch (option) {
		
		case 1:
			tempo = tempo - 1;
		break;
		
		case 2:
			if (!player.playerClass.startsWith("F")) {
				tempo = tempo-1;
			} else {
	
			}
			break;
			
		case 3:
			break;
		
		
		}
		

	}

}
