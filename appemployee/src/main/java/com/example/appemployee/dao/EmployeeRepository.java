package com.example.appemployee.dao;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.appemployee.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByOrderByLastNameAsc();
}