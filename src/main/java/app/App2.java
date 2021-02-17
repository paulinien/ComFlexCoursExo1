package app;

import imc.L1;
import imc.LS1;
import imc.SL1;

public class App2
{
    public static void main( String[] args )
    {
        L1 l1 = new L1();
        LS1 ls1 = new LS1();
        SL1 sl1 = new SL1(ls1, l1);
    }
}
