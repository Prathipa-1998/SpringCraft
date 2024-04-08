package in.co.gradle.springCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.gradle.springCrud.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {

}
