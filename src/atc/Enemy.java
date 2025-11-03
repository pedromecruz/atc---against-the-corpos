package atc;

import java.util.Random;

public class Enemy {

	int hp; // vida do inimigo
	String status = "NORMAL"; // status do inimigo
	int hit; // acerto ataque
	int dodge; // acerto esquiva
	int counter; // acerto contra ataque
	int damage; // dano
	int defense; // defesa do inimigo

	Random generator = new Random();

	Enemy() {

	}

	Enemy(int hp) {
		this.hp = hp;
	}

	int getAttack() { // ação de ataque
		hit = generator.nextInt(21); // sorteará um número de 0 a 20

		// erro critico
		if (hit == 0) {
			hit += 1;
			return hit;

			// acerto critico
		} else if (hit == 20) {
			return hit;

			// evita criticos não naturais com bonus
		} else if (hit == 18) {
			hit += 3;
			return hit;

			// retorno padrão, com bonus
		} else {
			hit += 2;
			return hit;
		}

	}

	int getDamage() { // ação de dano

		// dano máximo: 21
		damage = generator.nextInt(22);

		// calcula o dano mínimo: 6
		if (damage < 6) {
			damage = 6;
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
		}
		return dodge;
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
		}
		return counter;
	}

	void setFortifiedStatus() { // define o status de FORTIFICADO
		status = "FORTIFIED";
		System.out.println(
				"Os braços metálicos d'O Chefe rasgam seu terno. Eles dobram de largura e, claramente, de poder.");
		System.out.println("Agora você conhecerá a dor, P2.");
	}

	void setElectricStatus() { // define a armadura elétrica
		status = "ELECTRIC";
		System.out.println("A pele metálica d'O Chefe se ilumina com um leve brilho azul.");
		System.out.println("Recomendo que não me toque, P2.");
	}

	int getElectricDamage() {
		// dano máximo: 13
		damage = generator.nextInt(14);
		// calcula o dano mínimo: 3
		if (damage < 3) {
			damage = 3;
		}
		return damage;
	}
}
