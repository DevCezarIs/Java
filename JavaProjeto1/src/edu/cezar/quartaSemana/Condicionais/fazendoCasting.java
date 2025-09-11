package edu.cezar.quartaSemana.Condicionais;

public class fazendoCasting {
    static void main() {
        //casting simples
        double variavelAdoub = 10.2;
        int variavelAInt = (int) variavelAdoub;

        //casting string para int

        String variavelAString = "10";
        int variavelAsInt = Integer.parseInt(variavelAString);

        //casting int para string

        String variavelAString2 = String.valueOf(variavelAsInt);

    }
}