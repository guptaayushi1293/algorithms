package arrays;

class SelectionSort {

    public static void selectionSort(int[] input) {
        if (input.length == 0) return;
        int min = 0;
        for (int i = 0; i < input.length - 1; i++) {
            min = i;
            for (int j = i+1; j < input.length; j++) {
                if (input[min] > input[j]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("data : " + input[i]);
        }
    }
}