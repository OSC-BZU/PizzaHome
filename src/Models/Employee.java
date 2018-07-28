package Models;

/**
 *
 *
 * Created by jihadbadran on 7/21/18.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int position;


    /**
     *
     * this is the main constructor of the Employee Class
     * @see Services.DataDB
     * @param firstName String
     * @param lastName String
     * @param id Integer
     * @param position Integer
     */
    public Employee(String firstName, String lastName, int id, int position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.position = position;
    }


    /**
     *
     * @return String the first name of the selected Employee
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
