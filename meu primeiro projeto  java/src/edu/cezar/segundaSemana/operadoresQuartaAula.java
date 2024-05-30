package edu.cezar.segundaSemana;

public class operadoresQuartaAula {
    public static void main (String[] args) {
        String nomeUm = "Cezar"; 
        String nomeDois = new String("Cezar");

        System.out.println(nomeUm.equals(nomeDois));
        


        int numero1 = 1; 
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao );
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao );
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao );
        
    }
}
