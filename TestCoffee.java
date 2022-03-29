import java.util.ArrayList;

public class TestCoffee{
    public static void main(String[] args) {
        CoffeeUtil coffeeUtilClass = new CoffeeUtil();
        
        //getStreakGoal
        System.out.println("======================getStreakGoal=========================");
        System.out.println(coffeeUtilClass.getStreakGoal(10));

        //getOrderTotal
        System.out.println("======================getOrderTotal=========================");
        double[] myArray = {4.2, 8.3, 8.5, 5.5, 9.1};
        System.out.println(coffeeUtilClass.getOrderTotal(myArray));

        //displayMenu
        System.out.println("=======================displayMenu==========================");
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Drip Coffee");
        menuItems.add("Capucchino");
        menuItems.add("Latte");
        menuItems.add("Mocha");
        coffeeUtilClass.displayMenu(menuItems);

        //addCustomer
        System.out.println("=======================addCustomer==========================");
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Elisa");
        customers.add("Ulises");
        customers.add("Kiara");
        customers.add("Cassandra");
        coffeeUtilClass.addCustomer(customers);

        //printPriceChart
        System.out.println("=====================printPriceChart========================");
        String colombianCoffee = "Colombian Coffee";
        double price = 12000;
        int maxQuantity = 3;
        coffeeUtilClass.printPriceChart(colombianCoffee, price, maxQuantity);

        //displayMenuBonus
        System.out.println("=====================displayMenuBonus========================");
        ArrayList <String> menuItemsBonus = new ArrayList <>();
        menuItemsBonus.add("Drip Coffee");
        menuItemsBonus.add("Capucchino");
        menuItemsBonus.add("Latte");
        menuItemsBonus.add("Mocha");
        ArrayList <Double> pricesBonus = new ArrayList<>();
        pricesBonus.add(1200.0);
        pricesBonus.add(3200.0);
        pricesBonus.add(3600.0);
        pricesBonus.add(3200.0);
        coffeeUtilClass.displayMenuBonus(menuItemsBonus,pricesBonus);
    }
}