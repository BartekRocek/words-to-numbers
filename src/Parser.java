import java.util.Scanner;
import java.util.ArrayList;

public class Parser {

    public static int parseInt(String numStr) {
        // Your code here!

        String[] sequenceOfWordNumbers = numStr.split("\\s|-");
        ArrayList<String> arr = new ArrayList<>();
        Number number = new Number(numStr, sequenceOfWordNumbers[0]);

        for (int i = sequenceOfWordNumbers.length - 1; i >= 0; i--) {

            switch (sequenceOfWordNumbers[i]) {
                case "one":
                case "two":
                case "three":
                case "four":
                case "five":
                case "six":
                case "seven":
                case "eight":
                case "nine":
                case "ten":
                case "eleven":
                case "twelve":
                case "thirteen":
                case "fourteen":
                case "fifteen":
                case "sixteen":
                case "seventeen":
                case "eighteen":
                case "nineteen":
                case "thirty":
                case "forty":
                    changeWordToDigit(numStr, arr, number, sequenceOfWordNumbers[i]);
//                    default: return -1;
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += Integer.parseInt(arr.get(i));
        }

        return sum;
    }

    private static void changeWordToDigit(String numStr, ArrayList<String> arr, Number number,
                                          String sequenceOfWordNumber) {
        number.setNumber(sequenceOfWordNumber);
        arr.add(number.getNumber());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numberInWords = scanner.nextLine();

        System.out.println(parseInt(numberInWords));

    }

}
