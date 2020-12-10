public class BinarySearch {

    // binary search takes in a key and an array
    // finds the key at the middle of the array
    // compares that int to the given key
        // if key is less than the int at the middle of the array
            // the high of the array is set to one less than the mid
            // now only only ints within the low and new high are searched through
        // if key is more than the int at the middle of the array
            // the low of the array is set to one more than the mid
            // now only only ints within the new low and high are searched through
    public static int steps = 0;

    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            steps++;
            int mid = low + (high-low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            }
            else if (key > a[mid]) {
                low = mid + 1;
            }
            else return mid;
        }
        return -1;
    }
}
