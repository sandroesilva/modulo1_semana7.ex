package ex5;

import ex3.Empregado;

public class Operario extends Empregado {
    private int valorProducao;
    private int comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, int salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }
    public void calcularSalario(){
        this.setSalario (this.getSalario() -((this.getSalario()*this.getImposto())/100));
        int calc = this.getSalario()+((valorProducao*comissao)/100);
        this.setSalario(calc);
    }
    public void setValorProducao(int valorProducao){
        this.valorProducao = valorProducao;
    }

    public void setComissao(int comissao){
        this.comissao = comissao;
    }



}
