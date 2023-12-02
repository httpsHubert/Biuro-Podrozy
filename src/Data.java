/**
 * Klasa reprezentująca datę w formacie dzień/miesiąc/rok.
 */
public class Data {
    final private byte dzien;
    final private short rok;
    private byte miesiac;

    /**
     * Konstruktor tworzący obiekt klasy Data na podstawie podanych danych.
     *
     * @param dzien   Wartość dnia.
     * @param miesiac Wartość miesiąca.
     * @param rok     Wartość roku.
     */
    public Data(byte dzien, byte miesiac, short rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    /**
     * Metoda statyczna obliczająca różnicę w dniach między dwiema datami.
     *
     * @param data  Pierwsza data.
     * @param data2 Druga data.
     * @return Różnica w dniach między datami.
     */
    public static int obliczRozniceDni(Data data, Data data2) {
        int dniWRoku1 = liczDni(data);
        int dniWRoku2 = liczDni(data2);

        return Math.abs(dniWRoku1 - dniWRoku2);
    }

    private static int liczDni(Data data) {
        int dniWRoku = data.rok * 365;
        for (int i = 1; i < data.rok; i++) {
            if (czyPrzestepny(i)) {
                dniWRoku += 1;
            }
        }
        int[] dniWMiesiacu = {0, 31, czyPrzestepny(data.rok) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (data.dzien <= 31) {
            dniWRoku += data.dzien;
            for (int i = 1; i < data.miesiac; i++) {
                dniWRoku += dniWMiesiacu[i];
            }
        }
        return dniWRoku;
    }

    /**
     * Metoda statyczna sprawdzająca czy dany rok jest przestępny.
     *
     * @param year Rok do sprawdzenia.
     * @return Prawda, jeśli rok jest przestępny, w przeciwnym razie fałsz.
     */
    public static boolean czyPrzestepny(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Przesłonięta metoda toString zwracająca datę w formacie dd/MM/yyyy.
     *
     * @return Data w formacie tekstowym 2 zanki na dzień i miesiąc, 4 na rok.
     */
    public String toString() {
        return String.format("%02d/%02d/%04d", dzien, miesiac, rok);
    }
}
