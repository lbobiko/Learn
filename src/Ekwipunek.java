import java.util.ArrayList;

public class Ekwipunek {

    private ArrayList<Przedmiot> ekwipunekLista;

    public Ekwipunek(ArrayList<Przedmiot> ekwipunekLista) {
        this.ekwipunekLista = ekwipunekLista;
    }
    public void dodajPrzedmiot(Przedmiot p){
        ekwipunekLista.add(p);
    }

    public void wyswietlEkwipunek() {
        for (Przedmiot p : ekwipunekLista){
            System.out.println(p);
        }
        System.out.println("Ilosc: " + iloscEkw());
    }

    public int iloscEkw(){
        int ilosc = 0;
        for (Przedmiot p : ekwipunekLista){
            ilosc++;
        }
        return ilosc;
    }

    public ArrayList<Przedmiot> getEkwipunekLista() {
        return ekwipunekLista;
    }

    public void setEkwipunekLista(ArrayList<Przedmiot> ekwipunekLista) {
        this.ekwipunekLista = ekwipunekLista;
    }
}
