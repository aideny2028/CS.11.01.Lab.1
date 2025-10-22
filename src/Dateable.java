import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int Age = 7 + (age/2);
                System.out.println(age+ "-yearolds should date somebody who is at least " + Age + " Years old.");
        scanner.close();

    }
}
