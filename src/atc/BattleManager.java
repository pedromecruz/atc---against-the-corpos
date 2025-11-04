package atc;

import java.util.Scanner;
import java.util.Random;

public class BattleManager {

	BattleManager() {
	}

	public static int playerActionFinalBattle(Player player, Enemy boss, int enemyTurn, Scanner input, int tempHP,
			int bossTempHP, int textSpeed) {
		
		tempHP = player.hp;
		bossTempHP = boss.hp;

		TextUtils.slowPrint("\n" + "ESCOLHA", textSpeed);
		TextUtils.slowPrint("1. ATAQUE", textSpeed);
		TextUtils.slowPrint("2. ESQUIVA", textSpeed);
		TextUtils.slowPrint("3. CONTRA-ATAQUE", textSpeed);
		TextUtils.slowPrintInline("R: ", textSpeed);
		int option = input.nextInt();
		System.out.println("");

		while (option < 1 || option > 3) {
			TextUtils.slowPrint("Insira uma opção válida.", textSpeed);
			option = input.nextInt();
		}

		switch (option) {
		case 1: // ataque comum
			player.hit = player.getAttack(); // o método retorna um valor entre 1 e 20

			if (player.hit == 20) { // acerto crítico
				boss.hp -= (player.getDamage() * 2);
				enemyTurn -= 2;
				TextUtils.slowPrint("P2 consegue mirar em uma falha na cyber-armadura d'O Chefe. Acerto crítico.",
						textSpeed);

			} else if (player.hit == 1) { // falha crítica
				TextUtils.slowPrint("O pé de P2 pisa milimetros no lugar errado.", textSpeed);
				TextUtils.slowPrint("—Você é um clone antigo, P2. Ultrapassado. Você erra demais!", textSpeed);
				TextUtils.slowPrint("O Chefe retorna um ataque no tórax de P2 \n", textSpeed);
				player.hp -= boss.getAttack();

			} else if (player.hit >= boss.defense) { // acerto comum
				boss.hp -= player.getDamage();
				TextUtils.slowPrint("P2 consegue acertar um sólido soco na costela d'O Chefe. \n", textSpeed);
			} else {
				TextUtils.slowPrint("P2 erra seu ataque, sem abrir brechas.", textSpeed);
			}
			break;

		case 2: // esquiva
			player.dodge = player.getDodge();
			if (player.dodge == 20) { // esquiva crítica
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... e consegue um passo perfeito. O Chefe está desbalanceado.",
						textSpeed);
				enemyTurn = -2;

			} else if (player.dodge == 1) { // falha crítica
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... mas erra o passo. Erra de forma terrível. O chefe tem uma chance clara de contra-ataque, e não falha.",
						textSpeed);
				player.hp -= boss.getDamage();

			} else if (player.dodge > boss.getAttack()) { // esquiva comum
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... e consegue um bom passo. O Chefe abre uma oportunidade. \n",
						textSpeed);
				enemyTurn = 0;

			} else { // erro comum
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... mas erra o passo. Isso abre uma pequena oportunidade, que O Chefe aproveita.",
						textSpeed);
				player.hp -= (boss.getDamage() / 2);
			}
			break;

		case 3: // Contra-ataque
			player.counter = player.getCounter();

			if (player.counter == 20) { // acerto crítico
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... e consegue um passo ofensivo perfeito. Com isso, desfere 2 fortes golpes n'O Chefe. Isso o desbalancea. \n",
						textSpeed);
				boss.hp -= player.getDamage();
				boss.hp -= player.getDamage();
				enemyTurn = -1;

			} else if (player.counter == 1) { // falha crítica
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... mas perde totalmente o passo ofensivo. Uma ótima oportunidade se apresenta, e O Chefe não desperdiça. \n",
						textSpeed);
				player.hp -= boss.getDamage();

			} else if (player.counter > boss.getAttack()) { // contra-ataque comum
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... e consegue um passo ofensivo perfeito. Com isso, desfere um limpo soco n'O Chefe. Isso o desbalancea.",
						textSpeed);
				boss.hp -= player.getDamage();
				enemyTurn = -1;

			} else { // erro comum
				TextUtils.slowPrint(
						"P2 atrai O Chefe para um ataque... mas erra o passo ofensivo. Isso abre uma pequena oportunidade, que O Chefe aproveita.",
						textSpeed);
				player.hp -= (boss.getDamage() / 2);
			}
			break;
		}

		if (boss.hp != bossTempHP && boss.status.equals("ELECTRIC")) { // aplica o efeito da armadura elétrica
			player.hp -= boss.getElectricDamage();
			TextUtils.slowPrint("Após o ataque, P2 sofreu um choque elétrico da armadura d'O Chefe. \n", textSpeed);
		}

		if (player.hp != tempHP && boss.status.equals("FORTIFIED")) { // aplica o efeito do fortalecimento do chefe
			player.hp -= boss.getDamage();
			TextUtils.slowPrint(
					"Com o aprimoramento de impacto d'O Chefe, P2 sente uma dor devastadora, como se outro golpe tivesse o atingido. \n",
					textSpeed);
		}

		return enemyTurn;

	}

	public static int bossAction(Player player, Enemy boss, int enemyTurn, int playerTurn,
			Random generator, int bossTempHP, int tempHP, int textSpeed) {

		tempHP = player.hp;
		bossTempHP = boss.hp;
		
		int enemyOption = generator.nextInt(6);

		if (enemyOption == 0) {
			enemyOption = 1;
		}

		switch (enemyOption) {

		case 1: // define o BUFF ELETRICO
			if (boss.tempBuff < 1) {
				boss.setElectricStatus();
				boss.setTempBuff(3);
				break;
			} else { // irá para o próximo case
			}

		case 2: // DEFINE O BUFF FORTIFICADO
			if (boss.tempBuff < 1) {
				boss.setFortifiedStatus();
				boss.setTempBuff(3);
				break;
			} else { // irá para o próximo case
			}

		case 3: // ação de ataque inimiga;
			boss.hit = boss.getAttack();
			if (boss.hit == 20) { // acerto critico
				TextUtils.slowPrint("O golpe d'O Chefe atravessa o ar como um relâmpago.\r\n"
						+ "O impacto é seco, brutal — P2 mal tem tempo de reagir. \n", textSpeed);
				player.hp -= (boss.getDamage() * 2);

			} else if (boss.hit == 1) { // erro critico
				TextUtils.slowPrint("O Chefe ataca com força demais e perde o equilíbrio.\r\n"
						+ "Seu soco corta o ar e raspa no chão, abrindo uma brecha perigosa.", textSpeed);
				TextUtils.slowPrint("P2 contra-ataca com precisão. \n", textSpeed);
				boss.hp -= player.getDamage();

			} else if (boss.hit >= player.defense) { // acerto comum
				TextUtils.slowPrint("O Chefe golpeia o ombro de P2 — um golpe limpo, preciso.\r\n"
						+ "P2 sente dor enquanto o olhar do Chefe permanece frio.\n", textSpeed);
				player.hp -= boss.getDamage();

			} else { // erro comum
				TextUtils.slowPrint("O soco passa a centímetros do alvo, cortando apenas o vento.\r\n"
						+ "P2 recua a tempo, e o Chefe o observa com desprezo contido. \n", textSpeed);
			}
			break;

		case 4: // ação de esquiva
			boss.dodge = boss.getDodge();
			if (boss.dodge == 20) { // esquiva acerto critico
				TextUtils.slowPrint("O Chefe se move antes mesmo do ataque começar.\r\n"
						+ "A esquiva é perfeita — um desvio fluido, quase coreografado. \n"
						+ "“Eu te conheço melhor do que você mesmo.”", textSpeed);
				playerTurn = -2;
			} else if (boss.dodge == 1) { // erro critico
				TextUtils.slowPrint("O Chefe tenta prever o movimento, mas se antecipa demais.\r\n"
						+ "Perde o tempo — e o punho de P2 quase o atravessa.", textSpeed);
				boss.hp -= player.getDamage();

			} else if (boss.dodge > player.hit) { // acerto comum
				TextUtils.slowPrint("Ele gira o corpo e o golpe passa de raspão.\r\n"
						+ "A manobra desestabiliza P2, forçando-o a perder o ritmo.", textSpeed);
				playerTurn = -1;

			} else { // erro comum
				TextUtils.slowPrint("A esquiva falha por um instante.\r\n"
						+ "O ataque de P2 acerta o flanco do Chefe, sem grandes estragos.", textSpeed);
				boss.hp -= (player.getDamage() / 2);
			}
			break;

		case 5:
			boss.counter = boss.getCounter();
			if (boss.counter == 20) { // acerto critico
				TextUtils.slowPrint("P2 ataca — mas o Chefe desaparece da linha de visão.\r\n"
						+ "Em um movimento preciso, esquiva e devolve dois golpes seguidos.", textSpeed);
				player.hp -= boss.getDamage();
				player.hp -= boss.getDamage();
				playerTurn = -1;

			} else if (boss.counter == 1) { // erro critico
				TextUtils.slowPrint("O Chefe tenta uma nova esquiva, mas P2 muda o ritmo.\r\n"
						+ "O golpe falha, e a guarda se abre completamente.", textSpeed);
				TextUtils.slowPrint("P2 golpeia com força.", textSpeed);
				boss.hp -= player.getDamage();

			} else if (boss.counter > player.hit) { // acerto comum
				TextUtils.slowPrint("O Chefe finge vulnerabilidade, e P2 morde a isca.\r\n"
						+ "Um contra-ataque rápido o acerta no flanco.", textSpeed);
				player.hp -= boss.getDamage();
			} else { // erro comum
				TextUtils.slowPrint("O Chefe tenta induzir o ataque, mas P2 o lê por completo.\r\n"
						+ "O punho do clone atinge primeiro.", textSpeed);
				boss.hp -= (player.getDamage() / 2);
			}
		}

		if (boss.hp != bossTempHP && boss.status.equals("ELECTRIC")) { // aplica o efeito da armadura elétrica
			player.hp -= boss.getElectricDamage();
			TextUtils.slowPrint("Após o contra-ataque, P2 sofreu um choque elétrico da armadura d'O Chefe. \n",
					textSpeed);
		}

		if (player.hp != tempHP && boss.status.equals("FORTIFIED")) { // aplica o efeito do fortalecimento do chefe
			player.hp -= boss.getDamage();
			TextUtils.slowPrint(
					"Com o aprimoramento de impacto d'O Chefe, P2 sente uma dor devastadora, como se outro golpe tivesse o atingido. \n",
					textSpeed);
		}

		return playerTurn;
	}

	public static int playerActionEchoBattle(Player player, Enemy echo, int enemyTurn, Scanner input, int tempHP,
			int bossTempHP, int textSpeed) {

		TextUtils.slowPrint("\n" + "ESCOLHA", textSpeed);
		TextUtils.slowPrint("1. ATAQUE", textSpeed);
		TextUtils.slowPrint("2. ESQUIVA", textSpeed);
		TextUtils.slowPrint("3. CONTRA-ATAQUE", textSpeed);
		TextUtils.slowPrintInline("R: ", textSpeed);
		int option = input.nextInt();
		System.out.println("");

		while (option < 1 || option > 3) {
			TextUtils.slowPrint("Insira uma opção válida.", textSpeed);
			option = input.nextInt();
		}

		switch (option) {
		case 1: // ataque comum
			player.hit = player.getAttack(); // o método retorna um valor entre 1 e 20

			if (player.hit == 20) { // acerto crítico
				echo.hp -= (player.getDamage() * 2);
				enemyTurn -= 2;
				TextUtils.slowPrint(
						"P2 calcula a trajetória exata e atinge uma falha na blindagem de ECHO-7. O impacto atravessa o metal — acerto crítico!",
						textSpeed);

			} else if (player.hit == 1) { // falha crítica
				TextUtils.slowPrint(
						"O golpe de P2 erra por milímetros. ECHO-7 analisa o padrão de movimento instantaneamente.",
						textSpeed);
				TextUtils.slowPrint("— *Erro de cálculo detectado. Unidade P2: obsoleta.*", textSpeed);
				TextUtils.slowPrint("ECHO-7 desfere um golpe brutal no tórax de P2.\n", textSpeed);
				player.hp -= echo.getAttack();

			} else if (player.hit >= echo.defense) { // acerto comum
				echo.hp -= player.getDamage();
				TextUtils.slowPrint(
						"P2 acerta um forte impacto contra o chassi de ECHO-7, deixando faíscas saltarem pelo chão.\n",
						textSpeed);
			} else {
				TextUtils.slowPrint("O ataque de P2 é desviado por uma manobra precisa de ECHO-7. Nenhum dano causado.",
						textSpeed);
			}
			break;

		case 2: // esquiva
			player.dodge = player.getDodge();
			if (player.dodge == 20) { // esquiva crítica
				TextUtils.slowPrint(
						"P2 engana ECHO-7 com um movimento irregular — o robô recalcula tarde demais. P2 evita o golpe e deixa ECHO-7 vulnerável!",
						textSpeed);
				enemyTurn = -2;

			} else if (player.dodge == 1) { // falha crítica
				TextUtils.slowPrint(
						"P2 tenta atrair ECHO-7, mas um deslize no piso molhado compromete a esquiva. O robô aproveita sem hesitar e atinge P2 com precisão mecânica.",
						textSpeed);
				player.hp -= echo.getDamage();

			} else if (player.dodge > echo.getAttack()) { // esquiva comum
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, prevê o golpe e se esquiva no último instante — ECHO-7 recalibra, mas perde o ritmo. Uma pequena brecha se abre.\n",
						textSpeed);
				enemyTurn = 0;

			} else { // erro comum
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, tenta escapar, mas ECHO-7 ajusta o ângulo de ataque em tempo real. O impacto é parcial, mas atinge o alvo.",
						textSpeed);
				player.hp -= (echo.getDamage() / 2);
			}
			break;

		case 3: // Contra-ataque
			player.counter = player.getCounter();

			if (player.counter == 20) { // acerto crítico
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, analisa o movimento de ECHO-7 e reage com precisão cirúrgica — dois golpes consecutivos rompem placas de titânio e fazem o robô recuar!\n",
						textSpeed);
				echo.hp -= player.getDamage();
				echo.hp -= player.getDamage();
				enemyTurn = -1;

			} else if (player.counter == 1) { // falha crítica
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, tenta responder ao ataque, mas ECHO-7 antecipa a manobra e contra-ataca com brutalidade. O som do impacto metálico ecoa pelo corredor.\n",
						textSpeed);
				player.hp -= echo.getDamage();

			} else if (player.counter > echo.getAttack()) { // contra-ataque comum
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, desvia o braço mecânico de ECHO-7 e devolve um golpe preciso — o impacto desestabiliza momentaneamente o robô.",
						textSpeed);
				echo.hp -= player.getDamage();
				enemyTurn = -1;

			} else { // erro comum
				TextUtils.slowPrint(
						"P2 atrai ECHO-7 para um ataque, tenta o contra-ataque, mas ECHO-7 bloqueia com o antebraço de liga reforçada e responde com um golpe lateral devastador.",
						textSpeed);
				player.hp -= (echo.getDamage() / 2);
			}
			break;
		}
		return enemyTurn;
	}

	public static int echoAction(Player player, Enemy echo, int tempBuff, int enemyTurn, int playerTurn,
			Random generator, int bossTempHP, int tempHP, int textSpeed) {

		int enemyOption = generator.nextInt(4);

		if (enemyOption == 0) {
			enemyOption = 1;
		}

		switch (enemyOption) {

		case 1: // ação de ataque inimiga;
			echo.hit = echo.getAttack();
			if (echo.hit == 20) { // acerto critico
				TextUtils.slowPrint(
						"ECHO-7 dispara um ataque relâmpago, movendo suas armas mecânicas com precisão letal.\r\n"
								+ "O impacto atinge P2 com força devastadora — quase não há tempo para reagir.\n",
						textSpeed);
				player.hp -= (echo.getDamage() * 2);

			} else if (echo.hit == 1) { // erro critico
				TextUtils.slowPrint("ECHO-7 tenta atacar com força excessiva e perde o equilíbrio momentaneamente.\r\n"
						+ "Sua lâmina corta o ar e raspa no chão, abrindo uma brecha crítica.", textSpeed);
				TextUtils.slowPrint("P2 aproveita a abertura e contra-ataca com precisão.\n", textSpeed);
				echo.hp = player.getDamage();

			} else if (echo.hit >= player.defense) { // acerto comum
				TextUtils.slowPrint(
						"ECHO-7 atinge o ombro de P2 com um golpe mecânico preciso.\r\n"
								+ "P2 sente a força do impacto enquanto o robô mantém seu olhar frio e impassível.\n",
						textSpeed);
				player.hp -= echo.getDamage();

			} else { // erro comum
				TextUtils.slowPrint("O ataque de ECHO-7 passa a centímetros de P2, cortando apenas o ar.\r\n"
						+ "P2 consegue recuar a tempo, observando o robô recalibrar sua posição.\n", textSpeed);
			}
			break;

		case 2: // ação de esquiva
			echo.dodge = echo.getDodge();
			if (echo.dodge == 20) { // esquiva acerto critico
				TextUtils.slowPrint("ECHO-7 induz P2  a um ataque, mas move-se antes que ele complete o ataque.\r\n"
						+ "A esquiva é perfeita, fluida, quase como se fosse programada para antecipar cada passo.\n"
						+ "‘Analisando padrão de ataque — falha detectada.’", textSpeed);
				playerTurn = -2;
			} else if (echo.dodge == 1) { // erro critico
				TextUtils.slowPrint(
						"ECHO-7 induz P2  a um ataque e tenta antecipar o movimento de P2, mas calcula errado.\r\n"
								+ "Aguardando ajuste — P2 consegue um ataque certeiro.",
						textSpeed);
				echo.hp = player.getDamage();

			} else if (echo.dodge > player.hit) { // acerto comum
				TextUtils.slowPrint(
						"ECHO-7 induz P2  a um ataque, gira o corpo e consegue desviar parcialmente do ataque.\r\n"
								+ "A manobra cria uma abertura momentânea para P2, mas ainda mantém a pressão do robô.",
						textSpeed);
				playerTurn = -1;

			} else { // erro comum
				TextUtils
						.slowPrint(
								"ECHO-7 induz P2  a um ataque, mas a tentativa de se esquivar falha ligeiramente.\r\n"
										+ "O ataque de P2 atinge parcialmente o robô, causando danos moderados.\n",
								textSpeed);
				echo.hp -= (player.getDamage() / 2);
			}
			break;

		case 3:
			echo.counter = echo.getCounter();
			if (echo.counter == 20) { // acerto critico
				TextUtils.slowPrint(
						"ECHO-7 induz P2  a um ataque, P2 tenta atacar, mas ECHO-7 desaparece rapidamente da trajetória prevista.\r\n"
								+ "O robô responde com dois golpes seguidos, precisos e devastadores.",
						textSpeed);
				player.hp -= echo.getDamage();
				player.hp -= echo.getDamage();
				playerTurn = -1;

			} else if (echo.counter == 1) { // erro critico
				TextUtils.slowPrint(
						"ECHO-7 induz P2  a um ataque, ele tenta executar um contra-ataque, mas P2 muda a estratégia.\r\n"
								+ "O ataque falha, deixando o robô vulnerável.",
						textSpeed);
				TextUtils.slowPrint("P2 aproveita a oportunidade e acerta um golpe potente.\n", textSpeed);
				echo.hp -= player.getDamage();

			} else if (echo.counter > player.hit) { // acerto comum
				TextUtils.slowPrint("ECHO-7 induz P2  a um ataque, simula vulnerabilidade, e P2 cai na armadilha.\r\n"
						+ "Um contra-ataque rápido do robô acerta P2 no flanco.", textSpeed);
				player.hp -= echo.getDamage();
			} else { // erro comum
				TextUtils.slowPrint("ECHO-7 tenta induzir P2 a atacar primeiro, mas P2 antecipa o movimento.\r\n"
						+ "O golpe do robô é parcialmente bloqueado.", textSpeed);
				echo.hp -= (player.getDamage() / 2);
			}
		}

		return playerTurn;
	}

}
