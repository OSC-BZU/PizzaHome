package Services;

import Models.Employee;
import Models.Pizza;

import java.util.ArrayList;

/**
 * Created by jihadbadran on 7/21/18.
 */
public interface DataImporter {
    ArrayList<Pizza> importPizza();
    ArrayList<Employee> importEmployee();
}
