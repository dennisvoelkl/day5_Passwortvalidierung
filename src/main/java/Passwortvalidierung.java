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

        inputPassword();

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




}

