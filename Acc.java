import java.util.Scanner;
import java.text.DecimalFormat;

public class Acc {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Enter annual Interest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble()/100; //need to divide by 100 cos %

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan.getloanDate());
        System.out.println("The monthly payment is " + df.format(loan.getmonthlyPayment()));
        System.out.println("The total payment is " + df.format(loan.getTotalPayment()));



        input.close();

    }
}
