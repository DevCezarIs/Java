package edu.cezar.JavaBasico.quintaSemana.heranca;

public abstract  class SerVivo {
    String nome;
    public void respirar() {};

    public void acordar() {
        System.out.println(this.nome +" está acordando");
    }


}
