package am.itspace.eshop.repository;

import am.itspace.eshop.model.Category;
import am.itspace.eshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
