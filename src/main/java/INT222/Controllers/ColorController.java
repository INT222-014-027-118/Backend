package INT222.Controllers;


import INT222.Exceptions.NotFoundException;
import INT222.Exceptions.SameProductNameException;
import INT222.Models.Colors;
import INT222.Models.OrderItems;
import INT222.Models.Products;
import INT222.Repositories.ColorRepository;

import INT222.Repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*")
public class ColorController {
    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping("/list")
    public List<Colors> getColor(){
        return colorRepository.findAll();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Colors colors) {


        if (colorRepository.existsColorsByHexCodeOrLabel(colors.getHexCode(),colors.getLabel())) {

            throw new SameProductNameException(colors.getLabel());
        }
        else
            colorRepository.save(colors);


    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable long id) {
        if (this.colorRepository.existsById(id)) {
            this.colorRepository.deleteById(id);
        } else
            throw new NotFoundException(id);
    }

    @GetMapping("/test")
    public List<OrderItems> getTest(){
        return orderItemRepository.findAll();
    }
}
