package ex3;

import ex1.Pessoa;

import javax.swing.*;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private int salario;
    private int imposto  = 5;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, int salario) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salario = salario;

    }
    public void calcularSalario(){
        this.salario -= (this.salario*imposto)/100;

    }



    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }



    public void setSalario(int salario) {
        this.salario = salario;
    }



    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public int getSalario() {
        return salario;
    }

    public int getImposto() {
        return imposto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "(nome = " + this.getNome()+
                ") (Endereco = " +this.getEndereco()+
                ") (Telefone = " +this.getEndereco()+
                ") (Codigo Setor= " + this.codigoSetor +
                ") (Salario = " + this.salario +
                ")}";
    }
}
