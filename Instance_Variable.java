package javaapplication1;

public class Instance_Variable {

    
    public String name; //instance variable is visible for any child class.

   
    private double salary;  // salary variable is visible in Employee class only.

    
    public Instance_Variable(String empName) { // name variable is assigned in the constructor.
        name = empName;
    }

    
    public void setSalary(double empSal) { // salary variable is assigned a value.
        salary = empSal;
    }

    
    public void printEmp() { //method prints the employee details.
        System.out.println("name  : " + name);
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]) {
        Instance_Variable empOne = new Instance_Variable("A");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
