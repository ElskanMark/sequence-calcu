import java.util.Scanner;

public class sequence {

    public static void main(String[] args) {
        Scanner jaida = new Scanner(System.in);

        do {
            System.out.println("Choose a sequence to compute:");
            System.out.println("1. Fibonacci sequence");
            System.out.println("2. Tribonacci sequence");
            System.out.println("3. Lucas sequence");
            System.out.print("\nchoice: ");
            int choice = jaida.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the length of Fibonacci sequence:");
                    int fibLength = jaida.nextInt();
                    printFibonacci(fibLength);
                    break;
                case 2:
                    System.out.println("Enter the length of Tribonacci sequence:");
                    int tribLength = jaida.nextInt();
                    printTribonacci(tribLength);
                    break;
                case 3:
                    System.out.println("Enter the length of Lucas sequence:");
                    int lucasLength = jaida.nextInt();
                    printLucas(lucasLength);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
        } while (jaida.next().equalsIgnoreCase("yes"));

        jaida.close();
    }

    private static void printFibonacci(int length) {
        int a = 0, b = 1;
        int counter = 0;

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%-6d", a);
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    private static void printTribonacci(int length) {
        int a = 0, b = 1, c = 1;
        int counter = 0;

        System.out.println("Tribonacci sequence:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%-6d", a);
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

            int temp = a + b + c;
            a = b;
            b = c;
            c = temp;
        }
        System.out.println();
    }

    private static void printLucas(int length) {
        int a = 2, b = 1;
        int counter = 0;

        System.out.println("Lucas sequence:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%-6d", a);
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}