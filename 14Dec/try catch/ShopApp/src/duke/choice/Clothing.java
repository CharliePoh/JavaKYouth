/*
Handling Exceptions
Exercise7.1 Produce and Catch an exception
 */
package duke.choice;

/**
 *
 * @author User
 */
public class Clothing {

    private String description;
    private double price;
    private String size;
    
    public final static double MIN_PRICE = 10.00;
    public final static double TAX_RATE = .2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price += (price * TAX_RATE);
    }

    public String getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTaxRate(double taxRate) {
        taxRate = 0.2;
    }

    public static void main(String[] args) {

    }
}
