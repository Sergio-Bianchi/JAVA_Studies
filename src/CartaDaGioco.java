import java.awt.*;
import java.lang.String;

public class CartaDaGioco {

    char valore;
    char seme;
    char colore;


    public CartaDaGioco(char valore, char seme, char colore) {
        this.valore = valore;
        this.seme = seme;
        this.colore = colore;
    }

    public CartaDaGioco(char[] carta) {
        valore = carta[0];
        seme = carta[1];
        colore = carta[2];
    }

    public CartaDaGioco(String carta) {
        valore = carta.charAt(0);
        seme = carta.charAt(1);
        colore = carta.charAt(2);
    }


    public String toString() {
        return String.format("%c%c%c", valore, seme, colore);
    }

    public char getValore() {
        return valore;
    }
    public char getSeme() {
        return seme;
    }

    public char getColore() {
        return colore;
    }


    /*
    * Return: 0 se uguale, -1 se minore di carta, 1 se maggiore di carta
    * */
    public int confronta(CartaDaGioco carta) {

        if (carta.valore == valore) return 0;
        if (carta.valore < valore) return 1;
        return -1;


    }

}
