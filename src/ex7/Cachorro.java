package ex7;

import javax.swing.*;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null,this.getNome()+" esta Latindo");
    }
    @Override
    public void realizarAcao() {
        JOptionPane.showMessageDialog(null,"Cachorro esta correndo");
    }
}
