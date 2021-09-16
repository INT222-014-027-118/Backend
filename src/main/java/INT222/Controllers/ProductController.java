package INT222.Controllers;


import INT222.Exceptions.NotFoundException;

import INT222.Exceptions.NotFoundNameException;
import INT222.Exceptions.SameProductNameException;
import INT222.Models.Products;
import INT222.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

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


            if (productRepository.existsProductsByIdAndProductName(products.getId(),products.getProductName())) {

                throw new SameProductNameException(products.getProductName());
            }
            else
            productRepository.save(products);


    }

    @GetMapping("getByName/{name}")
    public List<Products> getProductByName(@PathVariable("name") String name) {
        return productRepository.findAllByProductNameContaining(name);
    }

//        Edit Product
    @PutMapping("/update")
    public void editProduct(@RequestBody Products products) {
        if (productRepository.existsProductsByIdAndProductName(products.getId(), products.getProductName())) {
            productRepository.save(products);
        }
        else throw new NotFoundException(products.getId());

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




    @GetMapping("getByBrandName/{brandName}")
    public List<Products> getProductByBrandName(@PathVariable("brandName") String name) {

        if(productRepository.existsProductsByBrandNameContaining(name)){
            return productRepository.findAllByBrandNameContaining(name);
        }
        else throw new NotFoundNameException(name);
    }





}
