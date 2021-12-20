package ex10;

import ex7.Animal;
import ex7.Cachorro;
import ex7.Cavalo;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> jaulas = new ArrayList<>();

    {
        for(int i = 0; i < 3; i++) {
            jaulas.add(new Cachorro("Cachorro" + (i+1), (int)(Math.random()* (10-1)+ 1)));
            jaulas.add(new Cavalo("Cavalo" + (i+1), (int)(Math.random()* (10-1)+ 1)));
            jaulas.add(new Cavalo("Preguiça" + (i+1), (int)(Math.random()* (10-1)+ 1)));
        }
        jaulas.add(new Cachorro("Cachorro" + 4, (int)(Math.random()* (5-1)+ 1)));
        for (Animal model : jaulas) {

            model.emitirSom();
        }

    }
    public static void main(String[] args) {
        new Zoologico();
    }

}
