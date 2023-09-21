import java.util.Arrays;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // 0 Set variables to play with
        Integer[] nList = { 55, 1, 87, 2, 7 }; // array of integers
        int num_1 = 2;

        // Challenge 1
        System.out.println("Challenge 1: ");
        System.out.println("The largest integer in the list is: " + maximum(nList));
        System.out.println("\n");

        // Challenge 2
        System.out.println("Challenge 2: ");
        System.out.println("Nnumber " + String.valueOf(num_1) + " in Word is " + printNumberInWord(num_1));
        System.out.println("\n");

        // Challenge 3
        System.out.println("Challenge 3: ");
        System.out.println(String.valueOf(num_1) + checkOddEven(num_1));
        System.out.println("\n");

        // Challenge 4
        System.out.println("Challenge 4: ");
        System.out.println("The Average number of the List is: " + average(nList));
        System.out.println("\n");
    }

    // Challenge 1: Largest Integer in the list
    public static Integer maximum(Integer[] numList) {
        Arrays.sort(numList);
        return numList[numList.length - 1];
    }

    // Challenge 2: Print number in word
    public static String printNumberInWord(int num) {
        HashMap<Integer, String> WNums = new HashMap<>();

        WNums.put(1, "ONE");
        WNums.put(2, "TWO");
        WNums.put(3, "THREE");
        WNums.put(4, "FOUR");
        WNums.put(5, "FIVE");
        WNums.put(6, "SIX");
        WNums.put(7, "SEVEN");
        WNums.put(8, "EIGTH");
        WNums.put(9, "NINE");

        if (WNums.keySet().contains(num)) {
            return WNums.get(num);
        } else {
            return "OTHER";
        }
    }

    // Challenge 3: Check Odd/Even
    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return " This number is Even";
        } else {
            return " This number is Odd";
        }
    }

    // Challenge 4: Calculate the average
    public static double average(Integer[] numList) {

        int total = 0;
        for (int i = 0; i < numList.length; i++) {
            total = total + numList[i];
        }

        return total / numList.length;
    }
}