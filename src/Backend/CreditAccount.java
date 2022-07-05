package Backend;

public class CreditAccount extends account{
    private int limit;
    private float creditInterest;
    private float debitIntersest;

    public CreditAccount(String name, int balance, int limit, float creditInterest, float debitIntersest) {
        super(name, balance);
        this.limit = limit;
        this.creditInterest = creditInterest;
        this.debitIntersest = debitIntersest;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public float getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(float creditInterest) {
        this.creditInterest = creditInterest;
    }

    public float getDebitIntersest() {
        return debitIntersest;
    }

    public void setDebitIntersest(float debitIntersest) {
        this.debitIntersest = debitIntersest;
    }

    public boolean withdraw(int amount) {
        if (getBalance() < amount) {

            if (getBalance() + limit >= amount) {
                setBalance(getBalance() - amount);
                limit += getBalance();
                return true;
            }else return false;
        }else {
            setBalance(getBalance() - amount);
            return true;
        }

    }
}
