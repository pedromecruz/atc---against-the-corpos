package atc;

public class GameTexts {

	GameTexts() {

	}

	public static String opening() {
		return """
				=== ATC - AGAINST THE CORPOS ===
				""";
	}

	public static String prologue() {
		return """
				======================================

				O ambiente está escuro, com apenas algumas luzes de fundo. Elas piscam. Infinitamente. Elas estão
				esperando algo? Alguém?

				P2 recobra sua consciência. Onde ele está? O lugar parece tão… frio. Frio? P2 não sabe o que é sentir
				frio, então por que essa palavra lhe veio à mente? Leves luzes laranjas estão piscando em seu leito,
				perto de seus pés.

				P2 está confuso. Sua mente está limpa, vazia. Por quê?

				As luzes laranjas se tornam azuis. Estaria esse leito monitorando sua mente? Uma espécie de vidro se
				abre para cima e P2 a compara com a porta de um carro de luxo, levemente lateralizada. Ele se
				pergunta, novamente, como sabe o que é isso.

				Após levantar seu tronco, ainda sentado, P2 consegue olhar a janela. A vasta cidade se apresenta
				diante dele. Noturna, luminosa e… vazia. Vazia? Por que uma claramente habitada estaria vazia?
				Ainda sentado, ele vê a única coisa que emitia luz no quarto, que permanecia na penumbra: Uma
				tela cinza, com pouco brilho.

				Ao aproximar-se, uma voz começa a falar, alto o suficiente apenas para que alguém perto possa
				ouvir:
				—Boa noite. Está consciente?
				—Sim. Quem é você?
				—Irrelevante. Lembra seu nome?
				—P2. Isso é um nome?
				—É o que você é. Lembra de sua tarefa?
				—Sim. Tenho perguntas. onde-
				—Você não precisa de respostas. P2. Você executa o que lhe é ordenado. Repita a mim sua tarefa.
				—Invadir a torre Aqua Regia. Eliminar o único homem presente no último andar. Fazer de forma
				rápida e eficaz. Sem alarde.
				—Por que a Aqua Regia?
				—Aqua Regia lidera o mundo corporativo com eficácia. Mandam e desmandam nas corporações desde
				que assumiram controle sobre a água doce do mundo. Estão acima da água e, portanto, acima da
				vida. Controlam ela.
				—Suficiente. Boa sorte, P2. Mas acredito que não vai precisar dela.

				A tela desliga, deixando a sala à mercê da escuridão.

				Segundos depois, a parede oposta à janela se ilumina. Nela, 3 cabines se apresentam, brilhosas:

				Na primeira cabine, uma luz vermelha ilumina de cima um par de braços cibernéticos, ligados a um
				implante para a coluna vertebral. Um sistema completo que claramente permitirá o uso de força
				extrema. [PERMITIRÁ O USO DE FORÇA EXTREMA]

				Na segunda, uma luz azul ciano ilumina uma fina armadura cibernética, dos pés ao abdômen, com
				também um implante para a coluna vertebral. Aqui, um sistema completo que permitirá o uso de
				velocidades, reflexos e corridas sobre-humanas. Engraçado. Ainda existe algum humano por aqui?
				P2 se pergunta. [PERMITIRÁ O USO DE VELOCIDADE SOBRE-HUMANA]

				Na última, um simples implante cervical. Exala um tipo de poder diferente dos outros. Algum tipo de
				poder que permitiria um raciocínio cibernético? Claramente, ligado ao cérebro e provavelmente
				recheado de simulações sinápticas elétricas. [PERMITIRÁ O USO DO RACIOCÍNIO COMPUTACIONAL]

				Uma escolha difícil, P2 pensa. Escolher a todos provavelmente fritaria meu cérebro no primeiro passo.

				ESCOLHA:
				FORÇA: Par de braços
				VELOCIDADE: Prótese inferior
				INTELIGÊNCIA: Implante cervical
				""";
	}

