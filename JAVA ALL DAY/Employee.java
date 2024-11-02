public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newsalary) {
        this.salary = newsalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public String toString() {
        return "The id is" + id + "\n" + "The name is" + getName() + "\n" + "salary is:" + salary;
    }

}
