package com.colini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.colini.db.FabricaConexoes;
import com.colini.interfaces.AlunoDAO;
import com.colini.models.Aluno;

public class AlunoDAOImpl implements AlunoDAO {
    private Connection conexao;

    public AlunoDAOImpl() throws SQLException {
        this.conexao = FabricaConexoes.getInstance().getConnection();
    }

    @Override
    public void inserir(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, email) VALUES (?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void alterar(Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public void editar(Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public void excluir(Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

}
