package com.example.springlec5.Service;

import com.example.springlec5.Entities.Department;
import com.example.springlec5.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DepartmentService")
public class DepartmentService implements IService<Department> {
    @Autowired
    // @Autowired annotation allows Spring to resolve and inject collaborating beans into your bean.
    private DepartmentRepository departmentRepository;

    @Override
    public void create(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public Department get(long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void update(Department object) {
        departmentRepository.save(object);
    }
}
