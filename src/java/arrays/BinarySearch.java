package arrays;

class BinarySearch {

    public static boolean binarySearch(int[] sorted, int input) {
        if (sorted == null || sorted.length == 0) return false;
        int mid = 0;
        int start = 0;
        int end = sorted.length - 1;
        while (start < end) {
            mid = (start + end) / 2;
            if (sorted[mid] == input) return true;
            if (input < sorted[mid]) end = mid - 1;
            else start = mid + 1;
        }
    }
}