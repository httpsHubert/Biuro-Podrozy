import java.util.List;

/**
 * Klasa reprezentująca informacje o wykupionej wycieczce przez klienta.
 */
public class WykupionaWycieczka {
    // pola klasy

    /**
     * Konstruktor inicjujący obiekt WykupionaWycieczka.
     *
     * @param klient                      Zmienna typu Klient.
     * @param wycieczka                   Zmienna typu Wycieczka.
     * @param dataWyjazdu                 Data wyjazdu.
     * @param dataPowrotu                 Data powrotu.
     * @param czasWyjazdu                 Czas wyjazdu.
     * @param czasPowrotu                 Czas powrotu.
     * @param dataZakupu                  Data zakupu.
     * @param wypelnienieSrodkaTransportu Wypełnienie środka transportu.
     */
    private Data dataWyjazdu;
    private Data dataPowrotu;
    private Czas czasWyjazdu;
    private Czas czasPowrotu;
    private final Wycieczka wycieczka;
    private final Klient klient;
    private byte wypelnienieSrodkaTransportu;
    private final Data dataZakupu;
    private float cena;
    private List<WykupionaWycieczka> wykupioneWycieczki;

    public WykupionaWycieczka(Klient klient,Wycieczka wycieczka, Data dataWyjazdu,Data dataPowrotu,Czas czasWyjazdu,Czas czasPowrotu, Data dataZakupu,int wypelnienieSrodkaTransportu, List<WykupionaWycieczka> wykupioneWycieczki)
    {
        this.dataZakupu = dataZakupu;
        this.klient = klient;
        this.wycieczka = wycieczka;
        this.wypelnienieSrodkaTransportu = (byte) wypelnienieSrodkaTransportu;
        this.czasWyjazdu = czasWyjazdu;
        this.czasPowrotu = czasPowrotu;
        this.dataWyjazdu = dataWyjazdu;
        this.dataPowrotu = dataPowrotu;
        this.wykupioneWycieczki = wykupioneWycieczki;
        obliczRabat(wykupioneWycieczki);
    }

    // metody

    /**
     * Oblicza ewentualny rabat na cenę wycieczki w zależności od różnicy dni.
     */

    public void obliczRabat(List<WykupionaWycieczka> wycieczkiKlienta) {
        int roznicaDni = Data.obliczRozniceDni(wycieczka.getDataPowrotu(), wycieczka.getDataWyjazdu());
        float rabatPierwszy = 0.9f;
        float rabatDrugi = 0.85f;
        if (roznicaDni <= 30 && wycieczkiKlienta.size() == 2) {
            cena = (float) (wycieczka.getCena() * rabatPierwszy);
        } else if (roznicaDni <=30 && wycieczkiKlienta.size() > 2) {
            cena = (float) (wycieczka.getCena() * rabatDrugi);
        } else {
            cena = (float) wycieczka.getCena();
        }
    }

    /**
     * Zwraca datę wyjazdu.
     *
     * @return Data wyjazdu.
     */

    public Data getDataWyjazdu() {
        return dataWyjazdu;
    }

    /**
     * Zwraca cenę wycieczki.
     *
     * @return Cena wycieczki.
     */

    public float getCena() {
        return cena;
    }

    /**
     * Zwraca obiekt reprezentujący wycieczkę.
     *
     * @return Obiekt wycieczki.
     */

    public Wycieczka getWycieczka() {
        return wycieczka;
    }

}
