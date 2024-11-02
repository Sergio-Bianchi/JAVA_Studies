


public class Orologio {

    int ore;
    int minuti;
    int secondi;


    public Orologio() {
        ore = 0;
        minuti = 0;
        secondi = 0;
    }


    /*
    * Crea un Orologio con dati ore e minuti
    * Se ore e minuti fossero superiori ai range [0-23 & 0-59], al successivo tick verrebbero resettati come fossero stati al MAX
    *
    * */
    public Orologio(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }


    public void tick() {
        secondi++;
        if (secondi >= 60) {
            secondi = 0;
            minuti++;
        }
        if (minuti >= 60) {
            minuti = 0;
            ore++;
        }
        if (ore >= 24) {
            ore = 0;
        }

    }

    public void ntick(int ticks) {
        for (int i = 0; i < ticks; i++) {
            this.tick();
        }
    }

    public void reset() {
        ore = 0;
        minuti = 0;
        secondi = 0;
    }


    public String toString() {

        return String.format("%02d", this.ore) + ":" + String.format("%02d", this.minuti) + ":" + String.format("%02d", this.secondi);
    }

}
