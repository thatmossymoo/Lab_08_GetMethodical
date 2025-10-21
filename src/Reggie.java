import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        SafeInput.getRegExString(in, "Enter your M number","(M|m)\\d{5}$");
        String menuChoice;
        menuChoice = SafeInput.getRegExString(in, "Choose a menu option:\nO - Open\nS- Save\nV - View\nQ- Quit\n","^[OoSsVvQq]$");
        menuChoice = menuChoice.toUpperCase();
        switch (menuChoice)
        {
            case "O":
                System.out.println("You chose Open.");
                break;
            case "S":
                System.out.println("You chose Save.");
                break;
            case "V":
                System.out.println("You chose View.");
                break;
            case "Q":
                System.exit(0);
                break;

        }

    }
}
