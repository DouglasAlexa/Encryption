package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cryptomania!");
        boolean exit = false;

        while (!exit) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nPlease enter a value to encrypt: ");

            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Good bye!");
                exit = true;
            } else {
                String encryptedValue = encryptValue(input);
                String decryptedValue = decryptValue(encryptedValue);

                System.out.println("----------");
                System.out.println("Encrypted value: " + encryptedValue);
                System.out.println("Decrypted value: " + decryptedValue);
            }
        }
    }

    private static String encryptValue(String input) {
        char[] toCrypt = input.toCharArray();
        char[] encryptedValue = new char[toCrypt.length];

        for (int i = 0; i < toCrypt.length; i++) {
            encryptedValue[i] = (char) (toCrypt[i] + 2);
        }

        return buildString(encryptedValue);
    }

    private static String decryptValue(String input) {
        char[] decryptedValue = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            decryptedValue[i] = (char) (input.charAt(i) - 2);
        }

        return buildString(decryptedValue);
    }

    private static String buildString(char[] toBuild) {
        StringBuilder dummy = new StringBuilder();

        for (char string : toBuild) {
            dummy.append(string);
        }

        return dummy.toString();
    }
}