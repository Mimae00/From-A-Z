package src;


import java.util.Scanner;

public class GiveLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired list of letters ex:(A-C): ");
        String letters = scanner.nextLine();

        GiveLettersImpl.gimmeTheLetters(letters);
    }
}

