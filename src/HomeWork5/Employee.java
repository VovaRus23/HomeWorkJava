package HomeWork5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, long phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getShowInfo() {
        System.out.println("Fullname: " + fullName + "   " + "Position: " + position + "   " + "Email: " + email + "   " +
                "Phone: " + phone + "   " + "Salary: " + salary + "   " + "Age: " + age + "\n");
    }

    public int getShowAge(){
        return age;
    }

}
