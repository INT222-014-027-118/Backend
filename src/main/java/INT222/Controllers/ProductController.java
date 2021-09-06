package INT222.Controllers;


import INT222.Exceptions.NotFoundException;
import INT222.Exceptions.NotFoundNameException;
import INT222.Exceptions.SameProductNameException;
import INT222.Models.Products;
import INT222.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    //Get all Product
    @GetMapping("/list")
    public List<Products> getProduct() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Products> getProductById(@PathVariable(value = "id") long id) {
        if (this.productRepository.existsById(id)) {
            return productRepository.findById(id);
        } else
            throw new NotFoundException(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable long id) {
        if (this.productRepository.existsById(id)) {
            this.productRepository.deleteById(id);
        } else
            throw new NotFoundException(id);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Products products) {
        Boolean b = false;
        for (int i = 0; i < productRepository.count(); i++) {
            if (productRepository.findAll().get(i).getName().equals(products.getName()) || products.getProductid() <= 0) {
                b = true;
                throw new SameProductNameException(products.getName());
            }
        }
        if (b == false) {
            productRepository.save(products);
        }

    }

    @GetMapping("getByName/{name}")
    public Products getProductByName(@PathVariable("name") String name) {
        Products product = null;
        for (int i = 0; i < this.productRepository.count(); i++) {
            if (this.productRepository.findAll().get(i).getName().equals(name)) {
                product = this.productRepository.findAll().get(i);
            }
        }
        if (product == null) {
            throw new NotFoundNameException(name);
        }
        return product;
    }

//        Edit Product
    @PutMapping("/update")
    public void editProduct(@RequestBody Products products) {
        productRepository.save(products);

    }

//    @RequestMapping("/product")
//    public List<Products> productList(@RequestParam(defaultValue = "0") Integer pageNo,
//                              @RequestParam(defaultValue = "8") Integer pageSize,
//                              @RequestParam(defaultValue = "msrp") String sortBy,
//                              Model model) {
//        Pageable paging = (Pageable) PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//        Page<Products> pageResult = productRepository.findAll(paging);
//        model.addAttribute("products",pageResult.getContent() );
//        return  pageResult;
//    }


    @GetMapping("getByTypeName/{name}")
    public List<Products> getProductByTypeName(@PathVariable("name") String name) {
        return productRepository.findAllByTypenameContaining(name);

    }

    @GetMapping("getByBrandName/{name}")
    public List<Products> getProductByBrandName(@PathVariable("name") String name) {
        return productRepository.findAllByBrandnameContaining(name);

    }

    @GetMapping("getByCatergoryName/{name}")
    public List<Products> getProductByCatergoryName(@PathVariable("name") String name) {
        return productRepository.findAllByCategorynameContaining(name);

    }




}
