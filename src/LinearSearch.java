public class LinearSearch {
    public static int steps = 0;

    // linear search takes in a key and an array
    // iterates through array and each int in the array gets compared to the given key

    public static int rank(int key, int[] a) {
        for(int i = 0; i < a.length; i++) {
            steps++;
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
