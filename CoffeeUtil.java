import java.util.ArrayList;

class CoffeeUtil{

    public static int getStreakGoal(int numWeek) {
        int sum = 0;
        for (int i = 0; i <=numWeek; i++) {
            sum += i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    
    public static void displayMenu(ArrayList<String> menuItems) {
        menuItems.forEach((n) -> System.out.println(menuItems.indexOf(n) +" "+ n));
    }

    public static void addCustomer(ArrayList<String> customers){
        //1
        System.out.println("Please, type your name");
        //2
        String userName = System.console().readLine();
        //3
        System.out.println("Hi, " + userName + "!");
        //4
        int number = customers.size();
        System.out.println("There are " + number + " people in front of you.");
        //5
        customers.add(userName);
        System.out.println("The users waiting in line now are:");
        customers.forEach((n) -> System.out.println(n));
    }

    // static public void customFormat(String pattern, double value ) {
    //     DecimalFormat myFormatter = new DecimalFormat(pattern);
    //     String output = myFormatter.format(value);
    //     System.out.println(output);
    // }

    public static void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for(int i = 1; i<=maxQuantity; i++){
            double total = price * i;
            // String totalString = "".valueOf(total);
            //String totalStringFormatted = ;
            DecimalFormatDemo decimalFormatDemo = new DecimalFormatDemo();
            System.out.println(i + " - " + decimalFormatDemo.customFormat("$###,###.###", total)); 
        }
        
    }

    public static boolean displayMenuBonus(ArrayList<String> menuItemsBonus, ArrayList<Double> pricesBonus){
        if (menuItemsBonus.size()!=pricesBonus.size()){
            return false;
        }else{
            for(int i = 0; i<menuItemsBonus.size(); i++){
                double price = pricesBonus.get(i);
                DecimalFormatDemo decimalFormatDemo = new DecimalFormatDemo();
                System.out.println(i + " " + menuItemsBonus.get(i) + " -- " + decimalFormatDemo.customFormat("$###,###.###", price));
            }
            return true;
        }
    }
}
