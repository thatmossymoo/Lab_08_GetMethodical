import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {

        boolean done;
        double total = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the $10 store!");
        do {

            double itemPrice = SafeInput.getRangedDouble(in, "How much is your item?", 0.50, 10.00);
            total = itemPrice + total;
            done = SafeInput.getYNConfirm(in, "Are you done?");

        }while(!done);

        String totalDisplay = String.format("%6.2f", total);
        System.out.println("Your total is " + totalDisplay);

    }
}
