public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Hamburger", meat, price, "Brown rye");
        this.healthyExtra1Name = "";
        this.healthyExtra2Name = "";
        this.healthyExtra1Price = 0;
        this.healthyExtra2Price = 0;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalCost = super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
        if (healthyExtra1Price != 0)
            System.out.println("Added " + healthyExtra1Name + " of cost " + healthyExtra1Price);
        if (healthyExtra2Price != 0)
            System.out.println("Added " + healthyExtra2Name + " of cost " + healthyExtra2Price);
        return totalCost;
    }
}
