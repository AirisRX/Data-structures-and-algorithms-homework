import java.util.ArrayList;

public class Staff {
    ArrayList<StaffMember> staffList = new ArrayList<>();
    public int staffNumber = 0;
    public void addNewStaff(StaffMember staff) {
        staffList.add(staff);
        this.staffNumber++;
    }

    public double payDay() {
        double pay = 0;
        for(int i = 0; i < staffNumber; i++) {
            double temp = staffList.get(i).pay();
            System.out.println(staffList.get(i));
            System.out.println("Salary: " + temp + "€");
            pay += temp;
        }

        return pay;

    }
}
