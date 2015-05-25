package com.ronx.hr.dao.impl;

import com.ronx.hr.dao.HumanResourcesDAO;
import com.ronx.hr.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class HumanResourcesDAOImpl implements HumanResourcesDAO {

    private Map<Long, Employee> employeeData = new HashMap<Long, Employee>();


    public void create(Employee employee) {
        employeeData.put(employee.getId(), employee);
    }

    public Employee getEntityById(Long id) {
        return employeeData.get(id);
    }

    public void update(Employee employee) {
        employeeData.put(employee.getId(), employee);
    }

    public void delete(Long id) {
        employeeData.remove(id);
    }

    public List<Employee> getAll() {
        List<Employee> employees = new LinkedList<Employee>();
        Set<Long> empIdKeys = employeeData.keySet();
        for(Long i : empIdKeys){
            employees.add(employeeData.get(i));
        }
        return employees;
    }
}
