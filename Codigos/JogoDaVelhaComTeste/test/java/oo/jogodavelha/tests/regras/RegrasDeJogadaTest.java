package oo.jogodavelha.tests.regras;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;
import oo.jogodavelha.models.Coordenada;
import oo.jogodavelha.models.Jogada;
import oo.jogodavelha.models.Jogo;

public class RegrasDeJogadaTest {

	private Jogo g;
	
	@BeforeEach
	public void configuracaoParaCada() {
		g = new Jogo();
		g.init();
	}


	@Test
	public void testJogadaValida() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		g = new Jogo();
		g.init();
		boolean resultado = false;
		for (int x = 0; x < 3; x++)
			for (int y = 0; y < 3; y++) {
				resultado = tenteJogarNaPosicao(x, y);
				assertTrue(resultado);
			}
	}
	
	@ParameterizedTest
	@CsvSource({ "0,0,X,X", "0,0,X,O", "0,0,O,O", "0,0,O,X",
		 "0,1,X,X", "0,1,X,O", "0,1,O,O", "0,1,O,X",
		 "0,2,X,X", "0,2,X,O", "0,2,O,O", "0,2,O,X",
		 "1,0,X,X", "1,0,X,O", "1,0,O,O", "1,0,O,X",
		 "1,1,X,X", "1,1,X,O", "1,1,O,O", "1,1,O,X",
		 "1,2,X,X", "1,2,X,O", "1,2,O,O", "1,2,O,X",
		 "2,0,X,X", "2,0,X,O", "2,0,O,O", "2,0,O,X",
		 "2,0,X,X", "2,1,X,O", "2,1,O,O", "2,1,O,X",
		 "2,0,X,X", "2,2,X,O", "2,2,O,O", "2,2,O,X",})
	public void testJogadaEmZonaPreenchida(int x, int y, Character um, Character dois)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		assertThrows(ExcecaoPorCoordenadaInvalida.class, () -> {
			tenteJogarUmaSegundaVezNaMesmaPosicao(x, y, um, dois);
		});
	}

	@ParameterizedTest
	@CsvSource({"1,0,0,0,X", "1,0,0,0,O", "0,0,0,1,X", "0,0,0,1,O", "0,0,0,2,X", "0,0,0,2,O", 
		"0,0,1,0,X", "0,0,1,0,O", "0,0,1,1,X", "0,0,1,1,O", "1,0,1,2,X", "1,0,0,2,O",
		"0,0,2,1,X", "0,0,2,1,O", "0,0,2,1,X", "0,0,2,1,O", "1,0,2,1,X", "1,0,2,1,O",
		// Existem inumeras outras possibilidades, mas só uma por posição é suficiente
		})
	public void testJogadorTentarJogarDuasVezes(int x1, int y1,int x2, int y2, Character simbolo) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		assertThrows(ExcecaoPorSimboloInvalido.class, () -> {
			tenteJogarUmaSegundaVezEmPosicaoDiferente(x1, y1,x2,y2, simbolo);
		});
	}
	
	
	@ParameterizedTest
	@CsvSource({"-1,0","-1,1","-1,2","3,0","3,1","3,2",
		"0,-1","1,-1","2,-1","0,3","1,3","2,3",
		"-1,-1","3,3"
		// Existem inumeras outras possibilidades, mas só uma por posição é suficiente
		})
	public void testJogadaEmPosicaoInexistente(int x, int y)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		assertThrows(ExcecaoPorCoordenadaInvalida.class, () -> {
			g.add(new Jogada('O', new Coordenada(x, y)));			
		});
	}


	private boolean tenteJogarNaPosicao(int x, int y) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		Character umSimbolo = 'O';
		Coordenada umaCoordenada = new Coordenada(x, y);
		Jogada umaJogada = new Jogada(umSimbolo, umaCoordenada);
		return g.check(umaJogada);
	}
	
	private void tenteJogarUmaSegundaVezNaMesmaPosicao(int x, int y, Character primeiroSimbolo, Character segundoSimbolo)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		// adicionando a primeira jogada com 'O' pq é 'O' que deve começar
		if (primeiroSimbolo.equals('X'))
			g.add(new Jogada('O', new Coordenada(x % 2 + 1, y % 2 + 1)));
		g.add(new Jogada(primeiroSimbolo, new Coordenada(x, y)));
		g.add(new Jogada(segundoSimbolo, new Coordenada(x, y)));
	}
	
	private void tenteJogarUmaSegundaVezEmPosicaoDiferente(int x1, int y1,int x2, int y2, Character simbolo)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		// adicionando a primeira jogada com 'O' pq é 'O' que deve começar
		if (simbolo.equals('X'))
			g.add(new Jogada('O', new Coordenada(x2 % 2 + 1, y2 % 2 + 1)));
		g.add(new Jogada(simbolo, new Coordenada(x1, y1)));
		g.add(new Jogada(simbolo, new Coordenada(x2, y2)));
	}

}
