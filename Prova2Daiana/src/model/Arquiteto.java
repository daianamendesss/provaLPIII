package model;

public class Arquiteto extends Funcionario {
    private double valorHoraExtra;
    private int projetosParticipantes;

    public Arquiteto(String nome, double salarioFixo, double valorHoraExtra, int projetosParticipantes) {
        super(nome, "Arquiteto", salarioFixo);
        this.valorHoraExtra = valorHoraExtra;
        this.projetosParticipantes = projetosParticipantes;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFixo() + (valorHoraExtra) + (getSalarioFixo() * 0.02 * projetosParticipantes);
    }
}
