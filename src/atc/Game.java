package atc;

import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) throws InterruptedException {

		int tempo = 0;
		int option;
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		Player player = new Player();

		// ---------------------- SELEÇÃO DE DIFICULDADE ----------------------
		System.out.println("=== RPG INVASÃO NOITE ===");
		Thread.sleep(500);
		System.out.println("Escolha a dificuldade do seu desafio:");
		System.out.println("Fácil, Normal ou Difícil");
		System.out.print("R: ");
		String difficulty = input.nextLine().toUpperCase();

		while (tempo == 0) {
			if (difficulty.startsWith("F")) {
				player.hp = 120;
				tempo = 5;
				difficulty = "Fácil";
			} else if (difficulty.startsWith("N")) {
				player.hp = 100;
				tempo = 4;
				difficulty = "Normal";
			} else if (difficulty.startsWith("D")) {
				player.hp = 80;
				tempo = 3;
				difficulty = "Difícil";
			} else {
				System.out.println("Opção inválida! Escolha uma dificuldade válida.");
				System.out.print("R: ");
				difficulty = input.nextLine().toUpperCase();
			}
		}
		System.out
				.println("Dificuldade escolhida: " + difficulty + " | HP Inicial: " + player.hp + " | Tempo: " + tempo);
		Thread.sleep(500);

		// ---------------------- SELEÇÃO DE CLASSE ----------------------
		System.out.println("\nEscolha sua classe:");
		System.out.println("Força: Par de braços");
		System.out.println("Velocidade: Prótese inferior");
		System.out.println("Inteligência: Implante cervical");
		System.out.print("R: ");
		String playerClass = input.nextLine().toUpperCase();

		do {
			if (playerClass.startsWith("V")) {
				player.playerClass = "Velocidade";
				player.setPlayerClass("Velocidade");
			} else if (playerClass.startsWith("F")) {
				player.playerClass = "Forca";
				player.setPlayerClass("Forca");
			} else if (playerClass.startsWith("I")) {
				player.playerClass = "Inteligencia";
				player.setPlayerClass("Inteligencia");
			} else {
				System.out.println("Classe inválida! Tente novamente.");
				System.out.print("R: ");
				playerClass = input.nextLine().toUpperCase();
			}
		} while (!playerClass.startsWith("V") && !playerClass.startsWith("F") && !playerClass.startsWith("I"));

		System.out.println("\nVocê escolheu a classe: " + player.playerClass);
		System.out.println("Seja bem-vindo ao RPG Invasão Noturna.\n");
		Thread.sleep(500);

		// ---------------------- ATO 1: INVASÃO ----------------------
		System.out.println("A chuva fria corta sua pele enquanto você observa o prédio da Aqua Regia.");
		System.out.println("A noite está escura, mas o alvo está acordado.\n");
		Thread.sleep(1000);
		System.out.println("Escolha como P2 irá invadir o prédio:\n");

		System.out.println("1. Subir as escadas para o terraço e entrar por uma janela");
		System.out.println("2. Forçar o portão usando força bruta");
		System.out.println("3. Ligar o painel de controle e tentar o sistema");
		System.out.print("Escolha sua rota (1/2/3): ");
		option = input.nextInt();

		switch (option) {

			case 1: // Subir a escada
				System.out.println("\nVocê escolhe a rota segura: subir pelas escadas.");
				Thread.sleep(500);
				System.out.println("Após alguns minutos de escalada, você chega ao terraço.");
				System.out.println("Uma janela semi-aberta um andar acima espera sua habilidade de escalada.");
				tempo -= 1;
				System.out.println("Você perdeu 1 ponto de tempo. Tempo restante: " + tempo + "\n");
				break;

			case 2: // Forçar o portão
				if (player.playerClass != null && player.playerClass.startsWith("F")) {
					System.out.println("\nSeus braços potentes aplicam força máxima...");
					System.out.println("O portão se abre com um estrondo metálico!");
				} else {
					System.out.println("\nVocê tenta abrir o portão, mas não tem força suficiente...");
					System.out.println("Decide então subir pelas escadas até o terraço.");
					tempo -= 1;
					System.out.println("Você perdeu 1 ponto de tempo. Tempo restante: " + tempo + "\n");
				}
				break;

			case 3: // Enigma de sequência numérica: dobrando
				System.out.println("\nVocê tenta ligar o painel de controle...");
				Thread.sleep(500);

				// Gerando a sequência que dobra
				Random rand = new Random();
				int tamanho = 4; // tamanho da sequência
				int inicio = rand.nextInt(5) + 1; // número inicial entre 1 e 5
				int[] sequencia = new int[tamanho];

				sequencia[0] = inicio;
				for (int i = 1; i < tamanho; i++) {
					sequencia[i] = sequencia[i - 1] * 2; // dobra cada número
				}

				// Mostrando a sequência ao jogador (ocultando o último número)
				System.out.print("O painel mostra a sequência: ");
				for (int i = 0; i < tamanho - 1; i++) {
					System.out.print(sequencia[i] + " ");
				}
				System.out.println("\nQual é o próximo número da sequência?");
				System.out.print("Resposta: ");

				int resposta = input.nextInt();

				if (resposta == sequencia[tamanho - 1]) {
					System.out.println("\nVocê acertou! O portão se abre sem perder tempo.");
					System.out.println("Agora dentro do prédio, o trânsito será facilitado.\n");
				} else {
					System.out.println("\nVocê errou a sequência e perde tempo tentando...");
					tempo -= 1;
					System.out.println("Você perdeu 1 ponto de tempo. Tempo restante: " + tempo + "\n");
				}
				break;

			default:
				System.out.println("\nOpção inválida! Você perde tempo indeciso e decide subir pelas escadas.");
				tempo -= 1;
				System.out.println("Você perdeu 1 ponto de tempo. Tempo restante: " + tempo + "\n");
				break;
		}

		input.close();
	}
}
