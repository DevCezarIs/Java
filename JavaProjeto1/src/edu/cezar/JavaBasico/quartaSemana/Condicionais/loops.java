package edu.cezar.JavaBasico.quartaSemana.Condicionais;
import java.util.ArrayList;

public class loops {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Cezar");
        names.add("Maria");
        names.add("Yasmin");
        names.add("Marcelo");

        String[] namesVetor = new String[8];
        namesVetor[0] = "Cezar";
        namesVetor[1] = "Maria";
        namesVetor[2] = "Yasmin";
        namesVetor[3] = "Marcelo";
        namesVetor[4] = "Yasmin";
        namesVetor[5] = "Marcelo";
        namesVetor[6] = "Yasmin";
        namesVetor[7] = "Marcelo";

         //Com arrays
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //Outra maneira com arrays

        for (String string : namesVetor) {
            System.out.println(string);
        }

        // Com vetores

        for (int i = 0; i < namesVetor.length; i++){
            System.out.println(namesVetor[i]);
        }

        // Outra maneira com vetores
        for (String s : namesVetor) {
            System.out.println(s);
        }


        // Loop While em prática
        int contador = 0;
        while (contador <= 11){
            System.out.println("contador: " + contador);
            contador++;
        }
        System.out.println("Fim do while");

    }


}



