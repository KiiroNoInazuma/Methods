import java.util.Arrays;

public class Sort {
    int[] sortArray(int[] array) {
        boolean track = false;
        int result;
        while (!track) {
            track = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    result = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = result;
                    track = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] mass = {3, 46534, 6463, 5, 745, 53, 22, 89, 3, 53};
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.sortArray(mass)));

    }
}
