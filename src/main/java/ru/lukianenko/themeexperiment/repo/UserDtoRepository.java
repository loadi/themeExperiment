package ru.lukianenko.themeexperiment.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.lukianenko.themeexperiment.dto.UserDto;

public interface UserDtoRepository extends JpaRepository<UserDto, Long> {
    // Можно добавить дополнительные методы, если нужно
}
