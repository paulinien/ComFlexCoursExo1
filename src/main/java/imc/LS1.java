package main.java.imc;

import main.java.tyc.Lux;
import main.java.tyc.LuxSensor;

public class LS1 extends LuxSensor {
    @Override
    public Lux getLux() {
        return lux;
    }
}
