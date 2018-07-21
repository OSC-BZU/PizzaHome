package Models;

import java.util.ArrayList;

/**
 * Created by jihadbadran on 7/21/18.
 */
public class Order {
    private int id;
    private String details;
    private ArrayList<Pizza> orderItems;
    private double total;
    private Employee employee;

    public Order(int id, String details, ArrayList<Pizza> orderItems, double total, Employee employee) {
        this.id = id;
        this.details = details;
        this.orderItems = orderItems;
        this.total = total;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ArrayList<Pizza> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Pizza> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
