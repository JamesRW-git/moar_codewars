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

public class Kata {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if(haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }
}
