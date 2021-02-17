package imc;


import tyc.K;
import tyc.L;
import tyc.SwitchL;

public class SL1 extends SwitchL {
    public SL1(K k, L l) {
        super(k, l);
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
