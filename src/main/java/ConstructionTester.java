import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double numBoards, numWindow, taxRate, total;

        System.out.println("Enter the sales tax rate:");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need?");
        numBoards = in.nextDouble();
        System.out.println("How many windows do you need?");
        numWindow = in.nextDouble();

        Construction construct = new Construction(8.0, 11.0, taxRate);

        total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);

        
    }
}
