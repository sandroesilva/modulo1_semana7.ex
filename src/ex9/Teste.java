package ex9;

import ex7.Cachorro;
import ex7.Cavalo;
import ex7.Preguica;

public class Teste {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Cachorro",13);
        Cavalo cavalo = new Cavalo("Cavalo",5 );
        Preguica preguica = new Preguica("Preguiça",20);
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

    }
}
