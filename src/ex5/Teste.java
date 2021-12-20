package ex5;



import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Operario operario = new Operario("Edwings","Rua no Ar", "10001-0001",2,1500);
        operario.setComissao(10);
        operario.setValorProducao(1500);
        operario.calcularSalario();

        JOptionPane.showMessageDialog(null,operario);
        operario.setNome("Malfoy");
        operario.setEndereco("Hogwarts,Bloco Sensoriana");
        operario.setTelefone("99999-8888");
        operario.setSalario(2000);
        operario.setImposto(10);
        operario.setComissao(20);
        operario.setValorProducao(400);
        operario.calcularSalario();
        JOptionPane.showMessageDialog(null,operario);
    }
}
