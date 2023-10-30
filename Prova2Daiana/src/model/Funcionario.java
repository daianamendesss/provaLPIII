package model;

public abstract class Funcionario {
    private String nome;
    private String cargo;
    private double salarioFixo;

    public Funcionario(String nome, String cargo, double salarioFixo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioFixo = salarioFixo;
    }

    public abstract double calcularSalario(); // Método abstrato a ser implementado pelas subclasses

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}

