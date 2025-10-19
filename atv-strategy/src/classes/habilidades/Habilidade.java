package classes.habilidades;

import classes.personagens.Personagem;
import interfaces.IHabilidade;
import interfaces.IStatusEffect;

public abstract class Habilidade implements IHabilidade {
    
    protected int turnosRestantes;
    protected IStatusEffect efeito;

    public Habilidade(IStatusEffect efeito) {
        this.efeito = efeito;
    }


    public boolean checarTurnos(Personagem p) {
        for (IStatusEffect effect : p.getEeitos()) {
            if (effect == null) {
                break;
            }

            if (effect.getClass().isInstance(efeito)) {
                if (turnosRestantes > 0) {
                    return true;
                }

                p.removeEfeito(effect);
            }
        }

        return false;
    }
}
