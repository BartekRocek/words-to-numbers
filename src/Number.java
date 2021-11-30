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
            case "one": this.number = "1";
            break;
            case "two": this.number = "2";
            break;
            case "three": this.number = "3";
            break;
            case "four": this.number = "4";
            break;
            case "five": this.number = "5";
            break;
            case "six": this.number = "6";
            break;
            case "seven": this.number = "7";
            break;
            case "eight": this.number = "8";
            break;
            case "nine": this.number = "9";
            break;
            case "ten": this.number = "10";
            break;
            case "eleven": this.number = "11";
            break;
            case "twelve": this.number = "12";
            break;
            case "thirteen": this.number = "13";
            break;
            case "fourteen": this.number = "14";
            break;
            case "fifteen": this.number = "15";
            break;
            case "sixteen": this.number = "16";
            break;
            case "seventeen": this.number = "17";
            break;
            case "eighteen": this.number = "18";
            break;
            case "nineteen": this.number = "19";
            break;
            case "twenty": this.number = "20";
            break;
            case "thirty": this.number = "30";
            break;
            case "forty": this.number = "40";
            break;
            case "fifty": this.number = "50";
            break;
            case "seventy": this.number = "70";
            break;
            case "eighty": this.number = "80";
            break;
            case "ninety": this.number = "90";
            break;
            case "hundred": this.number = "00";
            break;
        }

    }

}
