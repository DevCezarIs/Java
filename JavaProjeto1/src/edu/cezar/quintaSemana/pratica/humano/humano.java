package edu.cezar.quintaSemana.pratica.humano;

public class Humano extends Animal{
    int nivelInteligencia;

    public Humano(String nome, String raca, int idade, int nivelInteligencia){
       super(raca, idade, nome);
       this.nivelInteligencia = nivelInteligencia;

    };

    public void estudar(){
        System.out.println("Estudando");
        nivelInteligencia = nivelInteligencia + 1;
    };

    public boolean verificaCapacidade(){
        if(nivelInteligencia<= 5){
            return false;
        };


    }
}
