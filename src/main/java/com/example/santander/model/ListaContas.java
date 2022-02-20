package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaContas {
    private  static List<ContaModel> contas = new ArrayList<>();

    public void adiciona(ContaModel contaModel){
        this.contas.add(contaModel);
    }

    public List<ContaModel> buscaContas(){
        return this.contas;
    }
}
