package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

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
        
        List employees = new ArrayList();
        
        Employee e1 = new Employee("Justin", "Trzebiatowski", "391-4715-7415");
        Employee e2 = new Employee("Darnell", "Hicks", "962-55-7887");
        Employee e3 = new Employee("Albert", "Foxtrot", "447-01-2147");
        Employee e4 = new Employee("Darnell", "Hicks", "962-55-7887");
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        System.out.print(employees.size());
        
        Employee testEmployee1 = (Employee)employees.get(1);
        
        System.out.println(testEmployee1.toString());
        
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
        
        
    }
    
   
}
