import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
int pages = 100 - age;
System.out.println(age + "-yearolds should read at least " + pages + " pages before giving up");
scanner.close();
    }
}
