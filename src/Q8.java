class Employee{
    private int age;
    private String name;

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
}
public class Q8 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Priya");
        System.out.println("Name : "+employee.getName());
        employee.setAge(20);
        System.out.println("Age : "+employee.getAge());

    }
}
