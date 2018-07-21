package Models;

/**
 *
 * Created by jihadbadran on 7/21/18.
 */
public class Pizza {
    private static int counter;
    private int id;
    private String pizzaType;
    private double price;
    private int size;

    public Pizza(int id,String pizzaType, double price, int size) {
        this.pizzaType = pizzaType;
        this.price = price;
        this.size = size;
        this.id = id;
        Pizza.counter += 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", pizzaType='" + pizzaType + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
