import java.util.ArrayList;

public class Parser {

    public static int parseInt(String numStr) {
        // Your code here!

        String[] sequenceOfWordNumbers = numStr.split("\\s|-");
        ArrayList<String> arr = new ArrayList<>();
        Number number = new Number(numStr, sequenceOfWordNumbers[0]);

        for (int i = 0; i < sequenceOfWordNumbers.length; i++) {

            switch (sequenceOfWordNumbers[i]) {
                case "million": number.setNumber(numStr, sequenceOfWordNumbers[i -1]);
                arr.add(number.getNumber(numStr, sequenceOfWordNumbers[i -1]));
                case "thousand":

            }


        }



        return -1;
    }

    public static void main(String[] args) {

        System.out.println(parseInt(new java.util.Scanner(System.in).nextLine()));

    }

}
