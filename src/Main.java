import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {

//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Tom", "Software", true, true,false,25));
//        employees.add(new Employee("Mike", "Testing", false, false,true,26));
//        employees.add(new Employee("Julia", "Software", true, false,true,27));
//        employees.add(new Employee("Tomas", "Management", true, true,true,30));
//        employees.add(new Employee("Korina", "Management", true, false,true,19));
//        employees.add(new Employee("Tomas", "Management", true, true,true,28));
//        employees.add(new Employee("Tomas", "Management", true, true,true,28));
//
//        for (Employee t:employees) {
//            System.out.println(t);
//        }
       List<Employee> employees = Stream.of(
               new Employee("Tom", "Software", true, true,false,35),
                       new Employee("Maria", "Software", true, true,false,35),
                       new Employee("Mike", "Testing", false, false,true,26),
                       new Employee("Julia", "Software", true, false,true,27),
                       new Employee("Tomas", "Management", true, true,false,31),
                       new Employee("Korina", "Management", true, false,true,19),
                       new Employee("Tomas", "Management", true, true,true,28),
                       new Employee("Tomas", "Management", true, true,true,28))
          .collect(Collectors.toList());


        System.out.println("---------------------------1");
        List<Employee> result = employees.stream()
              .filter(e-> e.isCanAttendTraining())
              .filter(e -> e.getDepartment().equals("Management"))
              .filter(e -> e.getAge() > 25)
              .filter(e -> e.isPayedPerHour()==true)
              .distinct()
              .collect(Collectors.toList());
        for(Employee t1:result) {
            System.out.println(t1);
        }
        System.out.println("----------------------------2");
        List<String> result2 = employees.stream()
                .filter(e-> e.isPayedPerHour()==false)
                .filter(e -> e.getAge() > 30)
                .map(e->e.getName())
                .sorted()
                .collect(Collectors.toList());

        for(String t1:result2) {
            System.out.println(t1);
        }
        System.out.println("----------------------------3");
        List<String> result3 = employees.stream()
                .filter(e-> e.isCanAttendTraining())
                .filter(e->e.isCanConductInterview())
                .filter(e -> e.getDepartment().equals("Software"))
                .map(e->e.getName())
                .sorted()
                .limit(1)
                .collect(Collectors.toList());
        for(String t1:result3) {
            System.out.println(t1);
        }
    }
}