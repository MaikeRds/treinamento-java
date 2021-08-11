package com.exemplo.avancado.aula1;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = (valor, valor2) -> {
            return valor + valor2;
        };
        System.out.println(funcao1.gerar("Joao", "aike"));
    }
}



interface Funcao1 {
    String gerar(String valor, String valor2);
}
