package tdmu.music.web.pm03.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdmu.music.web.pm03.model.Product;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);
    List<Product> findAllByCategoryId(int id);
    Page<Product> findByNameContaining(String name, Pageable pageable);
}
