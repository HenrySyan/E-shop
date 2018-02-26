package am.itspace.eshop.repository;

import am.itspace.eshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findOneByEmail(String email);

}
