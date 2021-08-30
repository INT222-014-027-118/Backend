package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Products {

    @Id
    @Column(name = "productId",nullable = false, unique = true)
    private long productId;


    @Column(name = "productName" ,nullable = false, unique = true)
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


    @OneToMany
    @JoinColumn(name = "imageId")
    private List<Images> image = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "specTypeId")
    private ProductSpecTypes productSpecType;


    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "brandName")
    private String brandName;

    @Column(name = "typeName")
    private String typeName;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "Colors", joinColumns = @JoinColumn(name = "productId"), inverseJoinColumns = @JoinColumn(name = "colorId"))
    private List<Colors> colors = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "ProductSpecTypes", joinColumns = @JoinColumn(name = "productId"), inverseJoinColumns = @JoinColumn(name = "specTypeId"))
    private List<ProductSpecTypes>  productSpecTypes= new ArrayList<>();
}
