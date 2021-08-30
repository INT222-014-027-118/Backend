package Repositories;


import Models.ProductSpecType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpecTypeRepository extends JpaRepository<ProductSpecType,Long> {
}
