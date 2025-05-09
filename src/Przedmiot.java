public class Przedmiot {
    private String nazwa;
    private int ilosc;

    public Przedmiot(String nazwa, int ilosc) {
        this.nazwa = nazwa;
        if (ilosc < 0 ) {
            this.ilosc = 0;
        } else{
            this.ilosc = ilosc;
        }
    }

    public String toString(){
        return nazwa + " " + ilosc + " sztuk";
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
