package oo.jogodavelha.models;

import oo.jogodavelha.models.Jogador;

public class Tabuleiro {
    private char[][] tabuleiro = new char[3][3];

    public Tabuleiro() {
        construirTabuleiro();
    }

    public void construirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public char getPosicoes(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    public boolean isEmpty() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public void registrarJogada(Jogada jogada) {
        Coordenada marcar = jogada.getCoordenada();
        tabuleiro[marcar.getLinha()][marcar.getColuna()] = jogada.getSimbolo();
    }

    public boolean jogadaInvalida(int linha, int coluna) {
        return tabuleiro[linha][coluna] != ' ';
    }

    public boolean jogadaInexistente(int linha, int coluna) {
        return linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3;
    }

    public boolean jogadaDuasVezes(Jogada jogada, Jogador jogador) {
        return jogada.getSimbolo() != jogador.getSimbolo();
    }

    public boolean verificarVitoria(Jogador jogador) {
        char simbolo = jogador.getSimbolo();
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true;
            }
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
                return true;
            }
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("O jogo terminou em EMPATE");
        return true;
    }
}
