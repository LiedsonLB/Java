package oo.jogodavelha.models;

public class Jogada {
    private Coordenada coordenada;
    private char simbolo;

    public Jogada(char simbolo, Coordenada coordenada){
        this.coordenada = coordenada;
        this.simbolo = simbolo;
    }

    public Coordenada getCoordenada(){
        return coordenada;
    }

    public char getSimbolo(){
        return simbolo;
    }
}
