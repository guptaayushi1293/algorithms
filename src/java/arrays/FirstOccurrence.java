package arrays;

class FirstOccurrence {

    public static int getFirstOccurrence(int[] arr, int number, int low, int high) {
        int mid = low + (high - low)/2;
        if((mid == 0 || number > arr[mid-1]) && arr[mid] == number) return mid;
        if(arr[mid] < number) return getFirstOccurrence(arr, number, mid + 1, high);
        else return getFirstOccurrence(arr, number, low, mid - 1);
    }

    public static int getLastOccurrence(int[] arr, int number, int low, int high) {
        int mid = low + (high - low)/2;
        if ((mid == high - 1 || number < arr[mid + 1]) && arr[mid] == number) return mid;
        if(arr[mid] < number) return getLastOccurrence(arr, number, mid+1, high);
        else return getLastOccurrence(arr, number, low, mid-1);
    }
}