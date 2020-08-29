package com.example.springlec5.Repository;

import com.example.springlec5.Entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
