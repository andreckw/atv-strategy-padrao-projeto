package classes.efeitos;

import classes.personagens.Personagem;
import interfaces.IStatusEffect;

public class Atordoamento implements IStatusEffect {

    @Override
    public void efeito(Personagem p) {
        System.out.println(p.getClass().getSimpleName() + " esta atordoado");
    }
    
}
