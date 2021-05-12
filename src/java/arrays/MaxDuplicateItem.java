package arrays;

class MaxDuplicateItem {

    //assumption - array is sorted
    public static void getMaxDuplicateItem(int[] input) {
        if(input.length == 0) return;
        int max_count = 0;
        int result = input[0];
        int count = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i-1]) {
                count = count + 1;
            }
            if (max_count < count) {
                max_count = count;
                result = input[i];
            }
        }
        System.out.println("Winner : " + result);
        System.out.println("Count : " + max_count);
    }
}