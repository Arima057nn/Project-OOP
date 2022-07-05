package Backend;

public class account {
    public String name;
    public int balance;

    public account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void desposit(int amount){
        setBalance(getBalance() + amount);
    }

    public boolean withdrawal(int amount){
        if(getBalance() < amount)
            return false;
        else {
            setBalance((getBalance()) - amount);
            return true;
        }
    }



    public void display(){
        System.out.println("NAME: "+getName()+"\n"+"Balance: "+ getBalance());
    }





}
