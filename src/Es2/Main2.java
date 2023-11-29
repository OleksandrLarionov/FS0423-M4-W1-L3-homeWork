package Es2;

import Es2.entities2.Call;
import Es2.entities2.Sim;

public class Main2 {
    public static void main(String[] args) {
        Call callUno = new Call("3258458574", 20);
        Call callDue = new Call("3258434574", 10);
        Call callTre = new Call("3258434574", 10);
        Call callQuattro = new Call("3258434574", 10);
        Call callCinque = new Call("3258434574", 10);
        Call callSei = new Call("3258434555", 1);

        Sim nuovaSim1 = new Sim("3256758541");
        nuovaSim1.ultimeCinqueChiamate.add(callUno);
        nuovaSim1.ultimeCinqueChiamate.add(callDue);
        nuovaSim1.ultimeCinqueChiamate.add(callTre);
        nuovaSim1.ultimeCinqueChiamate.add(callQuattro);
        nuovaSim1.ultimeCinqueChiamate.add(callCinque);
        nuovaSim1.ultimeCinqueChiamate.add(callSei);

        nuovaSim1.simData();
    }
}
