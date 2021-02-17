package imc;


import tyc.J;
import tyc.PreSensor;

public class PS1 extends PreSensor {

    public PS1(J j) {
        super(j);
    }

    @Override
    public void detection(Boolean b) {
        j.setPresence(b);
    }
}
