package Java25Code.day08july2026;

import java.util.ArrayList;
import java.util.List;

public class PermanentEmployeeManager {
    private List<Employee> permanentEmployees = new ArrayList<>();

    public void loadEmployees(int count){
        for(int i=0 ; i<count; i++){
            permanentEmployees.add(new Employee(i));
        }
    }
    public List<Employee> getEmployees(){
        return permanentEmployees;
    }
}
