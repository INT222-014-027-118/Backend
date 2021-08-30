package INT222.Repositories;


import INT222.Models.ProductSpecTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpecTypeRepository extends JpaRepository<ProductSpecTypes,Long> {
}
