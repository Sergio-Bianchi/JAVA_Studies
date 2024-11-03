//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


/*
        Tassometro tass = new Tassometro(
                1000.0, 2000.0, 3000.0,
                50.0, 20.0, 90.0
                );

        System.out.println(tass.getTasse(10000.0));



        CartaDaGioco carta = new CartaDaGioco('4','F','B');
        CartaDaGioco cartaB = new CartaDaGioco('A','F','B');
        System.out.println(carta.confronta(cartaB));*/


        Array array = new Array(new int[]{6,2,3});
        array.add(6);
        System.out.println(array);

        array.sortDescending();
        System.out.println(array);

    }
}