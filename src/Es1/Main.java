package Es1;

import entities.Rettangolo;

public class Main {
    public static void main(String[] args){
        Rettangolo rettangoloUno = new Rettangolo(5, 10);
        Rettangolo rettangoloDue = new Rettangolo(10, 25);
        rettangoloUno.setAltezza(2);

        rettangoloUno.stampaRettangolo();
        stampaDueRettangoli(rettangoloUno, rettangoloDue);
    }
    public static void stampaDueRettangoli (Rettangolo rettangoloUno, Rettangolo rettangoloDue){
        rettangoloUno.stampaRettangolo();
        rettangoloDue.stampaRettangolo();
    }
}