package atc;

import java.util.Random;

public class Enemy {

	int hp;
	int defense;
	int hit;
	int damage;
	int dodge;
	int counter;
	
	String status;

	Random generator = new Random();
	
	Enemy() { // construtor simples

	}

	Enemy(int hp) { // construtor que definirá vida (definido pelo roteiro)
		this.hp = hp;
	}

	int getAttack() { // ação de ataque
		hit = generator.nextInt(21); // sorteará um número de 0 a 20
		if (hit == 0) {
			hit += 1;
		}
		return hit;
	}

	int getDamage() { // ação de dano
		damage = generator.nextInt(34);
		if (damage < 10) {
			damage = 10;
		}
		return damage;
	}

	int getDodge() { // ação de esquiva
		dodge = generator.nextInt(21);
		if (dodge == 0) {
			dodge += 1;
		}
		return dodge;
	}

	int getCounter() { // ação de contra-ataque
		counter = generator.nextInt(21);
		if (counter == 0) {
			counter += 1;
		}
		return counter;
	}
	
	void setDefense(int defense) {
		this.defense = defense;
	}

}
