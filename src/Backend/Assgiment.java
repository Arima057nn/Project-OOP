package Backend;

public class Assgiment {


    public static void main(String [] args) {
        bank list = new bank();
        account obj1 = new account("ptd", 20000);
        account obj2 = new account("Arima", 30000);

        list.add(obj1);
        list.add(obj2);
        list.printAll();

    }
}
