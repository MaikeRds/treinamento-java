package com.exemplo.jdbc.core;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);

        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(1);

        //System.out.println(alunoParaConsulta);

        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Maike",
                26,
                "CE"
        );

        //alunoDAO.create(alunoParaInsercao);

        // =========================== 3 - Delete ===================================================
        //alunoDAO.delete(1);

        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(4);
        alunoParaAtualizar.setNome("Maike Rodrigues");
        alunoParaAtualizar.setIdade(27);
        alunoParaAtualizar.setEstado("SP");

        //alunoDAO.update(alunoParaAtualizar);

    }
}
