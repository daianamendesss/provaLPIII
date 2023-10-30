package model;

public class Analista extends Funcionario {
    private double valorHoraExtra;

    public Analista(String nome, double salarioFixo, double valorHoraExtra) {
        super(nome, "Analista", salarioFixo);
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFixo() + valorHoraExtra;
    }
}