package com.exemplo.debbug;

import com.exemplo.debbug.imc.CalculadorDeImc;
import com.exemplo.debbug.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Maike", 1.65, 100.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }

}
