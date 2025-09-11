package edu.cezar.quartaSemana.Condicionais;
import java.util.ArrayList;


public class listaArray {
    public static void main(String[] args) {
        //Vetor constante
        String[] nomesArr = new String[10];
        nomesArr[0] = "Yasmin";

        // Array dynamic
        ArrayList<String> names = new ArrayList<>();
        //Adding new items
        names.add("Cezar");
        names.add("Maria");
        names.add("Marcelo");

        //Printing the old item
        System.out.println("O antigo nome é: " .concat(names.get(0)));

        //Removendo o item antigo
        names.remove(0);
        System.out.println("O novo nome é: " .concat(names.get(0)));

    }
}