import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
        SafeInput.getNonZeroLenString(in, "What is your favorite word?");
        SafeInput.getInt(in, "What is your favorite number?");
        SafeInput.getDouble(in, "What is your favorite decimal?");
        SafeInput.getRangedInt(in, "Enter your favorite number", 1, 10);
        SafeInput.getRangedDouble(in, "Enter your favorite double", 1, 10);
        SafeInput.getYNConfirm(in, "Do you like pineapple on pizza?");
        SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        SafeInput.prettyHeader(in,"Message centered here");
        */

        System.out.println("Celsius | Fahrenheit");
        System.out.println("---------------------");

        double fahrenheit;
        for(double celsius = -100; celsius <=100; celsius++ ){
            fahrenheit = CtoF(celsius);
            System.out.printf("%4.0f, %10.1f\n", celsius, fahrenheit);

        }



    }
public static double CtoF(double celsius) {

    double fahrenheit;

            fahrenheit = celsius * (9.0 / 5) + 32;

    return fahrenheit;

}

}
