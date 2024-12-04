package com.colini.controllers;

import java.sql.SQLException;

import com.colini.dao.AlunoDAOImpl;
import com.colini.models.Aluno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SalvarController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private Pane paneTela;

    @FXML
    private TextField textfieldEmail;

    @FXML
    private TextField textfieldNome;

    AlunoDAOImpl alunoDAO;

    @FXML
    void salvar(ActionEvent event) throws SQLException {

        alunoDAO = new AlunoDAOImpl();

        String nome = textfieldNome.getText();
        String email = textfieldEmail.getText();

        Aluno aluno = new Aluno(nome, email);

        alunoDAO.inserir(aluno);

    }

}
