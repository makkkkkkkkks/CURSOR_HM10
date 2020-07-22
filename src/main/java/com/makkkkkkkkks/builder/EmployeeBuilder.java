package main.java.com.makkkkkkkkks.builder;

public class EmployeeBuilder implements IBuilder {
    private String name;
    private int age;
    private String department;

    @Override
    public IBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public Employee build() {
        return new Employee(name, age, department);
    }
}
