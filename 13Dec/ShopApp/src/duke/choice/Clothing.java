/*
Defining Classes and Creating Objects
 */
package duke.choice;

/**
 *
 * @author User
 */
public class Clothing {
    String description;
    double price;
    String size;
    private final double MIN_PRICE = 10;
    final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price += (price*MIN_TAX);
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
