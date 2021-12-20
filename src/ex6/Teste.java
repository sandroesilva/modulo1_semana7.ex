package ex6;

import ex5.Operario;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Edwings","Rua no Ar", "10001-0001",2,1500);
        vendedor.setComissao(10);
        vendedor.setValorVendas(1500);
        vendedor.calcularSalario();

        JOptionPane.showMessageDialog(null,vendedor);
        vendedor.setNome("Malfoy");
        vendedor.setEndereco("Hogwarts,Bloco Sensoriana");
        vendedor.setTelefone("99999-8888");
        vendedor.setSalario(2000);
        vendedor.setImposto(10);
        vendedor.setComissao(20);
        vendedor.setValorVendas(400);
        vendedor.calcularSalario();
        JOptionPane.showMessageDialog(null,vendedor);
    }
}
