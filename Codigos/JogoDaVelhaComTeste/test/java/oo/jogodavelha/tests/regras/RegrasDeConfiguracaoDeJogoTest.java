package oo.jogodavelha.tests.regras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import oo.jogodavelha.models.Jogo;

public class RegrasDeConfiguracaoDeJogoTest {

	@Test
	public void testEmptyJogoAtStart() {
		// Dados...
		Jogo g = new Jogo();
		g.init();
		// Quando...
		boolean resultado = g.getBoard().isEmpty();
		// Então...
		assertTrue(resultado);
	}

}
