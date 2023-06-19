import java.util.Date;

public class SingleResponsibilityPrinciple {
    // Переписать код в соответствии с Single Responsibility Principle:
}

// было так:
class Employee {

    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
        }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
        }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
}

//стало так:
class Employee1 {

    private String name;
    private Date dob;
    

    public Employee1(String name, Date dob) {
        this.name = name;
        this.dob = dob;
        }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
        }
}

//выносим calculateNetSalary в отдельный класс
class calculateNetSalary {

    private int baseSalary;

    public calculateNetSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary1() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }    
}

