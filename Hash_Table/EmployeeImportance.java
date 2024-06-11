package Hash_Table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    // https://leetcode.com/problems/employee-importance/
    // You have a data structure of employee information, including the employee's unique ID, importance value, and direct subordinates' IDs.
    //You are given an array of employees employees where:
    //    employees[i].id is the ID of the ith employee.
    //    employees[i].importance is the importance value of the ith employee.
    //    employees[i].subordinates is a list of the IDs of the direct subordinates of the ith employee.
    //Given an integer id that represents an employee's ID, return the total importance value of this employee and all their direct and indirect subordinates.
    
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee emp : employees) {
            map.put(emp.id, emp);
        }
        List<Integer> list = map.get(id).subordinates;
        int totalImportance = map.get(id).importance;
        if(list.size() != 0){
            int i = 0;
            while (i < list.size()) {
                int empId = list.get(i);
                list.addAll(map.get(empId).subordinates);
                i++;
            }
        }
        if(list.size() != 0){
            for(int empId : list){
                totalImportance += map.get(empId).importance;
            }
        }
        return totalImportance;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
}
