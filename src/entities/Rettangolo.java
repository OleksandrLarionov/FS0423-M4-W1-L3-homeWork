package entities;

public class Rettangolo {
    //    Argomenti
    private int altezza;
    private int larghezza;

    //Costructor
    public Rettangolo(int _altezza, int _larghezza) {
        this.altezza = _altezza;
        this.larghezza = _larghezza;
    }

    //    Method
    public int area() {
        return altezza * larghezza;
    }
    public int perimetro () {
        return (altezza + larghezza) * 2;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void stampaRettangolo () {
        System.out.println("Il perimetro del rettangolo è: " + perimetro() + " , " + "Area del rettangolo è: " + area());
    }


}
