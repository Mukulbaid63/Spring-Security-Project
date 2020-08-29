package com.example.springlec5.Repository;

import com.example.springlec5.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}