package com.mycompany.poo.Recuperao01;

public abstract class Esporte {
    private String nome;
    private int numeroJogadores;   
    
    public Esporte(String nome, int numeroJogadores) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
    }



    public abstract void iniciarPartida();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
}
