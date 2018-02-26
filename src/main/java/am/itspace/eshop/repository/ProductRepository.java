package am.itspace.eshop.repository;

import am.itspace.eshop.model.Category;
import am.itspace.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
