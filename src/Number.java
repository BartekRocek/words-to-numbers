public class Number {

    String wordNumber;
    String number;


    public Number(String wordNumber, String number) {
        this.wordNumber = wordNumber;
        this.number = number;
    }

     public String getNumber(String number) {
        return number;
    }

    public void setNumber(String wordNumber, String number) {

        switch (wordNumber) {
            case "one": number = "1";
            case "two": number = "2";
            case "three": number = "3";
            case "four": number = "4";
            case "five": number = "5";
            case "six": number = "6";
            case "seven": number = "7";
            case "eight": number = "8";
            case "nine": number = "9";
            case "ten": number = "10";
            case "eleven": number = "11";
            case "twelve": number = "12";
            case "thirteen": number = "13";
            case "fourteen": number = "14";
            case "fifteen": number = "15";
            case "sixteen": number = "16";
            case "seventeen": number = "17";
            case "eighteen": number = "18";
            case "nineteen": number = "19";
            case "twenty": number = "20";
            case "thirty": number = "30";
            case "forty": number = "40";
            case "fifty": number = "50";
            case "sixty": number = "60";
            case "seventy": number = "70";
            case "eighty": number = "80";
            case "ninety": number = "90";
            case "hundred": number = "00";
        }

    }

}
