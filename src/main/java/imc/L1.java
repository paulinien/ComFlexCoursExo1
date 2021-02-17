package main.java.imc;

import main.java.tyc.Device;

public class L1 extends Device {
    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public Boolean isOn() {
        return this.isOn;
    }
}
