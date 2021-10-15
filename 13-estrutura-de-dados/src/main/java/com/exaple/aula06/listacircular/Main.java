package com.exaple.aula06.listacircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();

        lista.add("cO");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.add("c1");
        System.out.println(lista);

        lista.add("c2");
        lista.add("c3");
        System.out.println(lista);

        System.out.println(lista.get(7));
        System.out.println(lista.get(323));

    }
}
