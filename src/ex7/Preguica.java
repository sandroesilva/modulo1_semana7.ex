package ex7;

import javax.swing.*;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null,this.getNome()+ " esta emitindo som desconhecido");
    }
    @Override
    public void realizarAcao() {
        JOptionPane.showMessageDialog(null,"Prehuiça esta subindo em árvores ");
    }
}
