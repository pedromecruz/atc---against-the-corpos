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
		
		do { //loop de combate por turnos
			System.out.println("O que P2 fará?");
			System.out.print("1. Ataque \n"
					+ "2. Preparar esquiva \n"
					+ "3. Preparar contra-ataque \n"
					+ " \n"
					+ "R: ");
			option = input.nextInt();
			
			while (option > 3 && option < 1) { //verificador de opção valida
				System.out.println("Insira uma opção válida.");
				option = input.nextInt();
			}
			
			switch (option) {
			
			}
			
			
		} while (player.hp >= 1 && boss.hp >= 1); //fim do loop de combate
		
		
		
		enemyOption = generator.nextInt(6);
		if (enemyOption == 0) {
			enemyOption+=1;
		}
		
		switch (enemyOption) {
		case 1: //
		}
		
	}

}
