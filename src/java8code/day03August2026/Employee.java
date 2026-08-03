package java8code.day03August2026;

public class Employee {
    private int id;
    private String name;
    private long salary;

    public Employee(int id, String name, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public long getSalary(){
        return salary;
    }

    public String toString(){
        return "id "+id+ " name: "+name+" salary"+salary;
    }
}
