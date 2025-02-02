import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if(findCustomer(nameOfCustomer)==null){
            customers.add(new Customer(nameOfCustomer,initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer myCustomer=findCustomer(nameOfCustomer);
        if(myCustomer!=null){
            myCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String nameOfCustomer){
        for(int i=0; i<customers.size(); i++){
            Customer currCustomer=customers.get(i);
            if(currCustomer.getName().equals(nameOfCustomer)){
                return currCustomer;
            }
        }
        return null;
    }
}