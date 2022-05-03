package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.domain.Person;
import ru.job4j.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestService {
   private final PersonRepository repository;

    public RestService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> findAll() {
        List<Person> rsl = new ArrayList<>();
        repository.findAll().forEach(rsl::add);
        return rsl;
    }

    public Optional<Person> findById(int id) {
        return repository.findById(id);
    }

    public void delete(Person person) {
        repository.delete(person);
    }
}
