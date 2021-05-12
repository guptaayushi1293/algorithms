package arrays;

class MinHeap {

    public static void createMinHeap() {
        int[] input = {12, 5, 787, 1, 23};
        int[] output = new int[5];
        for(int i = 0 ; i < 5; i++) {
            output[i] = input[i];
        }
        output = heapify(output, output.length);
        for(int i = 0; i < 5; i++) {
            System.out.println("value : " + output[i]);
        }
    }

    public int[] heapify(int[] output, int n) {
        for(int i = 2; i < n; i+=2) {
            int right = i;
            while(right > 0) {
                int parent = (right-1)/2;
                int left = parent * 2 + 1;
                int max = arr[left] > arr[right] ? left : right;
                int isSwap = output[parent] > output[max] ? 0 : 1;
                if(isSwap == 1) {
                    int temp = output[parent];
                    output[parent] = output[max];
                    output[max] = temp;
                }
                right = parent;
            }
        }
        return output;
    }
}