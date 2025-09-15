package edu.cezar.quintaSemana.heranca;
// Para uma classe herdar de outra é necessario colocar o extends
// assim ela terá todos os atribuitos e metodos da classe Super
public class Humano extends SerVivo {

    public Humano(String nome){
        this.nome = nome;
    }

    @Override
    public void respirar() {
        System.out.println("Humano Respirando");
    }

}
