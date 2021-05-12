package arrays;

class DuplicateZero {

    public static int[] duplicateZero(int[] input) {
        if(input.length == 0 || input.length == 1) return input;
        int start = 0;
        int end = input.length;
        while(start < end) {
            if(input[start] == 0) {
                input = rotateToRight(input, start+1, end);
                input[start+1] = 0;
                start += 1;
            }
            start += 1;
        }
    }

    public static int[] rotateToRight(int[] input, int start, int end) {
        for(int i = start + 1; i < end; i++) {
            input[i] = input[i-1];
        }
        return input;
    }
}