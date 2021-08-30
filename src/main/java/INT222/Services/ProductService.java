package INT222.Services;

import INT222.Models.Products;
import INT222.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Products> getProduct() {
        return productRepository.findAll();

    }

}
