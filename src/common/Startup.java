package common;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author J-Tron
 */
public class Startup {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        
        //Creates a new arrayList
        List employees = new ArrayList();
        
        //The following instantiates 4 seperate Employee objects
        Employee e1 = new Employee("Justin", "Trzebiatowski", "391-47-7415");
        Employee e2 = new Employee("Darnell", "Hicks", "962-55-7887");
        Employee e3 = new Employee("Albert", "Foxtrot", "447-01-2147");
        Employee e4 = new Employee("Darnell", "Hicks", "962-55-7887");
        
        //Demonstrates the the overridden equals() method works
        if(e2.equals(e4)){
            System.out.println("The employees are the same");
        }
        else{
            System.out.println("The employees are different");
        }
        
        //Add the employee objects to the arrayList
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        System.out.println("The size of the arrayList is: " + employees.size());
        
        //Stores the employee object at index 1 of the employees array into the testEmployee1 variable
        Employee testEmployee1 = (Employee)employees.get(1);
        
        //Calls the toString method on the testEmployee1 variable to check values
        System.out.println(testEmployee1.toString());
        
        //Old style for loop with a counter varaible
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
        
        //Creates a new generalized arrayList holding Employee objects
        List<Employee> employees2 = new ArrayList<Employee> ();
        
        employees2.add(e1);
        employees2.add(e2);
        employees2.add(e3);
        employees2.add(e4);
        
        //New simplified for loop to loop through array of Employee objects and print their values
        for(Employee e : employees2){
            System.out.println(e.toString());
        }
        
        //Creates a set and fills it with the employee objects from the arrayList
        Set<Employee> employees3 = new HashSet<Employee>(employees2);
        
        //Clears the original list holding the duplicates and adds all of the elements from the set
        employees2.clear();
        employees2.addAll(employees3);
        
        //Verifies that the size of the new list is 3 elements
        System.out.println("The size of the new arrayList is: " + employees2.size());
        
        
        //Create a new generalized hashMap to store the employee objects
        
        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        
        //Add the employee objects to the map using the String 'ssn' as the key
        //Because the HashMap by default does not allow duplicate keys, the last employee added here
        //will not be added to the HashMap
        
        employeeMap.put("391-47-7415", e1);
        employeeMap.put("962-55-7887", e2);
        employeeMap.put("447-01-2147", e3);
        employeeMap.put("962-55-7887", e4);
        
        //Demonstrates how to retrieve an item from the map using that item's unique identifier or key in this case
        //the ssn
        System.out.println(employeeMap.get("447-01-2147").toString());
        
        //This creates a set of the employeeMap's unique keys using the keySet() function in the Map class.
        //The set is then looped through and the object's values may be printed out to the console.
        
        Set <String> keys = employeeMap.keySet();
        
        for(String key : keys){
            Employee found = employeeMap.get(key);
            System.out.println(found.toString());
        }
        
        //Creates a new treeMap taking a String 'ssn' for the key and an Employee object
        Map<String, Employee> employeeTreeMap = new TreeMap<String, Employee>();
        
        //Adds 4 employee objects to the treeMap, the fourth employee with not get added because it is a duplicate
        employeeTreeMap.put("391-47-7415", e1);
        employeeTreeMap.put("962-55-7887", e2);
        employeeTreeMap.put("447-01-2147", e3);
        employeeTreeMap.put("962-55-7887", e4);
        
        //Creates a set holding the keys in the employeeTreeMap
        Set<String> keys2 = employeeTreeMap.keySet();
        
        //Loops through the keys, gets the appropriate object and prints that object's value
        for(String k : keys2){
            Employee found2 = employeeTreeMap.get(k);
            System.out.println(found2.toString());
        }
        
        //Creates a treeSet of Employee objects and uses the alternative Comparator Class EmployeeByLastName
        Set<Employee> employees4 = new TreeSet<Employee>();
        
        //Adds 4 employee objects to the treeSet
        employees4.add(e1);
        employees4.add(e2);
        employees4.add(e3);
        employees4.add(e4);
        
        //Loops through the employees4 treeSet and outputs each object's value
        //These objects are sorted by ssn and duplicates are removed
        for(Employee e : employees4){
            System.out.println(e.toString());
        }
        
        //Creates a list with the objects from the treeSet
        List<Employee> testComparatorList = new ArrayList<Employee>(employees4);
        
        //Utilizes the Collections sort() method with parameters of the list, and the comparator method
        Collections.sort(testComparatorList, new EmployeeByLastName());
        
        //Loops through and prints the list in order according to the comparator method
        for (Employee e : testComparatorList){
            System.out.println(e.toString());
        }
        
        
    }
    
   
}
