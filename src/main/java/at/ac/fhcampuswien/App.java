package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scan = new Scanner(System.in);


        double largestNumber = 0;

        for (int i = 1; i >= 1; i++) {
            System.out.print("Number " + i + ": ");
            double number = scan.nextDouble();

            if (number > largestNumber) {

                largestNumber = number;

            }
            if (number <= 0 && i == 1) {
                System.out.println("No number entered.");
                break;
            }

            if (number <= 0) {
                System.out.printf("The largest number is %.2f", largestNumber);
                System.out.println();
                break;
            }
        }


    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("n: Invalid number!");
        } else {
            System.out.print("n: ");
        }


        int numberToIterate = 1;


        for (int i = 0; i < number; i++) {


            for (int j = 0; j <= i; j++) {
                System.out.print("" + numberToIterate + " ");
                numberToIterate++;


            }
            System.out.println();
        }

    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int number = 6;
        int totalCharsToSet = (number * 2) - 1;
        int starCount = 1;
        int starOffset = number - 1;


        for (int i = 0; i < number; i++) {

            if (i > 0) {
                starCount += 2;
            }
            for (int j = 0; j < starOffset + starCount; j++) {
                if (j >= starOffset) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            starOffset -= 1;

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scan4 = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan4.nextInt();

        System.out.print("c: ");
        char c = scan4.next().charAt(0);

        if (h % 2 == 1) {
            for (int i = 0; i <= h / 2; i++) {
                for (int j = i; j < h / 2; j++) {
                    System.out.print(" ");
                }

                for (int k = -i; k <= i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
            }

            for (int i = h / 2; i > 0; i--) {
                for (int j = i; j <= h / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = -i + 1; k < i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
            }


        } else {
            System.out.println("Invalid number!");
        }
    }
    // Quelle: TUT Progammieren

    //todo Task 5
    public void marks() {
        // input your solution here


        Scanner scan = new Scanner(System.in);
        int negativ = 0;
        double grade = 0;
        int count = 0;


        for (int i = 1; true; i++) {
            System.out.print("Mark " + i + ": ");
            double eingabe = scan.nextDouble();
            if (eingabe == 0 && i == 1) {
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: 0");
                break;

            }
            if (eingabe < 0 || eingabe > 5) {
                System.out.println("Invalid mark!");
                System.out.print("Mark " + i + ": ");
                eingabe = scan.nextDouble();
                count += eingabe;

            } else {
                count += eingabe;
            }
            if (eingabe == 1 || eingabe == 2 || eingabe == 3 || eingabe == 4 || eingabe == 5) {
                grade++;
            }

            if (eingabe == 5) {
                negativ++;
            }
            if (i > 1 && eingabe == 0) {
                System.out.printf("Average: %.2f", (count / grade));
                System.out.println();
                System.out.println("Negative marks: " + negativ);
                break;
            }
        }
    }


    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scan6 = new Scanner(System.in);

        int n, r = 1, num, sum = 0;
        System.out.print("n: ");
        n = scan6.nextInt();
        num = n;
        while (num > 9) {
            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    //Quelle: https://www.efaculty.in/java-programs/happy-number-program-in-java/

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}