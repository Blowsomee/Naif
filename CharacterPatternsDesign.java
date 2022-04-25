package character.patterns.design;

import java.util.Scanner;

public class CharacterPatternsDesign {

    Scanner input = new Scanner(System.in);

    public static void triangle(int x) {
        int alphabet = 65;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

    public static void Repeating_Alphabet(int x) {

        int alphabet = 65;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

    public static void kShape_Character(int x) {

        for (int i = x; i >= 0; i--) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= x; i++) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }

    }

    public static void Triangle_Character(int x) {

        for (int i = 0; i <= x; i++) {
            int alphabet = 65;
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }

    public static void Diamond_Character(char x) {

        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z'};
        int letter_number = 0;

        String[] diamond = new String[26];

        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == x) {
                letter_number = i;
                break;
            }
        }

        for (int i = 0; i <= letter_number; i++) {
            diamond[i] = "";

            for (int j = 0; j < letter_number - i; j++) {
                diamond[i] += " ";
            }

            diamond[i] += letter[i];

            if (letter[i] != 'A') {
                for (int j = 0; j < 2 * i - 1; j++) {
                    diamond[i] += " ";
                }

                diamond[i] += letter[i];
            }

            System.out.println(diamond[i]);
        }

        for (int i = letter_number - 1; i >= 0; i--) {

            System.out.println(diamond[i]);
        }

    }

    public static void print_rectangle(char letter, int type) {
        int m, n;
        m = n = 0;
        int i, j;
        if (type == 1) {
            n = 5;
            m = 20;
        } else if (type == 2) {
            n = 4;
            m = 8;
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n
                        || j == 1 || j == m) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char letter;
        Scanner input = new Scanner(System.in);
        int row;
        int Shape_yes_no = 1;
        int request_number = 0;
        int Shape_type;

        System.out.println(" :............................. <<<< Welcome to Character Pattern Design Program >>>>......................... : ");

        System.out.println(" all the Pattern Design options are:");
        System.out.println("      Right Alphabetic triangle Pattern  ");
        System.out.println("      Repeating Alphabet / Character Pattern ");
        System.out.println("      K Shape Character Pattern ");
        System.out.println("      Triangle Character Pattern");
        System.out.println("      Diamond Character Pattern ");
        System.out.println("      Hollow rectangle or square patterns ");

        System.out.println("  Would you like to draw one of the patterns above? if yes Enter  1 , if no Enter any other number : ");
        Shape_yes_no = input.nextInt();
        while (Shape_yes_no == 1) {

            System.out.println(" Please enter the Desired pattern you would want  :");
            System.out.println("    for Right Alphabetic triangle Pattern  Enter     1 ");
            System.out.println("     for Repeating Alphabet / Character Pattern      2 ");
            System.out.println("     for K Shape Character Pattern  Enter            3 ");
            System.out.println("     for Triangle Character Pattern   Enter          4");
            System.out.println("     for Diamond Character Pattern  Enter            5 ");
            System.out.println("     for Hollow rectangle or square patterns         6");

            Shape_type = input.nextInt();
            switch (Shape_type) {
                case 1:
                    System.out.println("Enter the number of rows ");
                    row = input.nextInt();
                    triangle(row);

                    break;

                case 2:
                    System.out.println("Enter the number of rows ");
                    row = input.nextInt();
                    Repeating_Alphabet(row);
                    break;
                case 3:
                    System.out.println("Enter the number of rows ");
                    row = input.nextInt();
                    kShape_Character(row);
                    break;

                case 4:
                    System.out.println("Enter the number of rows ");
                    row = input.nextInt();
                    Triangle_Character(row);
                    break;
                case 5:
                    System.out.print("Enter a Char between A to Z : ");
                    letter = input.next("[A-Z]").charAt(0);
                    Diamond_Character(letter);

                    break;

                case 6:
                    System.out.print("Enter a Char  : ");
                    letter = input.next("[A-Z]").charAt(0);
                    System.out.print("  if you want a hollow rectangle Enter  1\n  and if you would like a square pattern Enter 2  ");
                    row = input.nextInt();
                    print_rectangle(letter, row);
                    break;
                default:
                    System.out.print("your option is not found please Enter a number  1 -  6  ");

            }
            System.out.println("  Would you like to draw one of the patterns above? if yes Enter  1 , if no Enter any other number : ");

            Shape_yes_no = input.nextInt();
            request_number = request_number + 1;
        }
        System.out.println("  the number of requested program shapes are:  " + request_number);
    }
}
