package arrays;

class BubbleSort {

    // passed as a reference, so should be in place swap
    public static void bubbleSort(int[] input) {
        if (input.length == 0) return;
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = i+1; j < input(); j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println("data : " + input[i]);
        }
    }
}