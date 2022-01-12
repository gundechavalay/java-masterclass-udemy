import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            if (currentCustomer.getName() == customerName)
                return currentCustomer;
        }
        return null;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            Customer newCustomer = new Customer(name,initialTransaction);
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer currentCustomer = findCustomer(name);
        if (currentCustomer != null) {
            currentCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}
