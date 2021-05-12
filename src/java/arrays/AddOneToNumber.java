package arrays;

import java.util.*;

class AddOneToNumber {

    public static ArrayList<Integer> numberToArray(int n) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        while (n > 0) {
            int remainder = n % 10;
            output.add(remainder);
            n = n / 10;
        }
        return output;
    }

    public static int arrayToNumber(ArrayList<Integer> input) {
        int length = input.size();
        int number = 0;
        for(int i = 0; i < length; i++) {
            number = number + input.get(i) * Math.pow(10, i);
        }
        return number;
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> input) {
        int length = input.size();
        int start = 0;
        int end = length - 1;
        while(start < end) {
            int temp = input.get(start);
            input.set(start, input.get(end));
            input.set(end, temp);
            start++;
            end--;
        }
        return input;
    }

    public static int addOneToNumber(ArrayList<Integer> input) {
        int carry = 1;
        int length = input.size();
        for(int i = 0; i < length; i++) {
            int temp = input.get(i) + carry;
            if (temp == 10) {
                temp = 9;
                carry = 1;
            } else {
                carry = 0;
            }
            input.set(i, temp);
        }
        int number = 0;
        for(int i = 0; i < length; i++) {
            number = number + input.get(i) * Math.pow(10, i);
        }
        number = number + carry * Math.pow(10, length);
        return number;
    }
}