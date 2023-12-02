import java.lang.reflect.Array;

/**
 * Klasa reprezentująca informacje o wycieczce.
 */
public class Wycieczka {

    // pola klasy

    /**
     * Konstruktor inicjujący obiekt Wycieczka.
     *
     * @param dataWyjazdu    Data wyjazdu.
     * @param dataPowrotu    Data powrotu.
     * @param czasWyjazdu    Czas wyjazdu.
     * @param czasPowrotu    Czas powrotu.
     * @param cel            Cel wycieczki.
     * @param cena           Cena wycieczki.
     * @param liczbaMiejsc   Liczba dostępnych miejsc.
     * @param opis           Opis wycieczki.
     */

    private final Data dataWyjazdu;
    private final Data dataPowrotu;
    private final Czas czasWyjazdu;
    private final Czas czasPowrotu;
    private final String cel;
    private final String opis;
    private final int liczbaMiejsc;
    private final double cena;

    public Wycieczka(Data dataWyjazdu, Data dataPowrotu, Czas czasWyjazdu, Czas czasPowrotu, String cel, double cena, int liczbaMiejsc, String opis) {
        this.dataWyjazdu = dataWyjazdu;
        this.dataPowrotu = dataPowrotu;
        this.czasWyjazdu = czasWyjazdu;
        this.czasPowrotu = czasPowrotu;
        this.cel = cel;
        this.cena = cena;
        this.liczbaMiejsc = liczbaMiejsc;
        this.opis = opis;
    }

    // metody dostępowe

    public Czas getCzasPowrotu() {
        return czasPowrotu;
    }

    public Czas getCzasWyjazdu() {
        return czasWyjazdu;
    }

    public Data getDataPowrotu() {
        return dataPowrotu;
    }

    public Data getDataWyjazdu() {
        return dataWyjazdu;
    }

    public double getCena() {
        return cena;
    }

    public String getCel() {
        return cel;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public String getOpis() {
        return opis;
    }

    /**
     * Rozszerza tablicę o nowy element.
     *
     * @param poprzedniaTablica Tablica do której dodajemy element.
     * @param nowyElement       Nowy element do dodania.
     * @param typ               Typ elementów w tablicy.
     * @param <T>               Typ danych.
     * @return Rozszerzona tablica z nowym elementem.
     */

    public static <T> T[] rozszerzTablice(T[] poprzedniaTablica, T nowyElement, Class<T> typ) {
        int rozszerzenie = poprzedniaTablica.length + 1;
        T[] nowaTablica = (T[]) Array.newInstance(typ, rozszerzenie);
        System.arraycopy(poprzedniaTablica, 0, nowaTablica, 0, poprzedniaTablica.length);
        nowaTablica[rozszerzenie - 1] = nowyElement;
        return nowaTablica;
    }
}
