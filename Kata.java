//public class Kata {
//    public static String findNeedle(Object[] haystack) {
//        String statement = "found the needle at position " + findIndex(haystack);
//        return statement;
//    }
//
//    public static int findIndex(Object[] haystack) {
//        int index = 0;
//        for (int i = 0; i < haystack.length; i++) {
//            if(haystack[i] == "needle") {
//                index = i;
//            }
//        }
//        return index;
//    }
//}

import java.sql.Array;
import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }

    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result = result + (n[i] * n[i]);
        }
        return result;
    }
}


