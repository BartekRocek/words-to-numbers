import java.util.ArrayList;

public class Parser {

    public static int parseInt(String numStr) {
        // Your code here!

        String[] individualWordNumbers = numStr.split("\\s|-|^and");
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> componentsToSumUp = new ArrayList<>();

        Number number = new Number(numStr, individualWordNumbers[0]);
        int sum = 0;
        int counter = 0;

        for (String individualWordNumber : individualWordNumbers) {

            switch (individualWordNumber) {
                case "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                        "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                        "eighty", "ninety", "hundred", "thousand", "million" -> changeWordToDigit(arr, number,
                        individualWordNumber);
            }
        }
        for (String s : arr) {

            if (s.equals("1000000") || s.equals("1000") || s.equals("100")) {
                sum *= Integer.parseInt(s);
                componentsToSumUp.add(counter, sum);
                counter++;
                sum = 0;
                continue;
            }
            sum += Integer.parseInt(s);
        }

        for (Integer integer : componentsToSumUp) {
            sum += integer;
        }

        return sum;
    }

    private static void changeWordToDigit(ArrayList<String> arr, Number number, String individualWordNumbers) {
        number.setNumber(individualWordNumbers);
        arr.add(number.getNumber());
    }

    private static boolean isHundredPriorToThousand(String s, String[] individualWordNumbers) {
        int indexOfHundred = 1000;
        for (int i = 0; i < individualWordNumbers.length; i++) {
            if (individualWordNumbers[i].equals("100")) {
               indexOfHundred = i;
               break;
            }
        }
        for (int i = 0; i < individualWordNumbers.length; i++) {
            if (individualWordNumbers[i].equals("1000") && i > indexOfHundred)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(parseInt(new java.util.Scanner(System.in).nextLine().toLowerCase()));

    }
}