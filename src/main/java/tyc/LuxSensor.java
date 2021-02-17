package main.java.tyc;

public abstract class LuxSensor implements K {

    protected Lux lux = new Lux(0);

    @Override
    public abstract Lux getLux();
}
