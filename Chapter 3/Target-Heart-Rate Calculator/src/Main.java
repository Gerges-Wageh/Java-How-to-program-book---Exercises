import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Please fill the following information:");
        System.out.println("Your first name: ");
        String fName = input.nextLine();
        System.out.println("Your last name: ");
        String lName = input.nextLine();
        System.out.println("Your day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.println("Your month of birth: ");
        int monthOfBirth = input.nextInt();
        System.out.println("Your year of birth: ");
        int yearOfBirth = input.nextInt();

        HeartRates H1 = new HeartRates(fName, lName, dayOfBirth, monthOfBirth, yearOfBirth);

        System.out.printf("Hello, %s %s your birth date is %d-%d-%d. Your age is %d years old, " +
                        "your maximum-heart-rate = %d beats/minute, and your target-heart-rate-rage = %d beats/minute.",
                H1.getFirstName(), H1.getLastName(),
                H1.getDayOfBirth(), H1.getMonthOfBirth(), H1.getYearOfBirth(),
                H1.calculateAge(), H1.calculateMaxHeartRate(), H1.calculateTargetHeartRate());

    }
}