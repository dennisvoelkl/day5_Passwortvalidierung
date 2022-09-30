import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortvalidierungTest {

    @Test
    public void isStringValid() {
        //given

        String input = "abc1234";

        //when

        String actual = Passwortvalidierung.inputPassword(input);

        //then

        assertEquals("abc1234", actual);
    }

}