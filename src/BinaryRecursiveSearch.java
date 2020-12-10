public class BinaryRecursiveSearch {

    // Binary Recursive Search takes in a key and an array
    // two ranks functions (this is the recursive part)

    // first rank function (which only takes in a key and an array of ints) calls second rank function
    // second rank function takes in a key, an array of ints, low, and high
        // the middle of the array is found
            // if given key is less than the integer at the middle of the array
                // second rank function calls itself with the high = mid - 1
                    // only the first half of the array will be searched
            // if given key is more than the integer at the middle of the array
                // second rank function calls itself with the low = mid + 1
                    // only the second half of the array will be searched
            // if somehow (by luck or chance), the key is equal to the integer at the middle of the array
                    // return integer at the middle of the array!


    public static int steps = 0;

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int low, int high) {
        if ( low > high ) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (key < a[mid]) {
            steps++;
            return rank(key, a, low, mid-1);
        }

        else if(key > a[mid]) {
            steps++;
            return rank(key, a, mid + 1, high);
        }
        else return mid;
    }
}
