package imc;


import tyc.L;
import tyc.ManagerP;

public class MP1 extends ManagerP {
    public MP1(L l) {
        super(l);
    }

    @Override
    public void setPresence(Boolean p)  {
        this.p = p;
    }

    @Override
    public void on() {
        if(p) l.on();
    }

    @Override
    public void off() {
        if(!p) l.off();
    }
}
