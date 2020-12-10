import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Random;

// to run on a specific input size, please give that input size to limit() in BOTH arrays (allowList and candidates)

public class Main {

    public static void main(String[] args) {
        // random array of ints
        int[] allowList = IntStream.generate( () -> new Random().nextInt(1000)).limit(1000).toArray();

        Arrays.sort(allowList);

        // this is the array we will use to check to see if these candidates are in allow list
        int[] candidates = IntStream.generate( () -> new Random().nextInt(1000)).limit(1000).toArray();


        for (int cand : candidates) {
            LinearSearch.rank(cand, allowList);
            /*if (LinearSearch.rank(cand, allowList) == -1) {
                System.out.format("not found\n");
            }
            else {
                System.out.format("found!!!\n");
            }*/
        }
        System.out.format("Linear Search Steps: %d\n", LinearSearch.steps);

        for (int cand : candidates) {
            BinarySearch.rank(cand, allowList);
            /*if (BinarySearch.rank(cand, allowList) == -1) {
                System.out.format("not found\n");
            }
            else {
                System.out.format("found!!!\n");
            }*/
        }
        System.out.format("Binary Search Steps: %d\n", BinarySearch.steps);

        for (int cand : candidates) {
            BinaryRecursiveSearch.rank(cand, allowList);
            /*if (BinaryRecursiveSearch.rank(cand, allowList) == -1) {
                System.out.format("not found\n");
            }
            else {
                System.out.format("found!!!\n");
            }*/
        }
        System.out.format("Binary Recursive Steps: %d\n", BinaryRecursiveSearch.steps);
    }

}