	public static String act1Intro() {
		return """
				======================================

				No telhado do mesmo prédio, P2 observa. A chuva gelada bate em sua fria pele. Que horas eram?
				Irrelevante. Enquanto for noite, é tempo suficiente. A cidade já era conhecida por não dormir há
				décadas, e com certeza o alvo estaria acordado.

				Não foi difícil achar a direção: O prédio onde P2 despertara era exatamente ao lado do escritório da
				Aqua Regia. Bastou que P2 descesse a escadaria e estava em frente ao objetivo.

				Pela entrada da frente, a entrada chamaria muita atenção. Além disso, seria necessário abater
				dúzias de guardas. O prédio não era seguro por fora, os engenheiros tinham muita fé que sua
				estrutura aguentaria qualquer ataque. Essa fé era justificada, P2 sabia. Portanto, toda a segurança
				estava dentro do prédio. Pelo horário, mais seguranças estavam presentes que pela manhã. Quem
				invadiria um dos prédios da maior corporação do mundo durante o dia?

				Chegar ao alvo dentro do prédio com velocidade é essencial. É questão de tempo até a presença de
				P2 ser notada. Lá dentro, uma sentença de morte será assinada: Apenas entrar. Sair é impossível.

				O lugar era grande. Dando a volta nele, por uma das vielas ao seu lado, P2 identificou uma entrada
				semelhante a um estacionamento. Perto da porta, um painel de controle simples. Na parede do prédio,
				uma escada para levar a um pequeno terraço acima da área de carga.

				O portão parece firme, resistente, impossível de ser amassado ou explodido. Mas, com uma FORÇA BRUTA EXTREMA,
				seria possível forçar o sistema e levantar o portão e entrar manualmente.

				O sistema de controle parece desligado, mas talvez P2 consiga ligar os fios e comandar o portão.

				ESCOLHA:
				ROTA 1: Subir a escada
				ROTA 2: Abrir o portão
				ROTA 3: Consertar o painel de controle
				""";
	}

	public static String act1Route1() {
		return """

				Mesmo perdendo tempo, P2 decide então subir as escadas, já que é o caminho certeiro e seguro.

				No terraço, ele observa as janelas do prédio e identifica uma oportunidade em uma janela
				semi-aberta, um andar acima. Aparentemente, P2 tem uma habilidade sólida de escalada.
				Ele não sabia disso.
				""";
	}

	public static String act1Route2Success() {
		return """

				Usando seus novos braços, P2 consegue, com esforço considerável, abrir o portão. Assim,
				economizou o seu precioso tempo. O deixou aberto para caso o destino decida ser misericordioso.

				Já dentro, o trânsito será facilitado. Agora, é necessário mapear o prédio e encontrar o melhor
				dos caminhos. É bom seguir… e rápido. Mesmo sem alarmes, P2 tem certeza que as seguranças
				já estão a caminho.
				""";
	}

	public static String act1Route2Fail() {
		return """

				P2 perde tempo tentando abrir a porta. Esforço em vão, já que com certeza não tem força para
				isso. Decide então subir as escadas, já que é o caminho certeiro e seguro.

				No terraço, ele observa as janelas do prédio e identifica uma oportunidade em uma janela
				semi-aberta, um andar acima. Aparentemente, P2 tem uma habilidade sólida de escalada.
				Ele não sabia disso.
				""";
	}

	public static String act1Route3() {
		return """

				P2 arrisca seu conhecimento em eletrônica: conecta alguns fios soltos do painel de controle.
				Há quanto tempo isso está abandonado?

				Com o painel ligado, algo estranho aparece. Não uma senha ou alguma credencial a ser
				inserida. Aquilo é… um jogo? Uma sequência lógica? Um teclado numérico aparece.
				Ele espera uma resposta.
				""";
	}

	public static String act1Route3Fail() {
		return """

				P2 falha e perde tempo. Uma simples combinação numérica… Qual a lógica por trás disso?
				Deveria ser tão simples. Ele decide então subir as escadas, já que é o caminho certeiro e
				seguro.

				No terraço, ele observa as janelas do prédio e identifica uma oportunidade em uma janela
				semi-aberta, um andar acima. Aparentemente, P2 tem uma habilidade sólida de escalada.
				Ele não sabia disso.
				""";
	}

	public static String act1Route3Success() {
		return """

				P2 consegue acertar o número. Sua lógica básica é boa. Assim, economizou o seu precioso tempo.
				O deixou aberto para caso o destino decida ser misericordioso.

				Já dentro, o trânsito será facilitado. Agora, é necessário mapear o prédio e encontrar o melhor
				dos caminhos. É bom seguir… e rápido. Mesmo sem alarmes, P2 tem certeza que as seguranças já
				estão a caminho.
				""";

	}

