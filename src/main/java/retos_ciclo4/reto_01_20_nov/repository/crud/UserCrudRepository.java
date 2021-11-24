package retos_ciclo4.reto_01_20_nov.repository.crud;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import retos_ciclo4.reto_01_20_nov.model.User;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
