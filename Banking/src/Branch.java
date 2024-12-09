import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList <Customer> customers;

    Branch(String name){
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer (String customerName, double initialTransaction){
        Customer customer = new Customer(customerName, initialTransaction);
        customers.add(new Customer(customerName, initialTransaction));

        if (customer.getName().equals(customerName) && customer.getTransactions().get(0) == initialTransaction)
            return true;
        else
            return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if (findCustomer(name) != null) {
            findCustomer(name).addTransaction(transaction);
            return true;
        }
        else
            return false;
    }

    private Customer findCustomer(String customerName) {
        boolean found = false;
        int index = 0;
        for (int i = 0; i < customers.size(); i++){
            if (customerName.equals(customers.get(i).getName())) {
                index = i;
                found = true;
                break;
            }
        }
        if (found == false)
            return null;
        else
            return customers.get(index);
    }
}
