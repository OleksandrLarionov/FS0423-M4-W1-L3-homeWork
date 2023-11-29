package Es3.entities3;

import java.util.ArrayList;

public class Cart {
    private String clienteAssociato;
    private ArrayList<Article> articoli;
    private double totalCart;


    public Cart(String _clienteAssociato) {
        this.clienteAssociato = _clienteAssociato;
        this.articoli = new ArrayList<>();
        this.totalCart = totalCart;

    }
}