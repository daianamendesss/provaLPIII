package model;

public class Gerente extends Funcionario {
    private double valorHoraExtra;
    private int subordinados;
    private double bonusPorProjeto;

    public Gerente(String nome, double salarioFixo, double valorHoraExtra, int subordinados, double bonusPorProjeto) {
        super(nome, "Gerente", salarioFixo);
        this.valorHoraExtra = valorHoraExtra;
        this.subordinados = subordinados;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFixo() + (valorHoraExtra) + (getSalarioFixo() * 0.01 * subordinados) + bonusPorProjeto;
    }
}