import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactionAmount){
        this.name=name;
        (this.transactions=new ArrayList<>()).add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transactionAmount){
        transactions.add(transactionAmount);
    }


}