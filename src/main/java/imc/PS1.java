package main.java.imc;

import main.java.tyc.J;
import main.java.tyc.PreSensor;

public class PS1 extends PreSensor {

    public PS1(J j) {
        super(j);
    }

    @Override
    public void detection(Boolean b) {
        j.setPresence(b);
    }
}