	// ====== INTRO ======
	public static String act2Intro() {
		return """
				======================================

				O interior do prédio é um labirinto silencioso.
				As paredes frias refletem a luz azulada dos painéis de emergência. Não há ninguém nos corredores — ainda.
				P2 se move com cautela, seus passos são quase imperceptíveis.
				O som de sua própria respiração parece alto demais.

				Andares e andares de aço, vidro e silêncio.
				Câmeras quebradas, monitores piscando, cheiro de ozônio no ar. Algo aconteceu ali — recentemente.

				O sistema elétrico parece instável. O que quer que esteja acontecendo, a Aqua Regia não é mais
				o império intocado que um dia foi.

				Depois de alguns minutos de observação, P2 encontra uma porta reforçada, parcialmente aberta, com
				o símbolo universal de segurança: um olho digital.
				A sala de segurança.

				Lá dentro, dezenas de telas exibem imagens desconexas — algumas em preto e branco, outras com ruídos estáticos.
				Mapas, plantas, alertas. É ali que ele encontrará o entendimento do prédio e decidirá como avançar até o topo.

				P2 se aproxima de um dos terminais principais.
				O painel está ativo, mas protegido por um sistema de autenticação.
				A voz mecânica do sistema soa, fria, feminina, e sem emoção:
				— "Autenticação de operador exigida. Insira código de acesso ou execute bypass autorizado."

				P2 observa três rotas possíveis no mapa que se acende parcialmente à sua frente. Cada uma leva ao
				mesmo ponto — o elevador de manutenção central —
				mas o tempo que cada uma exige pode determinar o sucesso da missão.

				P2 analisa o painel e percebe que os mapas estão incompletos — parte dos dados corrompidos,
				rotas redundantes e conexões quebradas.
				Mas há algo ali… um padrão oculto, uma simetria entre as câmeras e os acessos.
				Talvez, com um RACIOCÍNIO COMPUTACIONAL, seja possível encontrar a rota ideal.

				É possível seguir pelos dutos de ventilação, um caminho sem perigo algum, mas também sem praticidade ou velocidade,
				pode tentar analisar os mapas e procurar um ideal, ou pode tentar forçar o sistema para abrir uma rota prática.


				ESCOLHA:
				ROTA 1: Dutos de ventilação
				ROTA 2: Analisar os mapas
				ROTA 3: Forçar sistema
				""";
	}

	// ====== ROTA 1 - CAMINHO SEGURO ======
	public static String act2Route1() {
		return """

				O caminho mais lógico e seguro, mas também o mais longo.

				P2 segue pelos dutos de ventilação e corredores de serviço — espaços estreitos, cheios de poeira e fios expostos.
				Nenhum guarda. Nenhum sistema de alarme ativo.
				Mas cada metro percorrido consome minutos preciosos.

				Em certos pontos, P2 ouve passos ecoando distantes, vindos de outros andares. Os seguranças estão em movimento.
				Ele respira fundo e continua, metódico, cauteloso.

				Ao final do percurso, chega ao elevador de manutenção — intacto, funcional.
				O painel pede um código de ativação, mas ele já o havia visto piscando na tela anterior da sala de segurança.
				P2 digita rapidamente.

				O elevador desce suavemente, levando-o à zona intermediária do prédio.
				""";
	}

	// ====== ROTA 2 - ANALISAR OS MAPAS ======

	public static String act2Route2Success() {
		return """

				O olhar de P2 muda. Seu implante começa a processar os dados da tela, reconstruindo o mapa em tempo real.
				As linhas se movem, as conexões se corrigem, e logo surge uma rota otimizada:

				— “Corredor 12B, escada de serviço 7. Passagem direta até o elevador de manutenção.”

				Ele sorri. Economizou um tempo precioso e evitou todos os pontos de detecção.
				Durante o trajeto, detecta dois drones inativos, caídos no chão. O prédio está mesmo colapsando.
				Nada mais o impede.
				""";
	}

	public static String act2Route2Fail() {
		return """

				P2 erra a combinação e nada muda.
				O mapa é um caos indecifrável.
				Linhas piscando, setores em loop, alertas sobrepostos.

				P2 tenta entender, mas é inútil.
				Ele decide o caminho mais provável — o que parece levar ao elevador de manutenção.
				Mas cada corredor escolhido é um beco sem saída.

				As luzes piscam, portas automáticas bloqueiam o avanço. O tempo se esvai.
				Por fim, ele encontra o elevador, mas já perdeu longos minutos em tentativas falhas.

				O som distante de alarmes ecoa. Não foram disparados por ele… mas algo está errado no prédio.
				""";
	}

	// ====== ROTA 3 - QUEBRAR CRIPTOGRAFIA ======
	public static String act2Route3() {
		return """

				Na tela, uma mensagem intermitente:

				“Autenticação de acesso necessária. Resolva a sequência numérica.”

				P2 se aproxima.
				O sistema reconhece sua presença, ajusta a interface e projeta os dados em linhas tremeluzentes.

				Ele sabe que o tempo é curto, mas o instinto fala mais alto:
				se decifrar o enigma, poderá compreender a estrutura do prédio — e talvez, prever seus inimigos.

				As variáveis aparecem no visor.
				É hora de pensar.
								""";
	}

