package classes.efeitos;

import classes.personagens.Personagem;
import interfaces.IStatusEffect;

public class Queimadura implements IStatusEffect {

    @Override
    public void efeito(Personagem p) {
        p.setVida(p.getVida() - 10);
    }
    
}
