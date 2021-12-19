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
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);

            if (s.equals("100") && isHundredPriorToThousand(arr, i)) {
                sum *= Integer.parseInt(s) * 1000;
                componentsToSumUp.add(counter, sum);
                counter++;
                sum = 0;
                continue;
            }

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

    public static boolean isHundredPriorToThousand(ArrayList<String> arr, int i) {

        int indexOfHundred = 0;
        boolean isHundredPresent = false;

        for (; i < arr.size(); i++) {
            if (Integer.parseInt(arr.get(i)) == 100) {

               isHundredPresent = true;
               indexOfHundred = i;
               break;
            }
        }
        for (int k = indexOfHundred; k < arr.size(); k++) {
            if (isHundredPresent && Integer.parseInt(arr.get(k)) == 1000) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(parseInt(new java.util.Scanner(System.in).nextLine().toLowerCase()));
    }
}
