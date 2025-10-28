package atc;

import java.util.Random;

public class Player {

	int hp; // vida do personagem
	String playerClass; // classe do personagem
	String status; // status do personagem
	int hit; //acerto ataque
	int dodge; //acerto esquiva
	int counter; //acerto contra ataque
	int damage; //dano
	int defense; //defesa do jogador

	Random generator = new Random();
	
	Player(){
	}
	
	Player(int hp){ //construtor que definirá vida(definida pela dificuldade)
		this.hp = hp;
	}

	void setPlayerClass(String playerClass) { // definrá a classe do jogador
		this.playerClass = playerClass.toUpperCase();
	}

	String getPlayerClass() {
		return playerClass;
	}

	int getAttack() { // ação de ataque
		hit = generator.nextInt(21); // sorteará um número de 0 a 20
		
		//erro critico
		if (hit == 0) {
			hit += 1;
			return hit;
			
			//acerto critico
		} else if (hit == 20) {
			return hit;
			
			//evita criticos não naturais com bonus
		} else if (hit == 15) {
			hit += 6;
			return hit;
			
			//retorno padrão, com bonus
		} else {
			hit += 5;
			return hit;
		}

	}

	int getDamage() { // ação de dano

		// dano máximo: 33
		damage = generator.nextInt(34);

		// calcula o dano mínimo: 10
		if (damage < 10) {
			damage = 10;
			
			//calcula o bônus de força
		} else if (playerClass.startsWith("F")) {
			damage *= 2;
		}
		return damage;
	}

	int getDodge() { // ação de esquiva
		dodge = generator.nextInt(21);

		// erro crítico
		if (dodge == 0) {
			dodge += 1;
			return dodge;

			// acerto critico
		} else if (dodge == 20) {
			return dodge;

			// contagem de bônus da classe
		} else if (playerClass.startsWith("V")) {
			dodge += 5;

			// evita um falso acerto critico (20 não natural)
			if (dodge == 20) {
				dodge += 1;
				return dodge;

				// retorno do valor comum, com bonus e sem criticos
			} else {
				return dodge;
			}

			// retorno do valor comum, sem bonus e sem criticos
		} else {
			return dodge;
		}
	}

	int getCounter() { // ação de contra-ataque
		counter = generator.nextInt(21);

		// erro crítico
		if (counter == 0) {
			counter += 1;
			return counter;

			// acerto critico
		} else if (dodge == 20) {
			return dodge;

			// contagem de bônus da classe
		} else if (playerClass.startsWith("I")) {
			counter += 5;

			// evita um falso acerto critico (20 não natural)
			if (counter == 20) {
				counter += 1;
				return counter;

				// retorno do valor comum, com bonus e sem criticos
			} else {
				return counter;
			}

			// retorno do valor comum, sem bonus e sem criticos
		} else {
			return counter;
		}
	}
	

}


