import java.util.Arrays;

public class Positive{

    public static int sum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                total += arr[i];
            }
        }
        return total;
    }

    public static int alsoSum(int[] arr) {
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

}