package TyC;

public class ManagerP implements L, J {

    protected L l;
    protected Boolean p;

    public ManagerP(L l) {
        this.l = l;
    }

    @Override
    public void setPresence(Boolean p) {
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
