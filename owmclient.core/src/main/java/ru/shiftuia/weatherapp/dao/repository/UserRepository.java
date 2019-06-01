package ru.shiftuia.weatherapp.dao.repository;

import org.springframework.data.repository.CrudRepository;
import ru.shiftuia.weatherapp.dao.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
