import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ekwipunek mojEkwipunek = new Ekwipunek(new ArrayList<Przedmiot>());
        mojEkwipunek.dodajPrzedmiot(new Przedmiot("Miecz", 2));
        mojEkwipunek.dodajPrzedmiot(new Przedmiot("Apteczka", 4));
        mojEkwipunek.dodajPrzedmiot(new Przedmiot("Ksiega", 1));
        mojEkwipunek.dodajPrzedmiot(new Receptura("Przepis",1, "Napoj leczniczy"));
        mojEkwipunek.dodajPrzedmiot(new Przedmiot("Kompas", 1));

        mojEkwipunek.wyswietlEkwipunek();

    }
}