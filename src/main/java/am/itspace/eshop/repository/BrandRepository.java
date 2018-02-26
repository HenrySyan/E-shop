package am.itspace.eshop.repository;

import am.itspace.eshop.model.Brand;
import am.itspace.eshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