	public static String act2Route3Success() {
		return """
				O terminal emite um clique seco — depois, silêncio.
				As linhas de código congelam por um instante... e então se reorganizam sozinhas.

				O visor muda de cor, revelando um mapa tridimensional do prédio.
				Linhas brancas serpenteiam pelos andares, revelando passagens ocultas e rotas de manutenção.

				“Acesso concedido. Módulo de navegação liberado.”

				P2 observa o mapa se expandindo lentamente, como se o próprio prédio respirasse.

				Agora ele entende a extensão do labirinto — e também percebe algo inquietante:
				há corredores marcados que não deveriam existir.

				O sistema mostra caminhos... e segredos.
				E, por algum motivo, o nome ECHO-7 aparece gravado em vários pontos do mapa.
								""";
	}

	public static String act2Route3Fail() {
		return """
				O visor pisca.
				Linhas de código se embaralham, e o sistema emite um som estridente — como um grito digital.

				“Sequência incorreta. Tentativa registrada.”

				O painel se torna de cor cinza, e parte das informações do mapa desaparece antes mesmo de serem carregadas.

				P2 tenta reconfigurar o acesso, mas o sistema o reconhece como intruso.

				Por alguns segundos, uma frase aparece no canto inferior da tela:

				“Observando você.”

				Depois, tudo apaga.
				O terminal fica mudo — e a sensação de estar sendo monitorado se torna quase física.
								""";
	}

	// ====== INTRO ======
	public static String act3Intro() {
		return """
				======================================

				O som metálico das máquinas de ventilação ecoa como um rugido distante.
				Luzes piscam, e por um instante, o reflexo de algo humanoide aparece em um dos monitores —
				e desaparece logo depois.
				O próximo passo é o mais perigoso.
				A partir dali, o sistema já sabe que ele está dentro.

				O elevador de manutenção se move lentamente, rangendo.
				Cada andar ultrapassado soa como um lamento mecânico.

				P2 observa o painel: os números piscam em ordem crescente, mas há saltos — 23, 25, 28...
				alguns andares parecem inexistentes, apagados do sistema.

				O som de interferência toma os alto-falantes do elevador.
				Vozes distorcidas. Frases curtas. Ordens?

				P2 entende uma delas:
				— "Setor 30 comprometido. Bloqueiem as rotas verticais."

				Ele respira fundo. Os andares acima já sabem.

				Quando o elevador finalmente para, as portas se abrem para um corredor vasto, metálico,
				com clarões intermitentes de luz vermelha.

				Dois caminhos se revelam:
				À esquerda, um corredor com ventiladores industriais, aberturas de manutenção e uma escada de emergência.
				Silencioso, seguro, porém longo.

				À direita, uma porta parcialmente destruída, conduzindo à ala de pesquisa avançada —
				um atalho direto aos andares superiores.
				Mas algo está emanando de lá… calor, vibração, vida.

				ESCOLHA:
				ROTA 1: Escada de emergência
				ROTA 2: Ala de pesquisa avançada
				""";
	}

	// ====== ROTA 1 - ESCADA DE EMERGÊNCIA ======
	public static String act3Route1() {
		return """

				O ar é denso e o som dos próprios passos ecoa pelas paredes de metal.
				O corredor se estende por dezenas de metros, com portas trancadas e janelas blindadas que exibem apenas
				sombras de cabos e dutos.

				O sistema de iluminação falha constantemente, criando breves segundos de escuridão total.
				Em meio ao silêncio, P2 reflete. Cada andar sobe lentamente, um degrau de cada vez.

				O tempo passa. Mas nenhum perigo real aparece. Nenhum guarda. Nenhum drone.

				Ao chegar a uma porta com o número "Nível 40", ele sente a pressão do ar mudar.
				Um leve tremor percorre o chão — como se algo acima estivesse acordando.
				A rota segura termina ali.

				A próxima abertura o levará direto às plataformas superiores — o território d’O Chefe.
				""";
	}

	// ====== ROTA 2 - A ALA DE PESQUISA ======
	public static String act3Route2() {
		return """

				P2 empurra a porta metálica.
				Um vapor denso e branco invade o corredor — cheiro de óleo queimado e ozônio.
				O som de maquinário pesado ressoa.

				Laboratórios abandonados se estendem por toda a ala.
				Mesas viradas, tanques de contenção rachados, líquido azul escorrendo pelo chão.

				Em uma das paredes, palavras escritas com algum tipo de tinta escura:
				"PROJETO ECHO: PROTÓTIPO ATIVO."

				Ele sente algo.
				Um ruído grave, pulsante, metálico.
				De trás de um painel quebrado, o som de pistões se armando.

				P2 ergue o olhar.
				Do teto, suspenso por cabos e mecanismos, um corpo mecânico se desprende.
				Humanoide, mas distorcido. Braços alongados, estrutura metálica reforçada, olhos vermelhos girando como lanternas.

				A voz automatizada ressoa:
				— "UNIDADE ECHO-7: SISTEMA DE SEGURANÇA ATIVADO. IDENTIFIQUE-SE."

				P2 permanece em silêncio.
				O robô dá um passo à frente, pesado.
				Cada impacto no chão reverbera como um trovão no peito do assassino.

				— "IDENTIFICAÇÃO NEGADA. ALVO HOSTIL."

				As garras de titânio se acendem em vermelho incandescente.
				O som de metal cortando o ar preenche o corredor.
				P2 assume posição de combate.

				O primeiro confronto real começa agora.
				""";
	}

