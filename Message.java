import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        String message = "";

        if (gender == 'M') {
            if (age < 18) {
                message = "Hey, " + name + "! You're still young, enjoy your teenage years!";
            } else {
                message = "Hey, " + name + "! You're a man now, make the most of it!";
            }
        } else if (gender == 'F') {
            if (age < 18) {
                message = "Hey, " + name + "! You're still young, enjoy your teenage years!";
            } else {
                message = "Hey, " + name + "! You're a woman now, make the most of it!";
            }
        } else {
            message = "Hey, " + name + "! Your gender is not recognized.";
        }

        System.out.println(message);
    }
}
