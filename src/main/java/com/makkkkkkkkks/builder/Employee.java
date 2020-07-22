package main.java.com.makkkkkkkkks.builder;

public class Employee {
    private final String name;
    private final int age;
    private final String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee || " +
                "name= " + name +
                " age= " + age +
                " department= " + department + "||";
    }
}
