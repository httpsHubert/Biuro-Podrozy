/**
 * Klasa zawierająca metodę główną programu.
 */
public class Main {
    /**
     * Metoda główna programu, która inicjuje tworzenie danych wycieczek i klientów, tworzy raporty na ich podstawie i je wyświetla.
     *
     * @param args Argumenty przekazywane podczas uruchamiania programu.
     */
    public static void main(String[] args) {

        // Inicjalizacja tablic wycieczek i klientów

        Wycieczka[] wycieczki = new Wycieczka[0];
        Klient[] klienci = new Klient[0];

        // Dodawanie wycieczek do tablicy wycieczek za pomocą metody rozszerzącej tablicę

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 17, (byte) 11, (short) 2023),
                new Data((byte) 30, (byte) 11, (short) 2023),
                new Czas((byte) 12, (byte) 00, (byte) 00),
                new Czas((byte) 17, (byte) 00, (byte) 00),
                "Oslo, Norwegia",
                5000,
                40,
                "Zwiedzanie bogactw naturalnych takich jak lodowce oraz kulturowych"
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 1, (byte) 7, (short) 2023),
                new Data((byte) 20, (byte) 7, (short) 2023),
                new Czas((byte) 15, (byte) 00, (byte) 00),
                new Czas((byte) 21, (byte) 00, (byte) 00),
                "Paryz, Francja",
                13000,
                10,
                "Zwiedzanie Wieży Eiffla, Luwru i romantyczne spacery po nadmorskich bulwarach Sekwany."
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 1, (byte) 6, (short) 2023),
                new Data((byte) 15, (byte) 6, (short) 2022),
                new Czas((byte) 11, (byte) 00, (byte) 00),
                new Czas((byte) 19, (byte) 00, (byte) 00),
                "Teneryfa, Hiszpania",
                10000,
                8,
                "Słoneczne plaże, wulkaniczne krajobrazy i relaks w luksusowym kurorcie."
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 10, (byte) 5, (short) 2022),
                new Data((byte) 20, (byte) 5, (short) 2022),
                new Czas((byte) 9, (byte) 00, (byte) 00),
                new Czas((byte) 15, (byte) 00, (byte) 00),
                "Safari w Kenii",
                12000,
                12,
                "Spotkanie z dzikimi zwierzętami w Parku Narodowym Maasai Mara, nocleg w luksusowych namiotach."
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 4, (byte) 9, (short) 2023),
                new Data((byte) 16, (byte) 9, (short) 2023),
                new Czas((byte) 6, (byte) 00, (byte) 00),
                new Czas((byte) 21, (byte) 00, (byte) 00),
                "Wycieczka po Włoskich Dolomitach",
                11000,
                6,
                "Górskie trekkingi, malownicze widoki i noclegi w tradycyjnych alpejskich chatkach."
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 1, (byte) 7, (short) 2023),
                new Data((byte) 2, (byte) 8, (short) 2023),
                new Czas((byte) 13, (byte) 00, (byte) 00),
                new Czas((byte) 22, (byte) 00, (byte) 00),
                "Wycieczka Szlakiem Wina w Kalifornii(i nie tylko)",
                38000,
                10,
                "Degustacje w winnicach Doliny Napa, malownicze krajobrazy i wizyta w słynnych winiarskich posiadłościach, wraz z zwiedzaniem kalifornii oraz innych stanów."
        ), Wycieczka.class);

        wycieczki = Wycieczka.rozszerzTablice(wycieczki, new Wycieczka(
                new Data((byte) 20, (byte) 7, (short) 2023),
                new Data((byte) 1, (byte) 8, (short) 2023),
                new Czas((byte) 11, (byte) 00, (byte) 00),
                new Czas((byte) 22, (byte) 00, (byte) 00),
                "Wakacje na Wyspach Greckich",
                9000,
                14,
                "Słoneczne plaże, klasyczna architektura, i degustacja tradycyjnej kuchni greckiej."
        ), Wycieczka.class);

        // Dodawanie klientów do tablicy klientów za pomocą metody rozszerzącej tablicę

        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Hubert", "Lech", "Słoneczna 23", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Maciej", "Zielonka", "Kwiatowa 15", (byte) 40), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Angelika", "Smith", "Jagiellonska 13", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Jan", "Nowak", "Mickiewicza 5", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Konstanty", "Jagiellonski", "Konstantynow 56", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Genowefa", "Bąbek", "Swiateczna 43", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Hieronim", "Augustowski", "Ksiezycowa 21", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Wojtył", "Karolak", "Wadowicka 37", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Pomścibor", "Bozek", "3 Maja 7", (byte) 25), Klient.class);
        klienci = Wycieczka.rozszerzTablice(klienci, new Klient("Kamil", "Krawczyk", "Słoneczna 77", (byte) 25), Klient.class);


        // Tworzenie kopii tablicy wycieczek dla lepszej czytelności

        Wycieczka[] tablicaWycieczek = new Wycieczka[wycieczki.length];

        System.arraycopy(wycieczki, 0, tablicaWycieczek, 0, wycieczki.length);

        // Tworzenie instancji klasy Raporty i generowanie raportu z wszystkich wycieczek

        Raporty raporty = new Raporty(tablicaWycieczek, klienci);
        raporty.dodawanieWycieczekDoKlienta();
        raporty.wyswietlRaport();
    }
}
