package ex8;

import ex7.Animal;
import ex7.Cachorro;
import ex7.Cavalo;
import ex7.Preguica;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro",13);
        Cavalo cavalo = new Cavalo("Cavalo",5 );
        Preguica preguica = new Preguica("Preguiça",20);
        cachorro.emitirSom();
        cachorro.realizarAcao();
        cavalo.emitirSom();
        cavalo.realizarAcao();
        preguica.emitirSom();
        preguica.realizarAcao();
    }

}
