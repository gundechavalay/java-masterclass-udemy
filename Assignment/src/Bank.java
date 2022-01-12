import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch currentBranch = branches.get(i);
            if (currentBranch.getName() == branchName)
                return currentBranch;
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double transaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            if (currentBranch.newCustomer(name,transaction))
                return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String name, double transaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            if (currentBranch.addCustomerTransaction(name, transaction))
                return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            ArrayList<Customer> currentBranchCustomers = currentBranch.getCustomers();
            System.out.println("Customer details for branch " + currentBranch.getName());
            if (!printTransaction) {
                for (int i = 0; i < currentBranchCustomers.size(); i++) {
                    System.out.println("Customer: " + currentBranchCustomers.get(i).getName()
                                        + "[" + (i+1) + "]");
                }

            }
            else {
                for (int i = 0; i < currentBranchCustomers.size(); i++) {
                    ArrayList<Double> currentBranchCustomerTransactions = currentBranchCustomers.get(i).getTransactions();
                    System.out.println("Customer: " + currentBranchCustomers.get(i).getName()
                            + "[" + (i+1) + "]\nTransactions");
                    for (int j = 0; j < currentBranchCustomerTransactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount " + currentBranchCustomerTransactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
