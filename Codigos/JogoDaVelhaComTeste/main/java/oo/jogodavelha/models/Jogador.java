package oo.jogodavelha.models;

public class Jogador {
    private String nome;
    private char simbolo;

    public Jogador(String nome, char simbolo){
        this.simbolo = simbolo;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public char getSimbolo(){
        return simbolo;
    }
}