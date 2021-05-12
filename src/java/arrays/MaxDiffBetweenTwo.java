package arrays;

class MaxDiffBetweenTwo {

    public static int maxDiffBetweenTwo() {
        int[] input = new int[]{7, 9, 3, 6, 2, 1};
        int diff = 0;
        int maxDiff = -1;
        int j = 0;
        for(int i = 1; i < input.length; i++) {
            int first = input[j];
            int second = input[i];
            if (second > first) {
                diff = second - first;
                if (maxDiff < diff) maxDiff = diff;
            } else {
                j = i;
            }
        }
        return maxDiff;
    }

    public static int maxDiffBetweenTwoIndex() {
        int[] input = new int[]{34,8,10,3,2,80,30,33,1};
        int length = input.length;
        int[] leftMins = new int[length];
        int[] rightMaxs = new int[length];
        leftMins[0] = input[0];
        rightMaxs[length - 1] = input[length - 1];
        for(int i = 1; i < n; i++) {
            if (input[i] < input[i-1]) leftMins[i] = input[i];
            else leftMins[i] = input[i-1];
        }
        for(int i = length - 2; i > -1; i--) {
            if(input[i] > input[i+1]) rightMaxs[i] = input[i];
            else rightMaxs[i] = input[i+1];
        }
        int i = 0; int j = 0;
        int maxDiff = -1;
        while (i < length && j < length) {
            if(leftMins[i] < rightMaxs[j]) {
                int diff = j - i;
                if (maxDiff < diff) maxDiff = diff;
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
}