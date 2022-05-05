package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.domain.Employee;
import ru.job4j.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> findAll() {
        List<Employee> rsl = new ArrayList<>();
        repository.findAll().forEach(rsl::add);
        return rsl;
    }

    public Optional<Employee> findById(int id) {
        return repository.findById(id);
    }

    public void delete(Employee employee) {
        repository.delete(employee);
    }

}
