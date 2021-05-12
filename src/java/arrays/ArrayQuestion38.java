package arrays;

class ArrayQuestion38 {

    // A < B > C < D > E...
    public static void arrangeArray(int[] input) {
        if (input.length == 0) return;
        boolean isSmaller = true;
        int temp = input[0];
        for (int i = 0; i < input.length - 1; i++) {
            if (isSmaller) {
                if (input[i] > input[i+1]) {
                    temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
                isSmaller = false;
            } else {
                if (input[i] < input[i+1]) {
                    temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
                isSmaller = true;
            }
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("Data : " + input[i]);
        }
    }
}