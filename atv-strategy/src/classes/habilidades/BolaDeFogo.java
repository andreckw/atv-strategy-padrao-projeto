package classes.habilidades;

import classes.efeitos.Queimadura;
import classes.personagens.Personagem;

public class BolaDeFogo extends Habilidade {

    public BolaDeFogo() {
        super(new Queimadura());
    }

    @Override
    public void hab(Personagem p) {
        if (this.checarTurnos(p)) {
            return;
        }

        this.turnosRestantes = 2;
        p.addEfeito(efeito);
    }
    
}
