package kz.zhanayev.spring.firstrestapp.repositories;

import kz.zhanayev.spring.firstrestapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {


}
