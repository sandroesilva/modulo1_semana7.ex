package ex7;

import javax.swing.*;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Animal emitindo som");
    }
    public void realizarAcao(){
        JOptionPane.showMessageDialog(null,"Animal esta correndo");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
