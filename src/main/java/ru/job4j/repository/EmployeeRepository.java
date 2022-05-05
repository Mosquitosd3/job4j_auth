package ru.job4j.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Employee;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    @Override
    @Query("select distinct em from Employee em join fetch em.persons where em.id =?1")
    Optional<Employee> findById(Integer id);

    @Override
    @Query("select distinct em from Employee em join fetch em.persons")
    Iterable<Employee> findAll();
}
