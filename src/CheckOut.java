import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double totalCost = 0;
        boolean done = false;
        boolean yN = false;

        //Prompt & Input Loop
        do {
            itemCost = SafeInput.getRangedDouble(in, "Please enter the price of your item ", .50, 9.99);
            totalCost = totalCost + itemCost;
            done = SafeInput.getYNConfirm(in, "Do you have more items?");
        }
        while (!done);

        //Output
        System.out.printf("Your total cost is " + "%.2f\n", totalCost);
    }
}