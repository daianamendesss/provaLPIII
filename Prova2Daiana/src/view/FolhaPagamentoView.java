package view;

import java.util.List;

import model.Funcionario;

public class FolhaPagamentoView {
    public void imprimirFolha(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: R$" + funcionario.calcularSalario());
            System.out.println();
        }
        double totalSalarios = funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
        System.out.println("Total da folha de pagamento: R$" + totalSalarios);
    }
}