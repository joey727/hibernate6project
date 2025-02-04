package hibernate6;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name="employeeInfo")

public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="employeeId_generator")
    @SequenceGenerator(name="employeeId_generator", initialValue=1, allocationSize=1)
    
    /* To Generate the primary key in normal sequence without settting generator sequence
     *  
     * @GeneratedValue(strategy=GenerationType.IDENTITY)
     */
    private int employeeId;
    @Column(name="employee_name")
    private String employeeName;
    private double employeeSalary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }
    
}
