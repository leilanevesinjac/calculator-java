import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class test {
        @Test  //test sabiranja, ocekivani rezultat je 9
        public void testRun_Addition () {
            assertEquals("9.0", Calculator.Run("2+7"));
        }


        @Test //test oduzimanja, ukljuceni negativni brojevi ocekivani rezultat je -4
        public void testRun_Subtraction () {
            assertEquals("-4.0", Calculator.Run("-2-2"));
            }


        @Test //test dijeljenja, pretpostavka da rezultat nije tacan, test Failed sto i jeste ispravno ponasanje

        public void testRun_Division ()  {
            assertNotEquals("9.0", Calculator.Run("18/2"));
    }


        @Test //test mnozenja vise od dva faktora
        public void testRun_Multiplication () {
            assertEquals("840.0", Calculator.Run("7*5*8*3"));
        }

        @Test //test ponasanja aplikacije u slucaju pogresnog unosa
        public void testRun_Symbol () {
            assertEquals("ERROR", Calculator.Run("a"));
        }

}


