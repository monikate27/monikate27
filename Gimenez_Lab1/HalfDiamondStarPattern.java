import java.util.Scanner; // used scanner to input the number of rows

    public class HalfDiamondStarNumberPattern {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input the number
        System.out.print("Enter number: ");
        int n = sc.nextInt();

    // Print the single star at the beginning
        System.out.println("*");

    // Print the upper half of the pattern
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }
        System.out.println("*");
    }

    // Print the lower half of the pattern
    for (int i = n - 1; i >= 1; i--) {
        System.out.print("*");
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for (int j = i - 1; j >= 1; j--) {
    System.out.print(j);
    }
    System.out.println("*");
    }

    // Print the single star at the end
    System.out.println("*");
    }
}
