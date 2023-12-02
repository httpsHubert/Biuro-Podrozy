/**
 * Klasa reprezentująca Klienta.
 */
public class Klient {
    String imie, nazwisko, adres;
    byte wiek;

    /**
     * Konstruktor tworzący obiekt klasy Klient z podanymi parametrami.
     *
     * @param imie     Imię klienta.
     * @param nazwisko Nazwisko klienta.
     * @param adres    Adres klienta.
     * @param wiek     Wiek klienta.
     */
    public Klient(String imie, String nazwisko, String adres, byte wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
    }
}
