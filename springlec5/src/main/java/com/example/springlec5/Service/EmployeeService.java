package com.example.springlec5.Service;

import com.example.springlec5.Entities.Employee;
import com.example.springlec5.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EmployeeService")
public class EmployeeService implements IService<Employee> {
    @Autowired
    // @Autowired annotation allows Spring to resolve and inject collaborating beans into your bean.
    private EmployeeRepository employeeRepository;

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee get(long id) {
        return employeeRepository.findById(id).get();

    }

    @Override
    public void update(Employee object){
        employeeRepository.save(object);
    }
}
