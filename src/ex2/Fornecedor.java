package ex2;

import ex1.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldo =  this.valorCredito - valorDivida;
        return saldo;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "(nome = " + this.getNome()+
                ") (Endereco = " +this.getEndereco()+
                ") (Telefone = " +this.getEndereco()+
                ") (saldo = " + obterSaldo() +
                ")}";
    }
}
