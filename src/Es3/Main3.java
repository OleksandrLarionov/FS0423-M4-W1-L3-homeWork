package Es3;

import Es3.entities3.Article;
import Es3.entities3.Cart;
import Es3.entities3.Client;

public class Main3 {
    public static void main(String[] args) {
        //Si aggiungono gli articoli da parte dello store
        Article gambaDiLegno = new Article("_1234", "opera d'arte che replica in maniera vagamente astratta una gamba umana, realizzata in legno", 999999999, 1);
        Article unaRotula = new Article("0001", "una bellissima rotula a forma di posacenere presa da un vecchietto", 99, 2);
        Article laSensitiva = new Article("01", "una moglie che si crede sensitiva!", 20000, 1);

        //Un utente si registra
        Client clientOne = new Client(1234, "Ajeje", "Brazorf", "ajeje.brazorf@controllore.mi", "03/11/2022");

        // Aggiungo un arrello per un cliente specifico
        Cart cartClientOne = new Cart(clientOne);

        //Il cliente aggiunge un articolo nel suo carrello
        cartClientOne.aggiungiArticolo(gambaDiLegno, 1);
        cartClientOne.aggiungiArticolo(unaRotula, 1);



        System.out.println(cartClientOne);

    }

}
