public class Member{
    private String idCard;
    private String name;
    private int limitLoan;
    private double loanAmount;

    public Member(String idCard, String name, int limitLoan){
        this.idCard = idCard;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0;
    }

    public String getName(){
        return name;
    }

    public int getLimitLoan(){
        return limitLoan;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void borrow(int amount) {
        if (loanAmount + amount > limitLoan) {
            System.out.println("Sorry, amount exceeds your loan limit!");
        } else {
            loanAmount += amount;
            System.out.println("Successfully borrowed : " + amount);
        }
    }

    public void installment(int amount) {
        double total = loanAmount * 0.1;
        if (amount < total) {
            System.out.println("sorry at least you pay 10% of your loan amount");
        } else {
            loanAmount -= amount;
            System.out.println("Successfully paid : " + amount);
        }
    }
}