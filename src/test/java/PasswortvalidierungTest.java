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
    boolean actualLength = Passwortvalidierung.checkPasswordLength(input);
    //then
    //assertTrue(8,actualLength);
    assertTrue(actualLength);
}

    @Test
    public void passwordLengthUnder8(){
        //given
        String input = "pwd";
        //when
        boolean actualLength = Passwortvalidierung.checkPasswordLength(input);
        //then
        //assertTrue(8,actualLength);
        assertFalse(actualLength);
    }

@Test
    public void passwordContainsNumber(){
    //given
    String input = "password1";
    //when
    boolean actual = Passwortvalidierung.checkPasswordForNumber(input);
    //then

    assertTrue(actual);
}
    @Test
    public void passwordContainsNoNumber(){
        //given
        String input = "passwordasd";
        //when
        boolean actual = Passwortvalidierung.checkPasswordForNumber(input);
        //then

        assertFalse(actual);
    }
}