package main.java.tyc;

public abstract class PreSensor {

    protected J j;

    public PreSensor(J j) {
        this.j = j;
    }

    public abstract void detection(Boolean b);
}
