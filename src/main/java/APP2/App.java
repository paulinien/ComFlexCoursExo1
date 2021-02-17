package APP2;

import ImC.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        L1 l1 = new L1();
        LS1 ls1 = new LS1();
        MP1 mp1 = new MP1(l1);
        SL1 sl1 = new SL1(ls1, mp1);
        PS1 ps1 = new PS1(mp1);
    }
}
