package Collection;

public class Employee {

    String name;
    String gender;
    int salary;

    public Employee(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }
}
