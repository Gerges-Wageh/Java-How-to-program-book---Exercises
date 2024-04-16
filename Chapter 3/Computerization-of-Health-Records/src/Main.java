import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Please fill in the following information: ");
        System.out.println("Your first name: ");
        String fName = input.nextLine();
        System.out.println("Your last name: ");
        String lName = input.nextLine();
        System.out.println("Your gender: ");
        String gender = input.nextLine();
        System.out.println("Your day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.println("Your month of birth: ");
        int monthOfBirth = input.nextInt();
        System.out.println("Your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.println("Your height in inches: ");
        double height = input.nextDouble();
        System.out.println("Your weight in pounds: ");
        double weight = input.nextDouble();

        HealthProfile P1 = new HealthProfile(fName, lName, gender, dayOfBirth, monthOfBirth, yearOfBirth, height, weight);
        System.out.printf("Hello, %s %s, you are a %s, your birth date is %d-%d-%d, your height = %.2f inches " +
                        "and your weight = %.2f pounds. Your age is %d years old, " +
                        "your maximum-heart-rate = %d beats/minute, your target-heart-rate-rage = %d beats/minute," +
                        "and your BMI = %.2f .",
                P1.getFirstName(), P1.getLastName(),P1.getGender(),
                P1.getDayOfBirth(), P1.getMonthOfBirth(), P1.getYearOfBirth(),P1.getHeight(), P1.getWeight(),
                P1.calculateAge(), P1.calculateMaxHeartRate(), P1.calculateTargetHeartRateRange(), P1.calculateBMI());

    }
}