/**
 * Klasa reprezentująca czas w formacie godzina:minuta:sekunda.
 */
public class Czas {
    byte godzina, minuta, sekunda;

    /**
     * Konstruktor tworzący czas tylko z podaną godziną.
     *
     * @param godzina Wartość godziny.
     */
    public Czas(byte godzina) {
        this.godzina = godzina;
    }

    /**
     * Konstruktor tworzący czas z podaną godziną i minutą.
     *
     * @param godzina Wartość godziny.
     * @param minuta  Wartość minuty.
     */
    public Czas(byte godzina, byte minuta) {
        this.godzina = godzina;
        this.minuta = minuta;
    }

    /**
     * Konstruktor tworzący czas z podaną godziną, minutą i sekundą.
     *
     * @param godzina Wartość godziny.
     * @param minuta  Wartość minuty.
     * @param sekunda Wartość sekundy.
     */
    public Czas(byte godzina, byte minuta, byte sekunda) {
        this.godzina = godzina;
        this.minuta = minuta;
        this.sekunda = sekunda;
    }

    /**
     * Przesłonięta metoda toString zwracająca czas w formacie hh:mm:ss.
     *
     * @return Czas w formacie tekstowym z 2 zanakami.
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", godzina, minuta, sekunda);
    }
}