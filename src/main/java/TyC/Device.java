package TyC;

public class Device implements L {

    protected Boolean isOn = false;

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    public Boolean getOn() {
        return isOn;
    }
}
