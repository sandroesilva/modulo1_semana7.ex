package ex4;



import javax.swing.*;

public class Teste {
    public static void main(String[] args){
        Administrador administrador = new Administrador("Edwings","Rua no Ar", "10001-0001",1,250);
        administrador.calcularSalario();
        JOptionPane.showMessageDialog(null,administrador);
        administrador.setNome("Malfoy");
        administrador.setEndereco("Hogwarts,Bloco Sensoriana");
        administrador.setTelefone("99999-8888");
        administrador.setSalario(1245);
        administrador.setImposto(10);
        administrador.setAjudaDeCusto(500);
        administrador.calcularSalario();
        JOptionPane.showMessageDialog(null,administrador);
    }
}
