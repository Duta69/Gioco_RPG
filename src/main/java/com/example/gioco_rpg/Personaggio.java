package com.example.gioco_rpg;

public class Personaggio {

    private String nome;
    private int attacco;
    private int difesa;
    private int vitaRimanente;

    public Personaggio(String n, int a, int d, int vR){

        this.nome=n;
        this.attacco=a;
        this.difesa=d;
        this.vitaRimanente=vR;
    }
}
