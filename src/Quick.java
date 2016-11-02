/**
 * Created by Ekeocha on 9/26/2016.
 */
public class Quick {
    public static void sort(int[] input){
        if(input.length < 2) return;
        sort(input, 0, input.length - 1);
    }

    private static void sort(int[] input, int start, int end){
        if(start < end) {
            int pivotIndex = partition(input, start, end);
            sort(input, start, pivotIndex - 1);
            sort(input, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] input, int start, int end){

        int partitionIndex = start;
        for(int i = start; i < end; i++){
            if(input[i] <= input[end]){
                swap(input, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(input, partitionIndex, end);
        return partitionIndex;
    }

    private static void swap(int[] input, int indexA, int indexB){
        int tmp = input[indexA];
        input[indexA] = input[indexB];
        input[indexB] = tmp;
    }

    public static void main(String[] args) {
        int[] input = {7,2,1,6,8,5,3,4};
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
