package ITaLexam;

import java.util.Scanner;

public class NumberSystemConverter {
     
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Number System Converter ===");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Hexadecimal");
            System.out.println("3. Addition of Binary Numbers");
            System.out.println("4. Subtraction of Hex and Decimal");
            System.out.println("5. Multiplication of Octal and Decimal");
            System.out.println("6. Division (with error check)");
            System.out.println("0. Exit");
            System.out.print("Choose operation: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Binary number: ");
                    String binary = sc.nextLine();
                    try {
                        int decimal = Integer.parseInt(binary, 2);
                        System.out.println("Binary " + binary + " = Decimal " + decimal);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Decimal number: ");
                    int dec = sc.nextInt();
                    System.out.println("Decimal " + dec + " = Hexadecimal " + Integer.toHexString(dec).toUpperCase());
                }
                case 3 -> {
                    System.out.print("Enter first binary number: ");
                    String bin1 = sc.nextLine();
                    System.out.print("Enter second binary number: ");
                    String bin2 = sc.nextLine();
                    try {
                        int b1 = Integer.parseInt(bin1, 2);
                        int b2 = Integer.parseInt(bin2, 2);
                        int sum = b1 + b2;
                        System.out.println(bin1 + " + " + bin2 + " = " + Integer.toBinaryString(sum));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary input.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Hexadecimal number: ");
                    String hex = sc.nextLine();
                    System.out.print("Enter Decimal number to subtract: ");
                    int decSub = sc.nextInt();
                    try {
                        int hexVal = Integer.parseInt(hex, 16);
                        int result = hexVal - decSub;
                        System.out.println(hex.toUpperCase() + " (Hex) - " + decSub + " = " + Integer.toHexString(result).toUpperCase() + " (Hex)");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Octal number: ");
                    String octal = sc.nextLine();
                    System.out.print("Enter Decimal number to multiply: ");
                    int decMul = sc.nextInt();
                    try {
                        int octVal = Integer.parseInt(octal, 8);
                        int product = octVal * decMul;
                        System.out.println(octal + " (Octal) * " + decMul + " = " + Integer.toOctalString(product) + " (Octal)");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid octal number.");
                    }
                }
                case 6 -> {
                    System.out.print("Enter numerator: ");
                    int num = sc.nextInt();
                    System.out.print("Enter denominator: ");
                    int den = sc.nextInt();
                    if (den == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        double result = (double) num / den;
                        System.out.println(num + " / " + den + " = " + result);
                    }
                }
                case 0 -> System.out.println("Exiting program. Goodbye!!!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}