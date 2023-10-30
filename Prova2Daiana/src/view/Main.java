package view;

import java.util.ArrayList;
import java.util.List;

import model.Analista;
import model.Arquiteto;
import model.Funcionario;
import model.Gerente;
import model.LiderTecnico;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Analista("João", 3000, 100));
        funcionarios.add(new Arquiteto("Daiana", 4000, 200, 2));
        funcionarios.add(new LiderTecnico("Emerson", 4500, 150, 3));
        funcionarios.add(new Gerente("Fábio", 5000, 250, 5, 1000));

        FolhaPagamentoView view = new FolhaPagamentoView();
        view.imprimirFolha(funcionarios);
    }
}