	// ====== CENA DE MORTE DE P2 ======
	public static String act3Death() {
		return """

				O golpe final não veio com som — apenas com silêncio.
				O ar vibra, e o tempo parece desacelerar.

				P2 sente o impacto metálico atravessar sua armadura, quente como fogo líquido.
				Seu corpo é arremessado contra o vidro reforçado do laboratório, que trinca mas não quebra.

				Os sensores do implante piscam em sequência — vermelho, azul, vermelho, azul… até apagarem de vez.
				A dor é distante, quase irreal. Os movimentos se tornam lentos, desconexos.

				Diante dele, o ECHO-7 recua lentamente, sua silhueta sendo engolida pela névoa branca.
				A voz robótica ecoa, quase como um epitáfio:
				— "AMENAZA NEUTRALIZADA."

				P2 tenta mover a mão. Ela não responde.
				O teto acima dele se dissolve em fragmentos de luz.

				Por um instante, ele pensa ter ouvido a voz da mulher da tela — calma, fria:
				— "Falha de execução. Unidade P2 encerrada."

				O mundo escurece.
				O som do maquinário se cala.
				E a cidade, lá fora, permanece viva.
				Indiferente.
				""";
	}

	// ====== CENA DE VITÓRIA DE P2 ======
	public static String act3Victory() {
		return """

				O som metálico da batalha se desfaz no ar, como um trovão distante.
				O corpo do ECHO-7 estremece, solta faíscas, e cai de joelhos.

				Suas luzes vermelhas piscam em sequência irregular — um batimento artificial morrendo lentamente.
				P2 observa em silêncio. Nenhum gesto de triunfo. Nenhuma emoção.
				Apenas o reflexo do fogo dançando nas placas metálicas do inimigo.

				O robô tenta emitir um último som — uma frase quebrada, cheia de ruído estático:
				— "...não... era... o alvo... correto..."

				E então, silêncio.
				As luzes do laboratório se apagam, e o corpo do ECHO-7 colapsa, inerte.

				P2 se aproxima, recolhe um pequeno núcleo energético do peito da máquina e o observa por um instante —
				ainda pulsando, como um coração vivo.

				— "Um erro de cálculo," ele murmura. "Ou talvez, um teste."

				Ao fundo, o elevador de emergência ganha energia, suas luzes piscando em verde.
				O caminho para o topo está livre.

				P2 limpa o sangue e o óleo que escorrem pelo braço e segue em frente, sem olhar para trás.
				""";
	}

	// Função principal que retorna o texto introdutório
	public static String act4Intro() {
		return """
				======================================

				P2 enfim alcança o topo da torre.
				As portas de acesso ao último andar se abrem com um estalo hidráulico.

				O ar muda — mais leve, mas também mais tenso.
				Luzes brancas e limpas banham o corredor, em contraste com o caos dos andares anteriores.

				Nenhum sinal de combate. Nenhum guarda. Nenhum som.
				À frente, uma grande janela panorâmica revela a cidade — um mar de luzes azuis sob a chuva constante.

				No centro da sala, uma única porta.
				Acima dela, uma placa discreta, quase apagada pelo tempo:
				"Diretoria Executiva – A. Regia"

				P2 para por um instante.
				O reflexo na janela mostra um corpo coberto de sombras e cicatrizes — o seu próprio.
				Ele não sente dor, não sente medo. Apenas o vazio familiar que o acompanha desde o despertar.

				Cada passo até aquela porta parece mais pesado que o anterior.

				O elevador chega ao topo com um som seco, metálico.
				As portas se abrem lentamente, revelando o último andar da torre Aqua Regia.

				Tudo está diferente.
				Sem ruído, sem luzes piscando.
				O ar é frio e imóvel — quase sagrado.

				Os corredores são largos e iluminados por uma luz branca contínua.
				Quadros minimalistas decoram as paredes. Nenhum guarda. Nenhum som.
				Apenas o som do próprio coração de P2, irregular, misturado à vibração baixa de algum gerador distante.

				No chão, o reflexo da própria silhueta parece observá-lo, julgá-lo.
				O caminho até a sala do Chefe está diante dele.
				Mas cada passo, cada decisão, pode ser o último.

				P2 para diante do grande corredor.
				O ar parece suspenso, como se o próprio tempo observasse sua hesitação.
				À sua frente, o caminho até o escritório principal — uma longa reta de portas metálicas. Longa demais…
				À direita, uma sala lateral marcada por luzes de manutenção — talvez um abrigo, um ponto de descanso.
				""";
	}

