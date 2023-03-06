import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        //Prompt & Input
        favInt = SafeInput.getInt(in, "Enter your favorite int");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        //Output
        System.out.println("\nYour favorite int is " + favInt + " and your favorite double is " + favDouble);
    }
}
