package arrays;

class InsertionSort {

    public static void insertionSort(int[] input) {
        if (input.length == 0) return;
        int v = input[0];
        int j = 0;
        for (int i = 1; i < input.length; i++) {
            j = i;
            v = input[i];
            while (input[j-1] > input[j] && j > -1) {
                input[j] = input[j-1];
                j--;
            }
            input[i] = v;
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("data : " + input[i]);
        }
    }
}