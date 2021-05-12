package arrays;

class SeparateEvenAndOdd {

    public static void separateEvenAndOdd() {
        int[] input = new int[] {12, 34, 45, 9, 8, 90, 3};
        int length = input.length;
        int start = 0;
        int end = length - 1;
        while(start < end) {
            if(input[start] % 2 == 1 && input[end] % 2 == 0) {
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            }
            else if(input[start] % 2 == 0) {
                start++;
            }
            else {
                end--;
            }
        }

        for(int i = 0; i < length; i++) {
            System.out.println("Value : " + input[i]);
        }
    }
}