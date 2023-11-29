package Es2.entities2;

import java.util.ArrayList;

public class Sim {
    private String numeroDiTelefono;
    private double creditoDisponible = 0.0;
    public ArrayList<Call> ultimeCinqueChiamate;

    //    Costructor
    public Sim(String _numeroDiTelefono) {
        this.numeroDiTelefono = _numeroDiTelefono;
        this.creditoDisponible = 0.0;
        this.ultimeCinqueChiamate = new ArrayList<>();
    }
    // Method

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

//    public void setLastFiveCalls(ArrayList<Call> newCall) {
//        this.lastFiveCalls.addAll(newCall);
//    }

    public void simData() {
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito disponibile: " + creditoDisponible + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");

        for (Call call : ultimeCinqueChiamate) {
            System.out.println("Numero chiamato: " + call.getNumeroChiamato() + " " + "Durata: " + call.getDurataMinuti() + "minuti");
        }
    }

}
