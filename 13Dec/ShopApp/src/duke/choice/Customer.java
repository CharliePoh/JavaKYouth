/*
Defining Classes and Creating Objects
 */
package duke.choice;

/**
 *
 * @author User
 */
public class Customer {

    String size;
    String name;
    private Clothing[] items;

    public void addItems(Clothing[] any_items) {
        items = any_items;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;

            case 4:
            case 5:
            case 6:
                size = "M";
                break;

            case 7:
            case 8:
            case 9:
                size = "L";
                break;

            default:
                size = "X";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