	// Função para mostrar texto caso vida < 50%
	public static String act4LowHealth() {
		return """

				O corpo de P2 pesa. Ele está claramente machucado.
				As juntas metálicas vibram, o sangue e o óleo se misturam.
				O ECHO-7 deixou marcas profundas.
				""";
	}

	// Função para mostrar texto caso tempo == 0
	public static String act4ZeroTime() {
		return """

				O implante vibra.
				Um alerta pisca no canto da visão de P2:

				[TEMPO: 0]
				""";
	}

	public static String act4Choose() {
		return """

				ESCOLHA:
				ROTA 1: Seguir em direção à sala principal
				ROTA 2: Recuperação na sala de emergência
				ROTA 3: Correr ao máximo e recuperar o tempo perdido
				""";
	}

	// Função para ROTA 1
	public static String act4Route1() {
		return """

				P2 avança. Seus passos ecoam suaves, mas firmes.
				A tensão no ar é quase palpável — algo o observa, mas não age.
				As luzes acompanham seu movimento, acendendo conforme caminha, como se o prédio ainda o reconhecesse.
				Cada porta lateral está lacrada, cada vidro é espelhado.
				Ele sente o fim se aproximando, mas não o teme.
				""";
	}

	// Função para ROTA 2
	public static String act4Route2() {
		return """

				Ele observa uma pequena sala lateral — uma antiga enfermaria corporativa, intacta.
				Dentro, há bancos de energia, fluidos de reparo e uma cápsula de descanso.
				P2 se senta, encosta a cabeça e sente o sistema de suporte acoplar-se ao seu pescoço.
				Por alguns segundos, não há som algum.
				Apenas o pulsar de um coração sintético tentando imitar o humano.
				Imagens breves passam pela mente — flashes, memórias que não deveriam existir:
				uma criança sorrindo, uma janela com chuva, uma mão que se estende.
				Ele desperta minutos depois, a energia restaurada.
				Mas a sensação de urgência é maior.
				O tempo passou, e o destino não espera.
				""";
	}

	// Função para ROTA 3
	public static String act4Route3Success() {
		return """

				O ar parece mais denso. O chão pulsa sob seus pés.
				Algo dentro de P2 desperta — uma sensação de que o fim está próximo.
				P2 não pensa.
				P2 corre.
				O corredor se distorce com a velocidade.
				Luzes se transformam em linhas contínuas, o vento corta como lâminas.
				Cada fibra de seu corpo vibra em harmonia com o instinto primitivo da sobrevivência.
				No fim do corredor, ele desliza, para diante da porta final — ofegante, vivo.
				O sistema emite um som de leitura e o reconhece.

				“Acesso autorizado.”

				Pela primeira vez, P2 sente que venceu o próprio tempo.
				""";
	}

	public static String act4Route3Failure() {
		return """

				O ar parece mais denso.
				O chão vibra sob os passos de P2, mas o ritmo é pesado, irregular.
				Ele tenta acelerar, porém cada movimento é como correr contra a própria sombra.
				O tempo escapa — não por falta de esforço, mas porque o corpo já não acompanha a urgência.
				As luzes do corredor piscam em cadência lenta, zombando de sua pressa.
				Ainda assim, ele continua. Um passo. Depois outro.
				A respiração se torna profunda, controlada — não há espaço para desistir.
				O sistema emite um som de leitura e o reconhece.

				“Acesso autorizado.”


				P2 apoia a mão na parede, recuperando o fôlego.
				O corredor atrás dele permanece em silêncio, como se o próprio prédio observasse sua demora.
				Ele avança, mesmo sabendo:
				a vitória veio, mas o tempo não foi piedoso.
				""";
	}

	// Função principal que retorna o texto introdutório
	public static String act5Intro() {
		return """
				======================================

				A porta se abre com um leve chiado,
				e o mundo muda de novo.

				O escritório é vasto, silencioso, banhado pela luz da cidade noturna.
				As janelas panorâmicas revelam a imensidão da metrópole — fria, pulsante, indiferente.
				No centro da sala, uma mesa de vidro.
				Atrás dela, um homem. Calmo. Imóvel.
				O Chefe.

				Ele observa P2 com serenidade, como quem já esperava aquela visita.
				""";
	}

