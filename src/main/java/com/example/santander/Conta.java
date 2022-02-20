package com.example.santander;

import com.example.santander.model.ClienteModel;
import com.example.santander.model.ContaModel;
import com.example.santander.model.ListaClientes;
import com.example.santander.model.ListaContas;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Conta", value = "/conta")
public class Conta extends HttpServlet {
    ListaContas listaContas = new ListaContas();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        Integer agencia = Integer.parseInt(request.getParameter("agencia"));
        Integer conta = Integer.parseInt(request.getParameter("conta"));

        ContaModel contaModel = new ContaModel();
        contaModel.setNome(nome);
        contaModel.setEmail(email);
        contaModel.setAgencia(agencia);
        contaModel.setConta(conta);

        listaContas.adiciona(contaModel);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Conta.jsp");
        request.setAttribute("contas", null);
        request.setAttribute("conta", contaModel);
        request.setAttribute("title", nome + " foi cadastrado com sucesso!!!");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("contas", listaContas.buscaContas());
        request.setAttribute("conta", null);
        request.setAttribute("title", "Contas");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Conta.jsp");
        requestDispatcher.forward(request, response);

    }
}
