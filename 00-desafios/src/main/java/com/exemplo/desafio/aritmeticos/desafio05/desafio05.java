package com.exemplo.desafio.aritmeticos.desafio05;

import java.io.IOException;
import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente
        int totalKmPercorrido = leitor.nextInt();
        double totalConsumoCombustivel  = leitor.nextDouble();

        //insira as variaveis de acordo com o enunciado
        double media = totalKmPercorrido / totalConsumoCombustivel;
        System.out.println(String.format("%.3f km/l",   media   ));
    }
}
