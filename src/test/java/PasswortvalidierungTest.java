import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortvalidierungTest {

//    @Test
//    public void isStringValid() {
//        //given

//        String input = "abc1234";

//        //when

//        String actual = Passwortvalidierung.inputPassword();

//        //then

//        assertEquals("abc1234", actual);
//    }
@Test
    public void passwordLengthMin8(){
    //given
    String input = "password";
    //when
    int actualLength = Passwortvalidierung.checkPasswordLength(input);
    //then
    //assertTrue(8,actualLength);
    assertEquals(8,actualLength);
}
}