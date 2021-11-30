public class Number {

    String wordNumber;
    String number;


    public Number(String wordNumber, String number) {
        this.wordNumber = wordNumber;
        this.number = number;
    }

     public String getNumber(String wordNumber, String number) {
        return number;
    }

    public void setNumber(String wordNumber, String number) {

        switch (wordNumber) {
            case "one": number = "1";
            case "two": number = "2";
        }

    }

}
