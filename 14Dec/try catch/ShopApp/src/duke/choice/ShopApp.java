package duke.choice;

/**
 * Handling Exceptions Exercise7.1 Produce and Catch an exception
 */
public class ShopApp {

    public static void main(String[] args) {
        double total = 0.00;
        double tax = 0.2;

        System.out.println("Welcome to Duke Choice Shop");
        Clothing item1 = new Clothing("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        Customer cus1 = new Customer("Pinky", 3);

        System.out.println("Minimum price value : " + Clothing.MIN_PRICE);

        cus1.addItems(items);

        int measurement = 3;
        cus1.setSize(measurement);

        System.out.println("Customer is " + cus1.name + ", " + cus1.getSize() + ", " + cus1.getTotalClothingCost());

        int count = 0;
        int average = 0;
        
        for (Clothing item : cus1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count == 0)? 0: average/count;  //(condition) ? value_if_true : value_if_false;
            //average = average / count;
            System.out.println("Average price: " + average);
            System.out.println("Count: " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
    }
}