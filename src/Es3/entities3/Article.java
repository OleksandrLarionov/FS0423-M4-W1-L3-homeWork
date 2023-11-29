package Es3.entities3;

public class Article {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private long numeroPezziDisponibili;


    //Costruttore
    public Article(String _codiceArticolo, String _descrizioneArticolo, double _prezzo, long _numeroPezziDisponibili) {
        this.codiceArticolo = _codiceArticolo;
        this.descrizioneArticolo = _descrizioneArticolo;
        this.prezzo = _prezzo;
        this.numeroPezziDisponibili = _numeroPezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public long getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }
}