public class Number {

    String wordNumber;
    String number;


    public Number(String wordNumber, String number) {
        this.wordNumber = wordNumber;
        this.number = number;
    }

     public String getNumber() {
        return this.number;
    }

    public void setNumber(String wordNumber) {

        switch (wordNumber) {
            case "zero" -> this.number = "0";
            case "one" -> this.number = "1";
            case "two" -> this.number = "2";
            case "three" -> this.number = "3";
            case "four" -> this.number = "4";
            case "five" -> this.number = "5";
            case "six" -> this.number = "6";
            case "seven" -> this.number = "7";
            case "eight" -> this.number = "8";
            case "nine" -> this.number = "9";
            case "ten" -> this.number = "10";
            case "eleven" -> this.number = "11";
            case "twelve" -> this.number = "12";
            case "thirteen" -> this.number = "13";
            case "fourteen" -> this.number = "14";
            case "fifteen" -> this.number = "15";
            case "sixteen" -> this.number = "16";
            case "seventeen" -> this.number = "17";
            case "eighteen" -> this.number = "18";
            case "nineteen" -> this.number = "19";
            case "twenty" -> this.number = "20";
            case "thirty" -> this.number = "30";
            case "forty" -> this.number = "40";
            case "fifty" -> this.number = "50";
            case "sixty" -> this.number = "60";
            case "seventy" -> this.number = "70";
            case "eighty" -> this.number = "80";
            case "ninety" -> this.number = "90";
            case "hundred" -> this.number = "100";
            case "thousand" -> this.number = "1000";
            case "million" -> this.number = "1000000";
        }
    }
}