package arrays;

class MergeSort {

    public static void mergeSort(int[] input, int[] temp, int start, int mid, int end) {
        if (end > start) {
            mid = (start + end)/2;
            mergeSort(input, temp, start, mid, mid);
            mergeSort(input, temp, mid+1, mid, end);
            merge(input, temp, start, mid, end);
        }
    }

    public static void merge(int[] input, int temp[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int size = end - start + 1;
        while (i <= mid && j <= end) {
            if (input[i] > input[j]) {
                temp[k] = input[j];
                j++;
                k++;
            } else if (input[i] < input[j]) {
                temp[k] = input[i];
                i++;
                k++;
            } else if (input[i] == input[j]) {
                temp[k] = input[i];
                i++;
                j++;
                k++;
            }
        }
        while (j == end && i <= mid) {
            temp[k] = input[i];
            i++;
            k++;
        }
        while (i == mid && j <= end) {
            temp[k] = input[j];
            j++;
            k++;
        }
        for (int temp = 0; temp < size; temp++) {
            input[i] = temp[i];
        }
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("Data : " + input[i]);
        }
    }
}