	// Função para ROTA 1 — FALHA (TEMPO = 0)
	public static String act5Route1() {
		return """

				Antes que P2 possa dizer qualquer coisa, um alarme ecoa pelo andar.
				O som é grave, quase orgânico.
				Luzes vermelhas piscam nos corredores atrás dele.
				O Chefe se levanta lentamente.

				— "Você demorou demais."

				Ele caminha até a janela panorâmica, onde um helicóptero aguarda, luzes piscando no topo do prédio.
				O vento invade o escritório, arrastando papéis, derrubando objetos.

				— "Sinto muito, P2. Você não entenderia agora… e talvez nunca devesse entender."

				A voz é calma, sem arrogância — apenas um pesar antigo.
				P2 tenta avançar, mas o som das botas e do metal se aproxima rapidamente.
				Ele vira-se para trás — dezenas de seguranças, armados, emergem das sombras do corredor.
				O Chefe sobe na escada de resgate, desaparecendo sob o ruído ensurdecedor das hélices.
				Os guardas o cercam.
				P2 abaixa a arma, respira.
				As luzes vermelhas refletem nos fragmentos de vidro ao seu redor.
				Ele fecha os olhos.

				O som dos disparos preenche o silêncio.
				O corpo cai lentamente, como se o tempo tivesse sido devolvido a ele por misericórdia.

				[FINAL 1 — O Chefe escapa. P2 é eliminado.]
				""";
	}

	// Função para ROTA 2 — O Encontro
	public static String act5Route2() {
		return """

				O Chefe permanece sentado, mãos entrelaçadas.
				Seu olhar é firme, cansado, quase… familiar.

				— "Então é você," ele diz.
				  "Mais uma cópia."
				  "Gostou dos jogos que preparei para você?"

				P2 o encara em silêncio.
				Há algo desconcertante na voz daquele homem — algo conhecido.

				— "Você sabia que eu viria?"

				— "Estava te esperando, ora."
				  "Você não faz ideia de quem é, não é?"

				— "Sou P2. Um executor."

				— "É isso que te instruíram a dizer?"

				O Chefe pressiona um comando na mesa.
				Um holograma surge — uma gravação.
				P2 se vê diante de uma gravação sua, em tempo real.
				E decide tirar sua máscara.
				O rosto é o mesmo.
				Cada traço, cada cicatriz.
				P2 observa em silêncio, paralisado.

				— "Você sou eu. Em quase tudo que se propõe." diz O Chefe.
				  "O segundo protótipo de mim. O primeiro... falhou antes de completar sua tarefa. Você, não."

				O Chefe se levanta e dá a volta na mesa, aproximando-se devagar.
				A voz dele agora é mais suave — quase paternal.

				— "Olhe para você. Tão focado em cumprir uma missão que nem sequer entende."

				Ele pausa.

				— "Você não é uma arma, P2. É uma cópia com um propósito. Encerrar tudo que o original construiu."

				P2 aperta o punho.
				O sistema neural vibra em sobrecarga.
				As ordens gravadas em seu código ecoam como gritos na mente:

				[ELIMINAR O ALVO]

				— "Você mente."

				— "Eu não preciso mentir. Não existe uma só coisa nesse mundo que eu não possa fazer sem sofrer a devida punição.
				As mentiras perderam utilidade há décadas."

				O Chefe encosta uma mão no ombro de P2.
				O toque é firme, humano.

				— "Fique. Você tem poucos dias. Pode usá-los para entender o que é ser livre. O que é ser… real."

				Por um instante, o mundo parece parar.
				P2 hesita — o olhar fixo no homem que ele foi feito para destruir.
				Mas a missão o corrói por dentro.
				Os impulsos elétricos transformam dúvida em violência.
				Os punhos se erguem.
				O Chefe dá um passo para trás, decepcionado.

				— "Eu queria que fosse diferente."

				P2, quase gritando, responde:

				— "Queríamos. Mas uma máquina não erra, não desvia de sua programação."

				O Chefe assume postura defensiva.
				O holograma apaga.
				O vento entra pelas janelas.
				E o último confronto entre criador e cópia começa —
				não por ódio, mas porque o destino foi escrito nos códigos de um, e no DNA de outro.

				— "ORDEM: Trancar todo o andar e cancelar o helicóptero. Isso será resolvido a 2… ou a 1."
				""";
	}

