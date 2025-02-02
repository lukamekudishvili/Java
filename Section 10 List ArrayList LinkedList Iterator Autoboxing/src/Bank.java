import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches= new ArrayList<>();
    }

    private Branch findBranch(String nameOfBranch){
        for(Branch currBranch : branches){
            if(currBranch.getName().equals(nameOfBranch)){
                return currBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String nameOfBranch){
        if(findBranch(nameOfBranch)==null){
            branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){
        Branch branch=findBranch(nameOfBranch);
        boolean existsCustomer=false;
        if(branch !=null){
            for(Customer customer : branch.getCustomers()){
                if(customer.getName().equals(nameOfCustomer)){
                    existsCustomer=true;
                }
            }
            if(!existsCustomer){
                branch.newCustomer(nameOfCustomer,initialTransaction);
                return true;
            }


        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){
        Branch branch=findBranch(nameOfBranch);
        boolean existsCustomer=false;
        if(branch!=null){
            for(Customer customer : branch.getCustomers()){
                if(customer.getName().equals(nameOfCustomer)){
                    customer.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions){
        Branch branch=findBranch(nameOfBranch);
        if(branch!=null){
            ArrayList<Customer> myCustomers=branch.getCustomers();
            System.out.println("Customer details for branch "+branch.getName());
            if(printTransactions){
                for(int i=0; i<myCustomers.size(); i++){
                    System.out.println("Customer: "+myCustomers.get(i).getName()+"[" +(i+1) + "]");
                    System.out.println("Transactions");
                    for(int j=0; j<myCustomers.get(i).getTransactions().size(); j++){
                        System.out.println("["+(j+1)+"] Amount " +myCustomers.get(i).getTransactions().get(j));
                    }

                }
            }else{
                for(int i=0; i<myCustomers.size(); i++){
                    System.out.println("Customer: "+myCustomers.get(i).getName()+"[" +(i+1) + "]");
                }
            }
            return true;
        }
        return false;
    }
}
