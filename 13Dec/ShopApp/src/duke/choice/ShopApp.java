// Defining Classes and Creating Objects
package duke.choice;

/**
 *
 * @author opc
 */
public class ShopApp {

    public static void main(String[] args) {
        double total = 0.00;
        double tax = 0.2;

        System.out.println("Welcome to Duke Choice Shop");
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.description = "Blue jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        items[2].description = "Green Scarf";
        items[2].price = 5.0;
        items[2].size = "S";

        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";

        //System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        //System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
        //double total = ((item1.price)+(item2.price*2))*(1+tax);
        //System.out.println(total);
        Customer cus1 = new Customer();
        cus1.name = "Pinky";
        cus1.size = "S";

        cus1.addItems(items);

        int measurement = 3;
        cus1.setSize(measurement);

        System.out.println("Customer is " + cus1.name + ", " + cus1.getSize() + ", " + cus1.getTotalClothingCost());

        for (Clothing item : cus1.getItems()) {

            System.out.println("Items " + item.getDescription());
        }
        /*for (Clothing item : items) {
            if (cus1.size.equals(item.size)) {
                total += item.getPrice();
                System.out.println("Item" + "," + item.description + "," + item.price + "," + item.size);

                total = total + total * tax;
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("Total = " + total);*/

    }
}
