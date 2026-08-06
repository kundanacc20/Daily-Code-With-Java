package java8code.day06August2026;

public class Employee {
    private int id;
    private String name;
    private String dept;

    public Employee(int id, String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public String toString(){
        return "id: "+id+" name: "+name+" dept: "+dept;
    }
}
