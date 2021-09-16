package INT222.Repositories;

import INT222.Models.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Products,Long> {

//    Page<Products> findAll(Pageable pageable);



   List<Products> findAllByBrandNameContaining(String name);

  List<Products> findAllByProductNameContaining(String name);

  Boolean existsProductsByIdAndProductName(long id,String name);

  Boolean existsProductsByBrandNameContaining(String name);



}
