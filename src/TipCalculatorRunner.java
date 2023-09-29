import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args)
    {
        //gathering people and tip percentage
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator");
        System.out.print("How many people are in your group? ");
        int people = s.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        double tip = s.nextDouble();

        //constructor
        TipCalculator info = new TipCalculator(people, tip);

        //making bill
        double itemPrice = 0;
        while (itemPrice != -1)
        {
            System.out.print("Enter the cost of the item in dollars and cents (-1 to end): ");
            itemPrice = s.nextDouble();
            if (itemPrice == -1) {
                break;
            }
            info.addMeal(itemPrice);
        }


        //BILL PRINTING
        System.out.println();
        System.out.println("----------------");
        System.out.println("Total bill before tip: " + info.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + tip + "%");
        System.out.println("Total tip: " + String.format("%.2f", info.tipAmount()));
        System.out.println("Total bill with tip: " + info.totalBill());


        //TEST CODES
        System.out.println("Total bill before tip: " + info.getTotalBillBeforeTip());
    }
}
