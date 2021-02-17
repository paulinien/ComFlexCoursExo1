package TyC;

public class PreSensor {

    protected J j;

    public PreSensor(J j) {
        this.j = j;
    }

    public void detection(Boolean b){
        j.setPresence(b);
    }
}
