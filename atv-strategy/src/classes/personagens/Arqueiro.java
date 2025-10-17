package classes.personagens;

import interfaces.IArma;

public class Arqueiro extends Personagem {

    public Arqueiro(IArma arma) {
        super(90, 80, 8, 15, 7, arma);
    }
}
