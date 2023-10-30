package model;

public class LiderTecnico extends Funcionario {
    private double valorHoraExtra;
    private int membrosEquipe;

    public LiderTecnico(String nome, double salarioFixo, double valorHoraExtra, int membrosEquipe) {
        super(nome, "Líder Técnico", salarioFixo);
        this.valorHoraExtra = valorHoraExtra;
        this.membrosEquipe = membrosEquipe;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFixo() + (valorHoraExtra) + (getSalarioFixo() * 0.05 * membrosEquipe);
    }
}