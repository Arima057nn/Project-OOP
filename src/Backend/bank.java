package Backend;
import java.util.LinkedList;


public class bank {
    LinkedList<account> accounts = new LinkedList<>();

    public void add(account acc){
        if(acc != null){
            accounts.add(acc);
        }
    }


    public void printAll(){
        System.out.println("-----List Account-----");
        int i;
        for(i = 0; i < accounts.size();i++){
            accounts.get(i).display();
        }
    }


}
