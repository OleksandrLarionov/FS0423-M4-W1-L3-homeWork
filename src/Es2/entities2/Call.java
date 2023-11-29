package Es2.entities2;

public class Call {
    private int durataMinuti;
    private String numeroChiamato;

    // Costruttore
    public Call(String _numeroChiamato, int _durataMinuti) {
        this.numeroChiamato = _numeroChiamato;
        this.durataMinuti = _durataMinuti;
    }

    // Method
    public int getDurataMinuti() {
        return durataMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

}
