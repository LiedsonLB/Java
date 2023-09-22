package oo.jogodavelha.tests.regras;

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

public class RegrasDeVitoriaTest {

	private Jogo g;

	@BeforeEach
	public void setup() {
		g = new Jogo();
		g.init();
	}

	
	@ParameterizedTest
	@CsvSource({"0,X","0,O","1,X","1,O","2,X","2,O",})
	public void testHasWinnerHorizontal(int linha, Character vencedor) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		tentativaDeVitoriaNaHorizontal(linha, vencedor);
		assertTrue(g.hasWinner());
	}

	@ParameterizedTest
	@CsvSource({"0,X","0,O","1,X","1,O","2,X","2,O",})
	public void testHasWinnerVertical(int coluna, Character vencedor) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		tentativaDeVitoriaNaVertical(coluna, vencedor);
		assertTrue(g.hasWinner());
	}
	
	void tentativaDeVitoriaNaHorizontal(int linha, Character vencedor)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		Character perdedor = vencedor.equals('X') ? 'O' : 'X';
		int linhaPerdedora = linha%2+1;
		if (vencedor.equals('X'))
			g.add(new Jogada(perdedor, new Coordenada(linhaPerdedora, 0)));
		g.add(new Jogada(vencedor, new Coordenada(linha, 0)));
		g.add(new Jogada(perdedor, new Coordenada(linhaPerdedora, 1)));
		g.add(new Jogada(vencedor, new Coordenada(linha, 1)));
		g.add(new Jogada(perdedor, new Coordenada(linhaPerdedora, 2)));
		g.add(new Jogada(vencedor, new Coordenada(linha, 2)));
	}
	

	void tentativaDeVitoriaNaVertical(int coluna, Character vencedor)
			throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		Character perdedor = vencedor.equals('X') ? 'O' : 'X';
		int colunaPerdedora = coluna%2+1;
		if (vencedor.equals('X'))
			g.add(new Jogada(perdedor, new Coordenada(0,colunaPerdedora)));
		g.add(new Jogada(vencedor, new Coordenada(0, coluna)));
		g.add(new Jogada(perdedor, new Coordenada(1,colunaPerdedora)));
		g.add(new Jogada(vencedor, new Coordenada(1, coluna)));
		g.add(new Jogada(perdedor, new Coordenada(2, colunaPerdedora)));
		g.add(new Jogada(vencedor, new Coordenada(2, coluna)));
	}


	@Test
	public void testHasWinnerDiagonal1() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		g = new Jogo();
		g.init();
		g.add(new Jogada('O', new Coordenada(0, 0)));
		g.add(new Jogada('X', new Coordenada(0, 1)));
		g.add(new Jogada('O', new Coordenada(1, 1)));
		g.add(new Jogada('X', new Coordenada(2, 0)));
		g.add(new Jogada('O', new Coordenada(2, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerDiagonal2() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		g = new Jogo();
		g.init();
		g.add(new Jogada('O', new Coordenada(0, 2)));
		g.add(new Jogada('X', new Coordenada(0, 1)));
		g.add(new Jogada('O', new Coordenada(1, 1)));
		g.add(new Jogada('X', new Coordenada(2, 2)));
		g.add(new Jogada('O', new Coordenada(2, 0)));
		assertTrue(g.hasWinner());
	}
}
