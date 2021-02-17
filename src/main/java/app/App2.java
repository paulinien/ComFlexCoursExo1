package main.java.app;

import main.java.imc.L1;
import main.java.imc.LS1;
import main.java.imc.SL1;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        L1 l1 = new L1();
        LS1 ls1 = new LS1();
        SL1 sl1 = new SL1(ls1, l1);
    }
}
