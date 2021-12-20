package ex6;

import ex3.Empregado;

public class Vendedor extends Empregado {
    private int valorVendas;
    private int comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, int salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    public void calcularSalario(){
        this.setSalario (this.getSalario() -((this.getSalario()*this.getImposto())/100));
        int calc = this.getSalario()+((valorVendas*comissao)/100);
        this.setSalario(calc);
    }

    public void setValorVendas(int valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
}
