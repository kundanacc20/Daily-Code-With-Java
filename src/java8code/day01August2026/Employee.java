package java8code.day01August2026;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setId(String name){
        this.name = name;
    }

    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.id, other.id);
    }
}
