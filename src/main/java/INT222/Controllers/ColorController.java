package INT222.Controllers;


import INT222.Exceptions.SameProductNameException;
import INT222.Models.Colors;
import INT222.Models.Products;
import INT222.Repositories.ColorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*")
public class ColorController {
    @Autowired
    private ColorRepository colorRepository;

    @GetMapping("/list")
    public List<Colors> getColor(){
        return colorRepository.findAll();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Colors colors) {


        if (colorRepository.existsColorsByHex_codeOrLabel(colors.getHex_code(),colors.getLabel())) {

            throw new SameProductNameException(colors.getLabel());
        }
        else
            colorRepository.save(colors);


    }

}
