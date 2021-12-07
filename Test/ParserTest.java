import static org.junit.jupiter.api.Assertions.*;


class ParserTest {



   @org.junit.jupiter.api.Test
   void parseInt() {

       try {
           assertEquals(Parser.parseInt("one hundred"), 100);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Out of boundaries!");
       }
    }

}