package interfaces;

import classes.personagens.Personagem;

public interface IArma {
    public double dano(Personagem p);
    public boolean requisito(Personagem p);
    public void custo(Personagem p);
}
