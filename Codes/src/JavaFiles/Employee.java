/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

/**
 *
 * @author user
 */
public class Employee {
    
     private String empName;
     private String empAddress;
     private String empPhone;
     private String empSalary;
     private String empDesignation;
   
  
    public Employee(String empName , String empAddress , String empSalary , String empDesignation , String empPhone) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        this.empPhone = empPhone;
      
    }


    public String getempName() {
        return empName;
    }
    
    public String getempAddress() {
        return empAddress;
    }
    public String getempSalary() {
        return empSalary;
    }
    
    public String getempDesignation() {
        return empDesignation;
    }
    
    public String getempPhone() {
        return empPhone;
    }
}
