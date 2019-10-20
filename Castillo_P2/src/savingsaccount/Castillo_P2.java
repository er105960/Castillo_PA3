package savingsaccount;
public class Castillo_P2 {

    static private double annualInterestRate;
    private double savingBalance;

    public Castillo_P2()
    {

    }
    public Castillo_P2(double savingBalance)
    {
        this.savingBalance=savingBalance;
    }

    public double getSavingBalance()
    {
        return this.savingBalance;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyI;
        monthlyI= (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
    }


    public static void main(String[] args) {
        Castillo_P2 saver1, saver2;
        saver1 = new Castillo_P2(2000.0);
        saver2= new Castillo_P2(3000.0);

        int total = 0;
        Castillo_P2.modifyInterestRate (0.04);
        System.out.println("Printing Balance for Saver 1");
        for(int i=0; i<12; i++) {
            saver1.calculateMonthlyInterest();
            //Print out the new balances for both savers
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }

        System.out.println("\nPrinting Balance for Saver 2\n");
        for(int i=0; i<12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

        Castillo_P2.modifyInterestRate(0.05);
        System.out.println("\nAfter changing annual interest rate to 0.05 Printing Balance for Saver 1");
        int i = 0;
        saver1.calculateMonthlyInterest();
        System.out.println("Next Month : "+ String.format("%.2f",saver1.getSavingBalance()));

        System.out.println("\nAfter changing annual interest rate to 0.05 Printing Balance for Saver 2");
        saver2.calculateMonthlyInterest();
        System.out.println("Next Month : "+ String.format("%.2f",saver2.getSavingBalance()));


    }
}

