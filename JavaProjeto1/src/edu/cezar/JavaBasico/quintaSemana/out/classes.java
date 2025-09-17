package edu.cezar.JavaBasico.quintaSemana.out;

public class classes {

    static void main(String[] args) {
        String modelo;
        Carro meuCarro = new Carro("Hb20", 2025);
        // cria a variavel, e coloca nela o valor do metodo
        String result = meuCarro.acelerar();
        System.out.println(result);



    }
}

class Carro{
    //Construtores declara os atributos
    int ano;
    String modelo;
    // Atribui
    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    // Metodos do Objeto
    public String acelerar(){
        System.out.println("Acelerando Carro " + this.modelo);
        return "oi";
    }
}