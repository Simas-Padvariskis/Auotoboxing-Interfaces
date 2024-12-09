import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    Bank (String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch (String branchName){
        Branch branch = new Branch(branchName);
        branches.add(branch);

        if (branch.getName().equals(branchName))
            return true;
        else
            return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        if (findBranch(branchName) != null){
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
        else
            return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if (findBranch(branchName) != null){
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        else
            return false;
    }

    private Branch findBranch (String branchName){
        boolean found = false;
        int index = 0;
        for (int i = 0; i < branches.size(); i++){
            if (branchName.equals(branches.get(i).getName())) {
                index = i;
                found = true;
                break;
            }
        }
        if (found == false)
            return null;
        else
            return branches.get(index);
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
            if (branch != null) {
                if (printTransactions){
                    System.out.println("Customer details for branch " + branchName);
                    for (int i = 0; i < branch.getCustomers().size(); i++){
                        System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                        System.out.println("Transactions");
                        for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++){
                            System.out.println("[" + (j+1) + "] Amount " + branch.getCustomers().get(i).getTransactions().get(j));
                        }
                    }
                }
                else {
                    System.out.println("Customer details for branch " + branchName);
                    for (int i = 0; i < branch.getCustomers().size(); i++) {
                        System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                    }
                }
                return true;
            }
            else return false;
    }
}
