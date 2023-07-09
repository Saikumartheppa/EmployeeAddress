package com.saikumar.Employee.Address.repository;

import com.saikumar.Employee.Address.model.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {

    Employee findByEmployeeId(Long empId);
}
