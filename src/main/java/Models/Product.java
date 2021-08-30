package Models;

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
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "productId",nullable = false, unique = true)
    private long productId;


    @Column(name = "productName" ,nullable = false, unique = true)
    private String productName;


    @Column(name = "price")
    private double price;


    @Column(name = "description")
    private String description;

    @OneToMany
    @JoinColumn(name = "imageId")
    private List<Image> image = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "specTypeId")
    private ProductSpecType productSpecType;

    @Column(name = "warranty")
    private int warranty;

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "brandName")
    private String brandName;

    @Column(name = "typeName")
    private String typeName;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "Colors", joinColumns = @JoinColumn(name = "productId"), inverseJoinColumns = @JoinColumn(name = "colorId"))
    private List<Color> colors = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "ProductSpecTypes", joinColumns = @JoinColumn(name = "productId"), inverseJoinColumns = @JoinColumn(name = "productSpecId"))
    private List<ProductSpecType>  productSpecTypes= new ArrayList<>();
}
