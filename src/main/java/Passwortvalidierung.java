import java.util.Scanner;
/*
Aufgabe: Passwortvalidierung
Schreibe eine Passwortvalidierung.

1. Lege dir ein neues Java Github Projekt an (OK)
2. Überlege dir, wie die Methoden aussehen müssen.
3. Schreibe jeweils erst einen Test und dann die Funktionalität
4. Überprüfe erst die Länge des Passworts und dann, ob Zahlen enthalten sind
 */
public class Passwortvalidierung {
    public static void main(String[] args) {

        // Return zwischenspeichern in die Variable Password
       String password = inputPassword();
       System.out.println(password);
       // Passwortlänge von String password checken
       checkPasswordLength(password);
       System.out.println(password);
       checkPasswordForNumber(password);
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


    public static int checkPasswordLength(String password) {

        int passwordLength = password.length();
        if (passwordLength < 8){
            System.out.println("password is too short!");
            inputPassword();

        }

        return passwordLength;
    }

    public static boolean checkPasswordForNumber(String input) {
        if(input.matches(".*[0-9].*")){
            return true;
        }

        System.out.println("Password should contain a numeric charachter");
        return false;

    }

    // System.out.println(Str.matches(".*[0-9].*"));
}

