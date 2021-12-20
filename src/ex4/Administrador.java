package ex4;

import ex3.Empregado;

public class Administrador extends Empregado {
    private int ajudaDeCusto = 500;
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, int salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    @Override
    public void calcularSalario(){
        this.setSalario (this.getSalario() -((this.getSalario()*this.getImposto())/100));
        int calc = this.getSalario()+ajudaDeCusto;
        this.setSalario(calc);
    }

    public void setAjudaDeCusto(int ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
