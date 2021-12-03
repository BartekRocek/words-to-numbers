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
                case "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"
                        , "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "thirty"
                        , "forty" -> changeWordToDigit(numStr, arr, number, sequenceOfWordNumbers[i]);

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
