package classes.atributos;

public class Atributos {
    protected int forca;
    protected int destreza;
    protected int inteligencia;
    
    
    public Atributos(int forca, int destreza, int inteligencia) {
        setForca(forca);
        setDestreza(destreza);
        setInteligencia(inteligencia);
    }


    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
