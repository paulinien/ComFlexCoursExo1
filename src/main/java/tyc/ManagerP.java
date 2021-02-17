package main.java.tyc;

public abstract class ManagerP implements L, J {

    protected L l;
    protected Boolean p;

    public ManagerP(L l) {
        this.l = l;
    }

    @Override
    public abstract void setPresence(Boolean p);

    @Override
    public abstract void on();

    @Override
    public abstract void off();
}
