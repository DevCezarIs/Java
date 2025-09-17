package edu.cezar.JavaMid.primeiraSemana;

import java.util.*;


public class main {
    public static void main(String[] args) {
        /*  Usando List para criar uma lista da qual os valores serao
        adcionados futuramente  */

        List<String> lista = new ArrayList<>();
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Orange");

        /*  Usando Set para criar uma lista da qual os valores serao
        adcionados futuramente, sem a possibilidade de duplicar elementos*/

        Set<String> SetString = new HashSet<>();
        SetString.add("Apple");
        SetString.add("Banana");
        SetString.add("Orange");
        //SetString.add("Orange"); #ERROR

        // Utlizando Map

        Map<Integer,String> meuMap = new HashMap();
        meuMap.put(1,"Apple");
        meuMap.put(2,"Banana");
        meuMap.put(3,"Orange");
        meuMap.put(4,"cherry");

        //Utilizando Queue

        Queue<Integer>queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek()); // espia
        System.out.println(queue.poll()); // Get e Remove, se nao tiver nada na fila retorna null
        System.out.println(queue.remove());//  Get e Remove, se nao tiver nada na fila lanca uma exeption
        System.out.println(queue.peek());

    }
}
