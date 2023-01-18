public class Firm {

    public static Staff createFirm() {
        Staff staff = new Staff();
        staff.addNewStaff(new Employee("Airidas", "Rupsas", "+37065499762", "486", 1000));
        staff.addNewStaff(new Employee("Airidas", "Rupsas", "+37065499762", "486", 1000));
        staff.addNewStaff(new Trainee("Airidas", "Rupsas", "+37065499762"));
        staff.addNewStaff(new Executive("Airidas", "Rupsas", "+37065499762", "486", 1000).awardBonus(150));
        staff.addNewStaff(new Hourly("Airidas", "Rupsas", "+37065499762", "486", 1000).addHours(10));
        staff.addNewStaff(new Hourly("Airidas", "Rupsas", "+37065499762", "486", 1000).addHours(20));
        return staff;
    }

}