package classes.personagens;

import interfaces.IArma;

public class Guerreiro extends Personagem{

    public Guerreiro(IArma arma) {
        super(120, 50, 15, 8, 5, arma);
    }
    
}
