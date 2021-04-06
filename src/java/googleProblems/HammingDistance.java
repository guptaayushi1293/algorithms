package googleProblems;

import java.util.ArrayList;
import java.util.HashMap;

class HammingDistance {

    public int hammingDistance(ArrayList<Integer> A) {
        HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
        int total = 0;
        int res = 0;
        for (int item1 : A) {
            if (output.containsKey(item1)) {
                total = total + output.get(item1);
            } else {
                for (int item2 : A) {
                    res = bitsDiff(item1, item2);
                    total = total + res;
                }
                output.put(item1, res);
            }
        }
        return total;
    }

    private int bitsDiff(int a, int b) {
        int result = a ^ b;
        int count = 0;
        while (result > 0) {
            if (result % 2 == 0) count = count + 1;
            result = result / 2;
        }
        return count;
    }
}