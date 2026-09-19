package Week7PracticeProblems;

class PiggyBankPractice {
    private double savings;
    private final String id;

    PiggyBankPractice(String id) {
        this.id = id;
        savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0)
            savings += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= savings)
            savings -= amount;
    }

    public double getSavings() {
        return savings;
    }
}

public class Week7P1PiggyBank {
    public static void main(String[] args) {
        PiggyBankPractice pb = new PiggyBankPractice("PB-1");

        pb.deposit(100);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(500);
        System.out.println("Savings: " + pb.getSavings());
    }
}