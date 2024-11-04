import java.nio.file.ClosedWatchServiceException;

public class Array {
    int[] array;

    /*
     * Constructor with the size of the array
     * @param int[] size >= 0
     * */
    public Array(int size) {
        array = new int[size];
    }

    /*
     * Constructor with array values
     * @param int[] array
     * */
    public Array(int[] array) {
        this.array = array.clone();
    }

    /*
     * To string method for array
     * Format output: <index>: <value> \n
     * */
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            output.append(i).append(": ").append(array[i]).append("\n");
        }
        return output.toString();
    }


    /*
     * Add value to array
     * @param int value
     * */
    public void add(int value) {
        expandArray();
        array[array.length - 1] = value;
    }


    /*
     * Returns array length (instead of calling getArrayCopy().length)
     * */
    public int length() {
        return array.length;
    }


    /*
     * Counts how many times n occurs in the array
     * @param int n
     * */
    public int occurrences(int n) {
        int occurrences = 0;
        for (int j : array) {
            if (j == n) {
                occurrences++;
            }
        }
        return occurrences;
    }


    /*
     * Remove all N numbers in the array
     * */
    public void popNumber(int n) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                popIndex(i);
            }
        }
    }


    /*
     * Remove element at specified index. If index is out of bounds, returns error
     *
     * @param int index  0<=index<array.length
     * */
    public void popIndex(int index) {
        if (index < 0 || index > array.length) {
            System.out.println("Index out of bounds");
            return;
        }
        int[] arrayCopy = new int[array.length - 1];
        int popped = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                arrayCopy[i - popped] = array[i];
            } else {
                popped = 1;
            }
        }
        array = arrayCopy;

    }


    /*
     * @return a copy of the array
     * */
    public int[] getArrayCopy() {
        return array.clone();
    }


    /*
     * @param x LOW of the array; x >= 0 && x <= y
     * @param y HIGH of the array; y < array.length && y >= x
     * @return Returns a copy of the array in a specified range. If range is not correct, prints an error and returns an empty array
     * */
    public int[] getArrayRange(int x, int y) {
        if (y < x || x < 0 || y >= array.length) {
            System.out.println("Range out of bounds");
            return new int[0];
        }

        int[] arrayCopy = new int[y - x + 1];
        for (int i = x; i <= y; i++) {
            arrayCopy[i - x] = array[x];
        }
        return arrayCopy;
    }


    /* TODO
     * metodo che restituisce un array con tutti gli elementi distinti dell’array -> array senza duplicati
     *
     *
     * */


    /* ==== SORTING ==== */

    /*
     * Sorts a partition of a larger quickSort
     * */
    private int partition(int low, int high, boolean reverse) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (reverse) {
                if (array[j] > pivot) {
                    i++;
                    swap(i, j);
                }
            } else {
                if (array[j] < pivot) {
                    i++;
                    swap(i, j);
                }
            }

        }
        swap(i + 1, high);
        return i + 1;
    }

    private int partition(int low, int high) {
        return partition(low, high, false);
    }


    /*
     * @param low       Start point of the sorting. Generally 0
     * @param high      End point of the sorting. Generally array.length -1
     * */
    private void quickSort(int low, int high, boolean reverse) {

        if (low < high) {
            int pi = partition(low, high, reverse);

            quickSort(low, pi - 1, reverse);
            quickSort(pi + 1, high, reverse);
        }
    }
    public void quickSort(int low, int high) {
        quickSort(low, high, false);
    }



        /*
     * Sorts all the numbers in the array in ascending order
     * */
    public void quickSort() {
        quickSort(0, array.length - 1, false);
    }
    public void quickSort(boolean reverse) {
        quickSort(0, array.length - 1, reverse);
    }





    /* === PRIVATE UTILS ===*/

    private void expandArray() {
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        array = arrayCopy;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
