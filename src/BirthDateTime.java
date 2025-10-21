import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        SafeInput.getRangedInt(in, "What is your birth year?", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in,"What is your birth month?", 1, 12);
        switch (birthMonth)
        {
            case 2:
                SafeInput.getRangedInt(in, "What is your birth day?", 1,29);
                break;
            case 1,3,5,7,8,10,12:
                SafeInput.getRangedInt(in, "What is your birth day?", 1, 31);
                break;
            case 4,6,9,11:
                SafeInput.getRangedInt(in, "What is your birth day?", 1, 30);
                break;
        }


    }
}
