package INT222.Repositories;

import INT222.Models.Products;
import INT222.Models.ProductsHome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductHomeRepository  extends JpaRepository<ProductsHome,Long> {


}
