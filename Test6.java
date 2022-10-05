package AAAAA;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test6 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberOfCars = 0;

        try {
            System.out.print("Enter number of cars: ");
            numberOfCars = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong enter. Try again");
        }
        System.out.println("Колво машин: " + numberOfCars);
    }
}
