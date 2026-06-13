package OOPS_Programs;

class Employee {

    // Private variables
    private int empId;
    private String empName;

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("Swaraj");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
    }
}