package classes.armas;

import interfaces.IArma;
import interfaces.IHabilidade;

public abstract class Arma implements IArma {
    protected int danoBase;
    protected int danoAdicional;
    protected IHabilidade habilidade;
    
    
    public Arma(int danoBase, IHabilidade habilidade) {
        setDanoBase(danoBase);
        setHabilidade(habilidade);
    }
    
    public int getDanoBase() {
        return danoBase;
    }
    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }
    public int getDanoAdicional() {
        return danoAdicional;
    }
    public void setDanoAdicional(int danoAdicional) {
        this.danoAdicional = danoAdicional;
    }
    public IHabilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(IHabilidade habilidade) {
        this.habilidade = habilidade;
    }
    
}
