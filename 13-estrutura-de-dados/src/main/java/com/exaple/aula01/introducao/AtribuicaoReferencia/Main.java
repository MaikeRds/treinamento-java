package com.exaple.aula01.introducao.AtribuicaoReferencia;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("A = " + a + "; B = " + b );

        b = 2;

        System.out.println("A = " + a + "; B = " + b );

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + "; objB = " + objB );

        objB.setNum(2);

        System.out.println("objA = " + objA + "; objB = " + objB );
    }
}
