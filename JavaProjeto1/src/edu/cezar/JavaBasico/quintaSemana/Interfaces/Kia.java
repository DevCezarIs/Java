package edu.cezar.JavaBasico.quintaSemana.Interfaces;
// Aqui criamos a classe com o decorador override pois estamos
// Implementando a interface(sobreescrevendo) na classe criada

public class Kia implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");

    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");

    }
}
