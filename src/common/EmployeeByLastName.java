/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 *
 * @author J-Tron
 */
public class EmployeeByLastName implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
       return e1.getLastName().compareTo(e2.getLastName());
    }
    
}
