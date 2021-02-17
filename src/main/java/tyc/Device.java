package tyc;

public abstract class Device implements L {

    protected Boolean isOn = false;

    @Override
    public abstract void on();

    @Override
    public abstract void off();

    public abstract Boolean isOn();
}
