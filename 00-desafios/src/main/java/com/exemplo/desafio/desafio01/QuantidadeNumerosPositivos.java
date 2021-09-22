package com.exemplo.desafio.aritmeticos.desafio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        List<Float> listaNumeros = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Float valor = Float.parseFloat(st.nextToken());
            listaNumeros.add(valor);
        }

        long numerosPositivos = listaNumeros.stream().filter(numero -> numero > 0 ).count();

        System.out.println(numerosPositivos + " valores positivos");
    }
}
