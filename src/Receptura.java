public class Receptura extends Przedmiot{
    private String nazwaReceptury;

    public Receptura(String nazwa, int ilosc, String nazwaReceptury) {
        super(nazwa, ilosc);
        this.nazwaReceptury = nazwaReceptury;
    }

    public String getNazwaReceptury() {
        return nazwaReceptury;
    }

    public String toString(){
        return super.toString() + ". Receptura: " + nazwaReceptury;
    }
}