	public static String act5Final() {
		return """

				O Chefe cai diante de P2, corpo rígido, circuitos piscando nos últimos instantes de vida.
				Seus olhos brilham uma última vez antes de se apagarem.

				“Eu… facilitei todo o seu caminho até aqui…”, sua voz metálica ecoa pela sala.
				“Mas… você… conseguiu… derrotar-me. Esse protótipo… é uma cópia perfeita de mim…”

				Ele deixa escapar um último suspiro e pede, quase implorando: “Viva… bem… seus quatro dias restantes.”

				Com precisão, P2 torce o pescoço do Chefe. O estalo seco ressoa pelo ambiente. O Chefe morreu de forma definitiva.
				Ainda ofegante, P2 recebe uma atualização de sua missão, diretamente no seu visor:

				[EXTRAIR PLANOS]

				No bolso de sua calça, o microchip necessário para invadir o computador do Chefe. Ele o conecta. Instantes depois,
				dados começam a fluir, transferindo informações sensíveis
				para a nuvem.

				P2 procura uma saída, mas o prédio parece engolí-lo: todas as portas e janelas lacradas. A tensão cresce a cada
				segundo… até que, finalmente, uma porta se abre, iluminada por uma luz vermelha pulsante.

				“Saída de emergência”, pensa P2, percebendo que sua invasão ao microchip alterou o sistema.

				Ele entra, desce pelo elevador silencioso e emerge por uma porta lateral quase invisível, saindo sem ser notado.
				A cidade abaixo brilha indiferente à sua luta e à morte do Chefe.

				De volta ao prédio onde nasceu, P2 encara a tela cinza. Raiva e confusão o dominam.

				“Quem me criou? Por que fui projetado como uma cópia perfeita apenas para ser descartado?” — pergunta, a voz cortando o silêncio.
				“Tudo que fiz… todo risco que corri… era apenas parte de um plano maior? Para alimentar interesses que nunca seriam meus?”
				“Para onde vão essas informações? Quem realmente controla esse poder? A Aqua Régia? Ou será apenas transferido para outra
				corporação sem escrúpulos, enquanto eu morro sem ter voz?”

				Antes que consiga respostas, uma onda de choque elétrico atravessa seu cérebro. P2 cai no chão, convulsionando. A realidade se impõe:
				sua morte estava programada desde o nascimento, um traidor destinado a ser descartado após cumprir o papel. O ódio pelo corporativismo,
				pelo esquema do qual sempre foi peça, fermenta em seu peito.

				“Missão cumprida, P2. Agradecemos o serviço prestado.”

				O corpo de P2 cai imóvel. A tela cinza permanece silenciosa. Lá fora, a cidade continua a pulsar, indiferente ao destino do
				protótipo perfeito, enquanto o ódio e a traição permanecem como lembrança eterna.

				[FINAL 2 — O Chefe morre. P2 é eliminado.]
				""";
	}

	public static String act5BadFinal() {
		return """

				O silêncio tomou o ambiente. O som do metal se retorcendo havia cessado — e com ele, também o fôlego de P2.
				O Chefe observava o corpo imóvel diante de si, o olhar frio, impassível.

				Por um breve instante, ele pareceu hesitar.
				Aquele ser diante dele era sua própria imagem, moldada em carne sintética, músculos precisos e uma mente construída a partir
				de fragmentos de sua própria consciência.
				Era... ele mesmo. Uma cópia perfeita — imperfeita apenas pelo destino que o aguardava.

				“Misericórdia...”, murmurou O Chefe, quase sem perceber.

				Sua mão firme pousou sobre o pescoço de P2. Um único movimento. Rápido. Silencioso.
				O som seco ecoou pelo laboratório.

				P2 não teve tempo para sentir dor. Sua existência foi encerrada com a mesma frieza com que havia sido criada — e, em um gesto
				quase contraditório, o Chefe acreditou ter lhe feito um favor.

				“Não há sentido em lhe dar respostas, cópia.”
				“Respostas não trazem propósito. Só ruína.”

				Por um momento, o Chefe desviou o olhar para o reflexo trincado de um espelho próximo.
				Nos cacos, ele viu dezenas de si mesmo — rostos idênticos, estáticos, multiplicados.
				Cada reflexo parecia observá-lo com a mesma indiferença que ele aprendera a cultivar.

				E então, a verdade o atingiu como um golpe: ele não sabia mais quem o estava replicando.
				Havia tantas corporações, tantos grupos famintos por poder, por controle... e agora, sabiam de sua maior fraqueza:
				a própria imagem.

				“Demônios!"

				O Chefe cerrou os punhos. O sangue escorreu por entre os dedos.
				A ideia de ser multiplicado — reduzido a uma cópia, a uma ferramenta — o consumia.
				Mas algo dentro dele se torceu, dando origem a um novo plano.

				“Se eles criam cópias de mim...”
				“... então eu também criarei as minhas.”

				A decisão nascia entre a raiva e a loucura.
				Ele abriria sua própria linha de clones — um exército de versões controladas, moldadas apenas para obedecer.
				Defesa? Talvez.
				Um ato de autopreservação... ou a semente da própria destruição.
				Ele conhecia a própria ganância.

				Enquanto as luzes do laboratório piscavam e o corpo de P2 era lentamente engolido pela sombra, o Chefe fitava o vazio.
				Sua mente já projetava a próxima geração.
				Não para substituí-lo — mas para refletir seu domínio.

				E, no fundo, ele sabia:
				em algum momento, um deles o mataria também.

				[FINAL 3 — O Chefe vive. P2 é eliminado.]

				""";
	}

}
