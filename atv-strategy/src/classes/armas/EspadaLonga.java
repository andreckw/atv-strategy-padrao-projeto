package classes.armas;

import classes.habilidades.CorteProfundo;
import classes.personagens.Personagem;

public class EspadaLonga extends Arma {

    public EspadaLonga() {
        super(15, new CorteProfundo());
    }

    @Override
    public double dano(Personagem p) {
        this.getHabilidade().hab(p);
        return this.getDanoBase() + this.getDanoAdicional();
    }

    @Override
    public boolean requisito(Personagem p) {
        return p.getAtr().getForca() >= 10;
    }
    
    @Override
    public void custo(Personagem p) {
        // Nao tem custo
    }
}
