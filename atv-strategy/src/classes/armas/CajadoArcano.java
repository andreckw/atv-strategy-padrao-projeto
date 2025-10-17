package classes.armas;

import classes.personagens.Personagem;

public class CajadoArcano extends Arma {

    public CajadoArcano() {
        super(8, null);
    }

    @Override
    public double dano(Personagem p) {
        return this.getDanoBase() + this.getDanoAdicional();
    }

    @Override
    public boolean requisito(Personagem p) {
        return p.getAtr().getInteligencia() >= 12;
    }
    
    @Override
    public void custo(Personagem p) {
        p.setMana(p.getMana() - 25);
    }

}
