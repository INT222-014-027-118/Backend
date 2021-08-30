package INT222.Controllers;


import INT222.Models.Colors;
import INT222.Models.Test;
import INT222.Repositories.ColorRepository;

import INT222.Repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*")
public class ColorController {
    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private TestRepo testRepo;

    @GetMapping("/list")
    public List<Colors> getColor(){
        return colorRepository.findAll();
    }

    @GetMapping("/test")
    public List<Test> getTest(){
        return testRepo.findAll();
    }

}
