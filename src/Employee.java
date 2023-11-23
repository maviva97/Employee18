import java.util.Objects;
import java.util.Comparator;
public class Employee {
    private String name;
    private String Department;
    private boolean canConductInterview;
    private boolean canAttendTraining;
    private boolean isPayedPerHour;
    private int age;

    public Employee(String name, String Department, boolean canConductInterview, boolean canAttendTraining, boolean isPayedPerHour, int age) {
        this.name = name;
        this.Department = Department;
        this.canConductInterview = canConductInterview;
        this.canAttendTraining = canAttendTraining;
        this.isPayedPerHour = isPayedPerHour;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public boolean isCanConductInterview() {
        return canConductInterview;
    }

    public void setCanConductInterview(boolean canConductInterview) {
        this.canConductInterview = canConductInterview;
    }

    public boolean isCanAttendTraining() {
        return canAttendTraining;
    }

    public void setCanAttendTraining(boolean canAttendTraining) {
        this.canAttendTraining = canAttendTraining;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public void setPayedPerHour(boolean payedPerHour) {
        isPayedPerHour = payedPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", canConductInterview=" + canConductInterview +
                ", canAttendTraining=" + canAttendTraining +
                ", isPayedPerHour=" + isPayedPerHour +
                ", age=" + age +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode() + Department.hashCode() + age;
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return Objects.equals(name, other.name);
    }
}


