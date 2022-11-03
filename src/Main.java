import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length of array ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        System.out.println("Enter, the, element");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
    }
}