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

    public void setNumeroPezziDisponibili(long numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    @Override
    public String toString() {
        return "Article{" +
                "CodiceProdotto='" + this.codiceArticolo + '\'' +
                ", Descrizione='" + this.descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo + " " +  "ancora disponibili per l'acquisto: " + " " + this.numeroPezziDisponibili +
                '}';
    }
}