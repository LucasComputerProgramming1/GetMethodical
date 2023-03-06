import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {

        //Declare Variables
        Scanner in = new Scanner(System.in);
        String prompt = "Pretty Header";

        //Prompt & Input
        System.out.println("What do you want the header to be?");
        prompt = in.nextLine();

        //Output
        System.out.println("");
        SafeInput.prettyHeader(prompt);
        System.out.println("");
    }
}