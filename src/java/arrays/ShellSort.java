package arrays;

class ShellSort {

    public static void shellSort(int[] input) {
        if (input.length == 0) return;
        int h = 0;
        while (h < input.length) {
            h = 3*h + 1;
        }
        int v = input[0];
        int j = 0;
        while (h > 0) {
            for (int i = h; i < input.length; i++) {
                v = input[i];
                j = i;
                while (j > 0 && input[j - h] > v) {
                    input[j] = input[j - h];
                    j = j - h;
                }
                input[j] = v;
            }
            h = h - 1;
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("Data : " + input[i]);
        }
    }
}