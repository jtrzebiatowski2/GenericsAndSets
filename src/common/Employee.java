package common;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;


/**
 *
 * @author J-Tron
 */
public class Employee implements Comparable, Comparator {
    private String lastName;
    private String firstName;
    private String ssn;

    /**
     *
     * @param firstName
     * @param lastName
     * @param ssn
     */
    public Employee(String firstName, String lastName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    /**
     *
     * @return
     */
    public String getSsn() {
        return ssn;
    }

    /**
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

@Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.ssn == null) ? (other.ssn != null) : !this.ssn.equals(other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    @Override
    public int compareTo(Object other) {
        
        Employee e = (Employee)other;
        
        return new CompareToBuilder()
                .append(this.ssn, e.ssn)
                .toComparison();
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
