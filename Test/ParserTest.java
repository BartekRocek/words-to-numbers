import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

   @org.junit.jupiter.api.Test
   void parseInt1() {

       String input1 = "three hundred and twenty thousand";
       int outcome1 = Parser.parseInt(input1);

       try {
           assertEquals(320_000, outcome1);

       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Out of boundaries!");
       }
    }

    @org.junit.jupiter.api.Test
    void parseInt2() {

        String input2 = "one thousand nine hundred and six";
        int outcome2 = Parser.parseInt(input2);
        assertEquals(1_906, outcome2);
    }

    @org.junit.jupiter.api.Test
    void parseInt3() {

        String input2 = "three hundred and twenty-one";
        int outcome2 = Parser.parseInt(input2);
        assertEquals(321, outcome2);
    }

    @org.junit.jupiter.api.Test
    void parseInt4() {

        String input4 = "one million five hundred and three thousand one";
        int outcome4 = Parser.parseInt(input4);
        assertEquals(1_503_001, outcome4);
    }

    @org.junit.jupiter.api.Test
    void parseInt5() {
        String input5 = "five thousand two hundred and one";
        int outcome5 = Parser.parseInt(input5);
        assertEquals(5_201, outcome5);
    }

}