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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        countBy(1, 10);
    }

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

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();
        if (repeat == 0) {
            return "";
        } else {
            result.append(String.valueOf(string).repeat(Math.max(0, repeat)));
        }
        return result.toString();
    }

    public static String bmi(double weight, double height) {
        double bodymass = weight / Math.pow(height, 2);
        String result = "";
        if (bodymass <= 18.5) {
            result = "Underweight";
        } else if (bodymass <= 25.0) {
            result = "Normal";
        } else if (bodymass <= 30.0) {
            result = "Overweight";
        } else if (bodymass > 30.0) {
            result = "Obese";
        }
        return result;
    }

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean check2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    public static int simpleMultiplication(int n) {
        if(n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static String greet2(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        if(principal < desired) {
            do {
                System.out.println("Desired amount: " + desired);
                System.out.println("Principal at start of year: " + principal);
                System.out.println("Interest payment: " + (principal * interest));
                System.out.println("Tax: " + ((principal * interest) * tax));
                System.out.println("Principal at end of year: " + principal);
                principal += (principal * interest) - (principal * interest) * tax;
                years++;
                System.out.println("Year: " + years);
            } while (principal < desired);
        }
        return years;
    }

    public static int[] countBy(int x, int n){
        int workingNum = x;
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(workingNum);
            newArr[i] = workingNum;
            workingNum += x;
        }
        return newArr;
    }
}



