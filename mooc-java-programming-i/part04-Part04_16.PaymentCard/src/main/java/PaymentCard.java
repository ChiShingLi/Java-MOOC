
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        // make sure balance doesn't reach negative
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // make sure balance doesn't reach negative
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // the card's balance may not exceed 150 euros, if exceeds -> 150
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        // write code here
        return ("The card has a balance of " + this.balance + " euros");
    }
}
