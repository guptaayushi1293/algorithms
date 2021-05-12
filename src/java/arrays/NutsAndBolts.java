public class HelloWorld{

    public static void main(String []args){
        System.out.println("Hello World");
        char[] nuts = {'@', '^', '%', '&', '$', '~', '#', '*', '!'};
        char[] bolts = {'~', '#', '@', '%', '&', '*', '$', '^', '!'};
        int n = nuts.length;
        Solution s = new Solution();
        s.matchPairs(nuts, bolts, n);
        System.out.println("nuts ------ ");
        for(int i = 0; i < n; i++) {
            System.out.print(nuts[i] + " , ");
        }
        System.out.println("bolts ------ ");
        for(int i = 0; i < n; i++) {
            System.out.print(bolts[i] + " , ");
        }
    }
}

class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        int nutFirst = 1;
        int nut_counter = 0;
        int bolt_counter = n - 1;
        while (nut_counter < n && bolt_counter > -1) {
            if(nutFirst == 1) {
                char pivot = getPivot(nuts, nut_counter);
                bolts = sortByPivot(bolts, pivot, n);
                nutFirst = 0;
                nut_counter += 1;
            } else if (nutFirst == 0) {
                char pivot = getPivot(bolts, bolt_counter);
                nuts = sortByPivot(nuts, pivot, n);
                nutFirst = 1;
                bolt_counter -= 1;
            }
        }
    }

    char getPivot(char arr[], int index) {
        return arr[index];
    }

    char[] sortByPivot(char arr[], char pivot, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }
}