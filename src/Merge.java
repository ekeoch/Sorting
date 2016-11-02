/**
 * Created by Ekeocha on 9/25/2016.
 * referenced https://www.youtube.com/watch?v=TzeBrDU-JaY
 */
public class Merge {

    public static void sort(int[] input) {
        if (input.length == 1) {
            return;
        }

        int[] left = new int[input.length / 2];
        int[] right = new int[input.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = input[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = input[i + left.length];
        }

        sort(left);
        sort(right);
        merge(left, right, input);

    }

    private static void merge(int[] left, int[] right, int[] input) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            input[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            input[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 1, 6, 8, 5, 3, 7};
        System.out.print("input: ");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(input);
        System.out.print("sorted out: ");
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

}
