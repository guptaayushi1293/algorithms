package arrays;

class MaxSumContiguousArray {

    public static int getMaxSumContiguousArray() {
        int[] input = new int[]{-2, -3, 4, -1, -2, 1, 5, 3};
        int length = input.length;
        int maxSum = input[0];
        int localSum = 0;
        int next = 0;
        int start = 0;
        for(int i = 0; i < length; i++) {
            localSum += input[i];
            if(localSum < 0) {
                localSum = 0;
                start = i;
            } else if (maxSum < localSum) {
                maxSum = localSum;
                next = i;
            }
        }
        return next - start;
    }
}