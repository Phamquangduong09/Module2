package btvn.Day6;

public class TestEmployee {
    public static void maxExp(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getYear() < employees[j].getYear()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John", 24, "Male", 3);
        Employee employee2 = new Employee(2, "Camile", 27, "Male", 7);
        Employee employee3 = new Employee(3, "Kaisa", 35, "Male", 10);
        Employee employee4 = new Employee(4, "Garen", 21, "Male", 1);
        Employee employee5 = new Employee(5 ,"Jhin", 26, "Male", 5);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int maxyear = employee1.getYear();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getYear() > maxyear) {
                maxyear = employees[i].getYear();
                index = i;
            }
        }
        System.out.println("Những nhân viên có nhiêu kinh nghiệm là :");
        maxExp(employees);
        System.out.println("nhân viên có tuổi lớn nhất là :");
        System.out.println(employees[index]);

    }

}

