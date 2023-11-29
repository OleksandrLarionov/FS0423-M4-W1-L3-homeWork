package Es3.entities3;

import java.util.ArrayList;

public class Cart {
    private Client clienteAssociato;
    public ArrayList<Article> articoli;
    private double totalCart;


    public Cart(Client _clienteAssociato) {
        this.clienteAssociato = _clienteAssociato;
        this.articoli = new ArrayList<>();
        this.totalCart = totalCart;

    }

    public void aggiungiArticolo(Article articolo, int quantita) {
        if (articolo.getNumeroPezziDisponibili() >= quantita) {
            articoli.add(articolo);
            totalCart += articolo.getPrezzo() * quantita;
            articolo.setNumeroPezziDisponibili(articolo.getNumeroPezziDisponibili() - quantita);
        } else {
            System.out.println("Quantità richiesta non disponibile per questo articolo: " + articolo.getDescrizioneArticolo());
        }
    }

    @Override
    public String toString() {
        return "Cart ----->{" +
                "Nome del Cliente=" + clienteAssociato.getNome() + " " + clienteAssociato.getCognome() +
                ", Articolo=" + articoli +
                ", Totale del carrello=" + totalCart + "euro" +
                '}';
    }
}