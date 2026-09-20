package java8code.day05August2026;

public class Employees {
    private String name;
    private int id;
    private String dept;

    public Employees(String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public int getId(){
        return  id;
    }

    public String getName() {
        return name;
    }

    public String getDept(){
        return dept;
    }

    public String toString(){
        return "id: "+id+ " name: "+name+" dept: "+dept;
    }
}
