import java.util.Arrays;

public class Array {
    int[] array;

    public Array(int size) {
        array = new int[size];
    }

    public Array(int[] array) {
        this.array = array.clone();
    }


    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            output.append(i).append(": ").append(array[i]).append("\n");
        }
        return output.toString();
    }


    public void add(int value) {
        expandArray();
        array[array.length - 1] = value;
    }

    public void sortAscending() {
        Arrays.sort(array);
    }

    private void sortDescending() {
        sortAscending();
        for (int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    public void sort(int d) {
        if (d == 0) {
            sortDescending();
        } else {
            sortAscending();
        }
    }

    public int occurrences(int n) {
        int occurrences = 0;
        for (int j : array) {
            if (j == n) {
                occurrences++;
            }
        }
        return occurrences;
    }


    public void popNumber(int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                popIndex(i);
            }
        }
    }

    public void popIndex(int n) {
        int[] arrayCopy = new int[array.length - 1];
        int popped = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != n) {
                arrayCopy[i - popped] = array[i];
            } else {
                popped = 1;
            }
        }
        array = arrayCopy;

    }


    public int[] getArrayCopy() {
        return array.clone();
    }

    public int[] getArrayRange(int x, int y) {
        int[] arrayCopy = new int[y - x + 1];
        for (int i = x; i <= y; i++) {
            arrayCopy[i - x] = array[x];
        }
        return arrayCopy;
    }


    /* TODO
     * metodo che restituisce un array con tutti gli elementi distinti dell’array
     * Cosa diavolo vuole dire? Mica l'ho capito io. Pensavo fosse uguale a getArrayCopy()
     *
     * */


    private void expandArray() {
        array = Arrays.copyOf(array, array.length + 1);
    }

}
