package ex2;

import javax.swing.*;

public class Teste {
    public static void main(String[] args){
        Fornecedor fornecedor = new Fornecedor("Srs Dursley","Rua dos Alfineiros, n4","6666-7777",200,300);
        JOptionPane.showMessageDialog(null,fornecedor);
        fornecedor.setNome("Malfoy");
        fornecedor.setEndereco("Hogwarts,Bloco Sensoriana");
        fornecedor.setTelefone("99999-8888");
        fornecedor.setValorCredito(1245.44);
        fornecedor.setValorDivida(1000);
        JOptionPane.showMessageDialog(null,fornecedor);
    }

}
