package edu.cezar.quintaSemana.pratica.humano;

public abstract class Animal {
    String raca;
    int idade;
    String nome;

    public Animal(String raca, int idade, String nome){
        this.raca = raca;
        this.idade = idade;
        this.nome = nome;
    }

    public void respirar(){

    };
    public void acordar(){

    };
    public void dormir(){

    };
}
