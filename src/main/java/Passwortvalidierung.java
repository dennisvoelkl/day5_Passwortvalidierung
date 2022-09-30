import java.util.Scanner;
import java.util.regex.Pattern;

/*
Aufgabe: Passwortvalidierung
Schreibe eine Passwortvalidierung.

1. Lege dir ein neues Java Github Projekt an (OK)
2. Überlege dir, wie die Methoden aussehen müssen.
3. Schreibe jeweils erst einen Test und dann die Funktionalität
4. Überprüfe erst die Länge des Passworts und dann, ob Zahlen enthalten sind
Bonus:
5. Checke, ob kleine/große Buchstaben enthalten sind
6. Verbiete "schlechte" Passwörter wie "passwort" oder "123456"
 */
public class Passwortvalidierung {
    public static  String[] forbiddenPasswords = {"Password123","Abcde123","Hallowelt123"};
    public static final int MIN_LENGTH = 8;
    public static void main(String[] args) {

        boolean checkPasswordValid = false;

        do {
            // Return zwischenspeichern in die Variable Password
            String password = inputPassword();
            // System.out.println(password);
            // Passwortlänge von String password checken
            boolean checkPwLength = checkPasswordLength(password);
            // System.out.println(password);
            boolean checkPwNumber = checkPasswordForNumber(password);
            boolean checkPwUpperCase = checkPasswordForUpperCaseLetters(password);
            boolean checkForbiddenCase = checkForbiddenPassword(password);

            if(!checkForbiddenCase){
                System.out.println("Passwort nicht zulässig");
            }
            else if((checkPwLength && checkPwNumber && checkPwUpperCase && checkForbiddenCase)){
                checkPasswordValid = true;

            }
            else {
                System.out.println("Passwort muss mindestens 8 Zeichen und eine Zahl enthalten + Großschreibung");
            }
        }
        while (!checkPasswordValid);
    }
    //Methode für Passworteingabe
    //  inputPassword()
    //
    public static String inputPassword() {
        System.out.println("Bitte gebe ein Passwort ein:");

//        Scanner inputKeyboard = new Scanner(System.in);
//        input = inputKeyboard.nextLine();

        String input = new java.util.Scanner(System.in).nextLine();

        return input;
    }


    public static boolean checkPasswordLength(String password) {

        int passwordLength = password.length();
        if (passwordLength < MIN_LENGTH){
            System.out.println("password is too short!");
            // hatten hier ein Problem das dass Passwort nicht in die Main übergeben wurde
            // inputPassword();
            return false;
        }
        return true;
    }

    public static boolean checkPasswordForNumber(String input) {
        if(input.matches(".*[0-9].*")){
            return true;
        }
       // System.out.println("Password should contain a numeric charachter");
        return false;
    }

    public static boolean checkPasswordForUpperCaseLetters(String input) {
        /*
        Pattern Pattern[] = new Pattern[1];
        //Pattern[] testArray = new Pattern[1];
        Pattern[0] = Pattern.compile(".*[A-Z].*");

        if ( input.matches(".*[A-Z]+$.*")){
            return true;
        }
        */
        for(int i = 0; i< input.length(); i++){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkForbiddenPassword(String password) {
        //String[] forbiddenPasswords = {"Password123","Abcde123","Hallowelt123"};
        for(String passwords : forbiddenPasswords){
            if(password.equals(passwords)){
                return false;
            }
        }
        return true;
    }
}
