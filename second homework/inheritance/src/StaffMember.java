public abstract class StaffMember {

    protected String name = "Null";
    protected String surname = "Null";
    protected String phone = "Null";

    public StaffMember() {}

    public StaffMember(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String toString() {
        return "Name=" + name +
                ", Surname=" + surname +
                ", Phone number=" + phone ;
    }

    public abstract double pay();

}
