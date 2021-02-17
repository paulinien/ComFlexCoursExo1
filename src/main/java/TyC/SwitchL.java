package TyC;

public class SwitchL implements I {

    protected K k;
    protected L l;
    //Seuil de luminosité
    protected int seuilLux = 500;

    public SwitchL(K k, L l){
        this.k = k;
        this.l = l;
    }

    @Override
    public void check() {
        //Trop de lumières ==> on éteint
        if(k.getLux().getNbLux() >= seuilLux){
            l.off();
        } else {
            //Pas assez de lumières ==> on allume
            l.on();
        }
    }
}
