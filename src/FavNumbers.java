import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        SafeInput.getInt(in, "What is your favorite int?");
        SafeInput.getDouble(in, "What is your favorite double?");

    }
}