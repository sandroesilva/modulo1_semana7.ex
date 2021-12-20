package ex3;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Edwings","Rua no Ar", "10001-0001",2,250);
        empregado.calcularSalario();
        JOptionPane.showMessageDialog(null,empregado);
        empregado.setNome("Malfoy");
        empregado.setEndereco("Hogwarts,Bloco Sensoriana");
        empregado.setTelefone("99999-8888");
        empregado.setSalario(1245);
        empregado.setCodigoSetor(10);
        empregado.setImposto(10);
        empregado.calcularSalario();
        JOptionPane.showMessageDialog(null,empregado);

    }
}
