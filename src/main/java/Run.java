import java.util.Scanner;

import static java.lang.System.out;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Wybierz jezyk (en, ru, es ");

        String selectedLanguage = scanner.nextLine();

        if (selectedLanguage == "en"){
            out.println("Hello World");
        }else if(
            selectedLanguage == "ru"){
            out.println("Zdrastwuj Tie mir");
        }else if(selectedLanguage == "es")
            out.println("Hola World");
        }

    }

