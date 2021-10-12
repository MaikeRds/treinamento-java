package com.exemplo.collections2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploStream {
    public static void main(String[] args) {
        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

        List<String> numeros = List.of("1", "2", "5", "3");
    }
}