package designpattern;

public class EmplyeeBuilder {
    
    private int id;

    private String name;

    private int Age;

    private String profession;

    private String workLocation;

    private double salary;

    public EmplyeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmplyeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmplyeeBuilder setAge(int age) {
        Age = age;
        return this;
    }

    public EmplyeeBuilder setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public EmplyeeBuilder setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
        return this;
    }

    public EmplyeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public String getProfession() {
        return profession;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getEmployee(){
        return new Employee(getId(), getName(),getAge(), getProfession(), getWorkLocation(), getSalary());
    }
}
