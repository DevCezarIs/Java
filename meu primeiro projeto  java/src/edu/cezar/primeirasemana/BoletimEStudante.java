package edu.cezar.primeiraSemana;
public class BoletimEStudante {
    
    public static void main(String[] args) {
        int mediaFinal = 9;

        if (mediaFinal < 6)
            System.out.println("Reprovado");
            
        else if (mediaFinal == 6)  
            System.out.println("Prova Miniera");
        
        else
            System.out.println("Aprovado");
    }

}
