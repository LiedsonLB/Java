package oo.jogodavelha.models;

import oo.jogodavelha.models.Jogador;
import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;

    public Jogo(){}

    public void init() {
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador("Jogador1", 'X');
        jogador2 = new Jogador("Jogador2", 'O');
        jogadorAtual = jogador1;
    }

    public Tabuleiro getBoard() {
        return tabuleiro;
    }

    public boolean check(Jogada jogada) throws ExcecaoPorSimboloInvalido {
        // Verificação de simbolo
        if (jogadorAtual.getSimbolo() != 'X' && jogadorAtual.getSimbolo() != 'O') {
            throw new ExcecaoPorSimboloInvalido("Símbolo inválido");
        }
        return true;
    }
    
    public boolean add(Jogada jogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
        Coordenada coordenada = new Coordenada(jogada.getCoordenada().getLinha(), jogada.getCoordenada().getColuna());
        Jogada jogadaAtual = new Jogada(jogadorAtual.getSimbolo(), coordenada);

        int linha = jogadaAtual.getCoordenada().getLinha();
        int coluna = jogadaAtual.getCoordenada().getColuna();

        // Verificação de posição inexistente
        if (tabuleiro.jogadaInexistente(linha, coluna)) {
            throw new ExcecaoPorCoordenadaInvalida("Posição inexistente");
        }

        // Verificação de zona preenchida
        if (tabuleiro.jogadaInvalida(linha, coluna)) {
            throw new ExcecaoPorCoordenadaInvalida("A posição já está ocupada por outro símbolo.");
        }

        // Adicionar jogada
        tabuleiro.registrarJogada(jogadaAtual);
    
        // Alternar para o próximo jogador
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
        
        // Verificação de jogar 2 vezes
        if (tabuleiro.jogadaDuasVezes(jogada, jogadorAtual)) {
            throw new ExcecaoPorSimboloInvalido("Não é a vez deste jogador.");
        }
    
        return false;
    }
    

    public boolean hasWinner() {
        return tabuleiro.verificarVitoria(jogador1) || tabuleiro.verificarVitoria(jogador2);
    }

    public boolean verificarEmpate() {
        return tabuleiro.tabuleiroCheio() && !hasWinner();
    }
}