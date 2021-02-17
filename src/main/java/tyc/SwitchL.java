package tyc;

public abstract class SwitchL implements I {

    protected K k;
    protected L l;
    //Seuil de luminosité
    protected int seuilLux = 500;

    public SwitchL(K k, L l){
        this.k = k;
        this.l = l;
    }

    @Override
    public abstract void check();
}
