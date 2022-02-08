import java.util.Date;
import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){ //loan with parameters
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); //instantiate a date object
    }
      

    //getAnnualInterest
    public double getannualInterstRate(){
        return this.annualInterestRate;
    }

    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //getNumberOfYears
    public int getnumberOfYears(){
        return this.numberOfYears;
    }

    public void setnumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    //getloanamount
    public double getloanAmount(){

           
        return this.loanAmount;
    }

    public void setloanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public void printAccountInfo(){
        
    }

    //getDate    
    public Date getloanDate() {

        //System.out.println(loanDate); 
        return loanDate;
    }

    public void setloanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getmonthlyPayment(){

        double monthlyPayment = (loanAmount * (annualInterestRate/12)) / (1 - (Math.pow(1/(1+(annualInterestRate/12)),numberOfYears * 12))); 

        return monthlyPayment;
    }

    public double getTotalPayment(){

        return getmonthlyPayment() * numberOfYears * 12;

    }
    
    
}
