package atc;

import java.util.Random;

public class Player {

	int hp; // vida do personagem
	String playerClass; // classe do personagem
	String status; // status do personagem
	int hit;
	int dodge;
	int counter;
	int damage;
	int defense;
	int minHit = 1; // acerto minimo do dado
	int maxHit = 20; // acerto maximo do dado

	Random generator = new Random();

	Player() { // construtor simples

	}

	Player(int hp) { // construtor que definirá vida (definida pela dificuldade)
		this.hp = hp;
	}
	
	void setPlayerClass(String playerClass) { //definrá a classe do jogador 
		this.playerClass = playerClass.toUpperCase();
	}
	
	String getPlayerClass() {
		return playerClass;
	}

	int getAttack() { //ação de ataque
		hit = generator.nextInt(21); // sorteará um número de 0 a 20
		if (hit == 0) {
			hit += 1;
		}
		hit += 5;
		return hit;
	}

	int getDamage() { //ação de dano
		damage = generator.nextInt(34);
		if (damage < 10) {
			damage = 10;
		}
		if (playerClass.startsWith("F")) {
			damage *= 2;
		}
		return damage;
	}

	int getDodge() { //ação de esquiva
		dodge = generator.nextInt(21);
		if (dodge == 0) {
			dodge += 1;
		}
		if (playerClass.startsWith("V")) {
			dodge += 5;
		}
		return dodge;
	}

	int getCounter() { //ação de contra-ataque
		counter = generator.nextInt(21);
		if (playerClass.startsWith("I")) {
			counter += 5;
		}
		if (counter == 0) {
			counter += 1;
		}
		return counter;
	}

}
