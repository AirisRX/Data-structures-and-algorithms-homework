public class Employee extends StaffMember {

    public String socSecNum;
    public double salary;

    public Employee(String name, String surname, String phone, String socSecNum, double salary) {
        super(name, surname, phone);
        this.socSecNum = socSecNum;
        this.salary = salary;
    }

    public Employee() {}

    @Override
    public double pay() {
        return this.salary;
    }
}