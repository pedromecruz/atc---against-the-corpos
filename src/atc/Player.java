package atc;

import java.util.Random;

public class Player {

	int vida; //vida do personagem
	char playerClass; //classe do personagem
	String status; //status do personagem
	int hit;
	int minHit = 1; //acerto minimo do dado
	int maxHit = 20; //acerto maximo do dado
	
	Random generator = new Random();
	
	Player(){
		
	}
	
	Player(int vida){ //construtor que definirá vida(definida pela dificuldade)
		this.vida = vida;
	}
	
	void attack() { //açao de ataque do jogador
		hit = generator.nextInt(21); //sorteará um número de 0 a 20
	}

}
