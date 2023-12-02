import java.util.*;

/**
 * Klasa Raporty generuje raporty związane z zakupionymi wycieczkami przez klientów.
 */
public class Raporty {
    private final Map<Klient, List<WykupionaWycieczka>> mapaWycieczki = new HashMap<>();
    private Wycieczka[] tablicaWycieczek;
    private final Klient[] klienci;

    /**
     * Konstruktor inicjujący obiekt Raporty.
     *
     * @param tablicaWycieczek Tablica wycieczek.
     * @param klienci          Tablica klientów.
     */
    public Raporty(Wycieczka[] tablicaWycieczek, Klient[] klienci) {
        this.tablicaWycieczek = tablicaWycieczek;
        this.klienci = klienci;
    }

    /**
     * Dodaje losowo wybrane wycieczki do klientów.
     */

    public void dodawanieWycieczekDoKlienta() {
        Random rand = new Random();
        WykupionaWycieczka[] tablicaWycieczek = new WykupionaWycieczka[0];

        for (int i = 0; i <= 20; i++) {
            Klient klient = losowyKlient();
            Wycieczka wycieczka = losowaWycieczka();
            WykupionaWycieczka wykupionaWycieczka = new WykupionaWycieczka(
                    klient,
                    wycieczka,
                    wycieczka.getDataWyjazdu(),
                    wycieczka.getDataPowrotu(),
                    wycieczka.getCzasWyjazdu(),
                    wycieczka.getCzasPowrotu(),
                    new Data((byte) rand.nextInt(31), (byte) rand.nextInt(12), (short) rand.nextInt(2020, 2024)),
                    rand.nextInt(160),
                    List.of(tablicaWycieczek)
            );

            tablicaWycieczek = Wycieczka.rozszerzTablice(tablicaWycieczek, wykupionaWycieczka, WykupionaWycieczka.class);

            mapaWycieczki.putIfAbsent(klient, new ArrayList<>());
            mapaWycieczki.get(klient).add(wykupionaWycieczka);
        }
    }

    /**
     * Metoda zwracająca zrandomizowaną tablicę klienci
     * */

    private Klient losowyKlient() {
        Random rand = new Random();
        return klienci[rand.nextInt(klienci.length)];
    }

    /**
     * Metoda zwracająca zrandomizowaną tablicę tablicaWycieczek
     * */

    private Wycieczka losowaWycieczka() {
        Random random = new Random();
        return tablicaWycieczek[random.nextInt(tablicaWycieczek.length)];
    }



    public void wyswietlRaport() {
        wyswietlRaportyInfo();
        wyswietlSumaZakupionychWycieczek();
        wyswietlInformacjeOWycieczkach();
        wyswietlRaportWedlugKlientow();
        wyswietlKlientZNajwiekszaZaplaconaKwota();
    }
    /**
     * Generuje podstawowe informacje raportowe.
     *
     * @return String z informacjami o raportach.
     */
    public String wyswietlRaportyInfo() {
        return "------RAPORTY------";
    }

    /**
     * Wyświetla informacje o kliencie z największą zapłaconą kwotą.
     */

    public void wyswietlKlientZNajwiekszaZaplaconaKwota() {
        Klient klientZNajwiekszaKwota = null;
        float najwiekszaKwota = 0;

        for (Klient klient : klienci) {
            float sumaZakupowKlienta = 0;
            if (mapaWycieczki.containsKey(klient)) {
                List<WykupionaWycieczka> wycieczki = mapaWycieczki.get(klient);

                for (WykupionaWycieczka wykupionaWycieczka : wycieczki) {
                    sumaZakupowKlienta += wykupionaWycieczka.getCena();
                }

                if (sumaZakupowKlienta > najwiekszaKwota) {
                    najwiekszaKwota = sumaZakupowKlienta;
                    klientZNajwiekszaKwota = klient;
                }
            }
        }

        if (klientZNajwiekszaKwota != null) {
            System.out.println("\nKlient z największą zapłaconą kwotą: " + klientZNajwiekszaKwota.imie + " " + klientZNajwiekszaKwota.nazwisko);
            System.out.println("Zapłacona kwota: " + najwiekszaKwota + " PLN");
        }
    }

    /**
     * Wyświetla sumę zakupionych wycieczek.
     */

    private void wyswietlSumaZakupionychWycieczek() {
        float sumaZakupionychWycieczek = 0;
        for (Wycieczka wycieczka : tablicaWycieczek) {
            sumaZakupionychWycieczek += (float) wycieczka.getCena();
        }
        System.out.println("\n------Suma zakupionych wycieczek------\n" + sumaZakupionychWycieczek);
    }

    /**
     * Wyświetla szczegółowe informacje o poszczególnych wycieczkach.
     */

    private void wyswietlInformacjeOWycieczkach() {
        System.out.println("\n------Informacje o poszczególnych wycieczkach------");
        for (Wycieczka wycieczka : tablicaWycieczek) {
            System.out.println("---" + wycieczka.getCel() + "\nOd kiedy do kiedy: " +
                    wycieczka.getDataWyjazdu() + " - " + wycieczka.getDataPowrotu() +
                    "\n Czas wylotu/przylotu: " + wycieczka.getCzasWyjazdu() + " - " +
                    wycieczka.getCzasPowrotu() + "\n Liczba miejsc: " +
                    wycieczka.getLiczbaMiejsc() + "\n Opis: " + wycieczka.getOpis() +
                    " - Cena: " + wycieczka.getCena() + " PLN\n");
        }
    }

    /**
     * Generuje raport według klientów i ich zakupionych wycieczek.
     */

    private void wyswietlRaportWedlugKlientow() {
        System.out.println("\n------Raport według klientów------");
        for (Map.Entry<Klient, List<WykupionaWycieczka>> entry : mapaWycieczki.entrySet()) {
            Klient klient = entry.getKey();
            List<WykupionaWycieczka> wycieczki = entry.getValue();
            float sumaZakupowKlienta = 0;

            System.out.println("\n---Klient: " + klient.imie + " " + klient.nazwisko);
            System.out.println("------Wycieczki------");

            for (WykupionaWycieczka wykupionaWycieczka : wycieczki) {
                sumaZakupowKlienta += wykupionaWycieczka.getCena();
                System.out.println("- " + wykupionaWycieczka.getDataWyjazdu() + " - " +
                        wykupionaWycieczka.getWycieczka().getCel() +
                        " - Cena: " + wykupionaWycieczka.getCena() + " PLN");
            }

            System.out.println("Suma zakupów: " + sumaZakupowKlienta + " PLN");
        }
    }
}
