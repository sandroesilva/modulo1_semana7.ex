package ex7;

import javax.swing.*;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null,this.getNome()+" esta relinchando");
    }
    @Override
    public void realizarAcao() {
        JOptionPane.showMessageDialog(null,"Cavalo esta cavalgando");
    }
}
