package arrays;

class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] input1, int m, int[] input2, int n) {
        if(input1.length == 0) return input2;
        if(input2.length == 0) return input1;
        int i = 0;
        int j = 0;
        while(i < m && j < n) {
            if (input1[i] > input2[j]) {
                rotateToRight(input1, i, length1);
                input1[i] = input2[j];
                j++;
                m++;
            }
            i++;
        }
        while (i < length1 && j < n);
        input1[i] = input2[j];
        i++;
        j++;
    }

    public static void rotateToRight(int[] input, int start, int end) {
        for(int i = end - 1; i > start; i--) {
            input[i] = input[i-1];
        }
    }
}