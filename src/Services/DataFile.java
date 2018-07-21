package Services;

import Models.Employee;
import Models.Pizza;

import java.util.ArrayList;

/**
 * Created by jihadbadran on 7/21/18.
 */
public class DataFile implements DataImporter {

    @Override
    public ArrayList<Pizza> importPizza() {
        ArrayList<Pizza> result = new ArrayList<>();
        result.add(new Pizza(1,"cheeze", 150.0,10));
        return result;
    }

    @Override
    public ArrayList<Employee> importEmployee() {
        return null;
    }
}
