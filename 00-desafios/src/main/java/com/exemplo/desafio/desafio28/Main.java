package com.exemplo.desafio.desafio28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        System.out.println(a);
//        st = new StringTokenizer(br.readLine());
//        int b = Integer.parseInt(st.nextToken());
//        int total = a * b; // Altere o valor da variável com o cálculo esperado
//        System.out.println(b);
//        System.out.println("PROD = " + total);

        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5) / 11; //complete os espaços em branco com as respectivas variáveis.

        System.out.printf("MEDIA = %.5f%n", media); // complete com a variável que representa o resultado da média.
        sc.close();

    }
}

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5) / 11; //complete os espaços em branco com as respectivas variáveis.

        System.out.printf("MEDIA = %.5f%n", media); // complete com a variável que representa o resultado da média.
        sc.close();

    }

}

