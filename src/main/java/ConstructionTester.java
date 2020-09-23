import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double taxRate, total;
        int numBoards, numWindows;

        System.out.println("Enter the sales tax rate:");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need?");
        numBoards = in.nextInt();
        System.out.println("How many windows do you need?");
        numWindows = in.nextInt();

        Construction construct = new Construction(8.0, 11.0, taxRate);

        total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);

        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + construct.grandTotal(total));

    }
}
