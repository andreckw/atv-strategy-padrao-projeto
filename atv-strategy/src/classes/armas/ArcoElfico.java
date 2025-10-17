package classes.armas;

import classes.personagens.Personagem;

public class ArcoElfico extends Arma {

    public ArcoElfico() {
        super(12, null);
    }

    @Override
    public double dano(Personagem p) {
        return this.getDanoBase() + this.getDanoAdicional();
    }

    @Override
    public boolean requisito(Personagem p) {
        return p.getAtr().getDestreza() >= 8;
    }

    @Override
    public void custo(Personagem p) {
        p.setMana(p.getMana() - 15);
    }
    
}
