public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Hamburger", "Sausage & Bacon", 19.10, "White");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add anything to Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add anything to Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add anything to Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add anything to Deluxe Hamburger");
    }
}
