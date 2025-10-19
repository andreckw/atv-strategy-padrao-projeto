package classes.habilidades;

import java.util.Random;

import classes.efeitos.Sangramento;
import classes.personagens.Personagem;
import interfaces.IStatusEffect;

public class CorteProfundo extends Habilidade {

    protected int turnosRestantes;
    protected IStatusEffect efeito;

    public CorteProfundo() {
        super(new Sangramento());
    }

    @Override
    public void hab(Personagem p) {
        // Se ja tiver o efeito volta
        if (this.checarTurnos(p)) {
            return;
        }

        Random r = new Random();
        int n = r.nextInt(101);
        if (n <= 30) {
            this.turnosRestantes = 3;
            p.addEfeito(efeito);
        }
    }
    
}
