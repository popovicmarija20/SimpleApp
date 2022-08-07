package com.SimpleApp.repository;

import com.SimpleApp.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT name " +
            "FROM Employee " +
            "WHERE surname LIKE :surname" )
    List<String> findAllByEmployeeNames(String surname);
}
