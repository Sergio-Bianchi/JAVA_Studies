public class Sorting {





    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low -1;
        for (int j = low; j <= high -1 ; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, j, i);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }


    public void quickSort(int[] array, int low, int high) {

        if(low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }


    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }
}
