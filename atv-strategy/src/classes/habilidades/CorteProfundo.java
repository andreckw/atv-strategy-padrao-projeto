package classes.habilidades;

import java.util.Random;

import classes.efeitos.Sangramento;
import classes.personagens.Personagem;
import interfaces.IHabilidade;
import interfaces.IStatusEffect;

public class CorteProfundo implements IHabilidade {

    protected int turnosRestantes;
    protected IStatusEffect efeito;

    public CorteProfundo() {
        this.efeito = new Sangramento();
    }

    @Override
    public void hab(Personagem p) {
        // Se ja tiver o efeito volta
        for (IStatusEffect effect : p.getEeitos()) {
            if (effect.getClass().isInstance(efeito)) {
                if (turnosRestantes > 0) {
                    return ;
                }

                p.removeEfeito(effect);
            }
        }

        Random r = new Random();
        int n = r.nextInt(101);
        if (n <= 30) {
            this.turnosRestantes = 3;
            p.addEfeito(efeito);
        }
    }
    
}
