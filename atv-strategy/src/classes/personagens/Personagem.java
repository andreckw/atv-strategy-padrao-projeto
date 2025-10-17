package classes.personagens;

import java.util.ArrayList;
import java.util.List;

import classes.atributos.Atributos;
import interfaces.IArma;
import interfaces.IHabilidade;
import interfaces.IStatusEffect;

public abstract class Personagem {
    
    protected int vida;
    protected int mana;

    protected Atributos atr;
    
    protected IArma arma;
    protected List<IHabilidade> habilidades = new ArrayList<>();
    protected List<IStatusEffect> efeitos = new ArrayList<>();

    public Personagem(int vida, int mana, int forca, int destreza, int inteligencia, IArma arma) {
        setVida(vida);
        setMana(mana);
        setAtr(new Atributos(forca, destreza, inteligencia));
        setArma(arma);
    }

    public void atacar(Personagem inimigo) {
        inimigo.setVida((int) (inimigo.getVida() - arma.dano(inimigo)));
        arma.custo(this);
    }

    public void addHab(IHabilidade hab) {
        this.habilidades.add(hab);
    }

    public void addEfeito(IStatusEffect status) {
        this.efeitos.add(status);
    }

    public void removeEfeito(IStatusEffect status) {
        this.efeitos.remove(status);
    }
    
    public IArma getArma() {
        return arma;
    }
    
    public int getVida() {
        return vida;
    }
    
    public int getMana() {
        return mana;
    }

    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setArma(IArma arma) {
        if (!arma.requisito(this)) {
            System.out.println("Personagem nao pode equipar essa arma!");
            return ;
        }
        
        this.arma = arma;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Atributos getAtr() {
        return atr;
    }

    public void setAtr(Atributos atr) {
        this.atr = atr;
    }

    public List<IStatusEffect> getEeitos() {
        return efeitos;
    }

    
}
