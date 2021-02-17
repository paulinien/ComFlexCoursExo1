package TyC;

public class LuxSensor implements K {

    protected Lux lux = new Lux(0);

    @Override
    public Lux getLux() {
        return lux;
    }
}
