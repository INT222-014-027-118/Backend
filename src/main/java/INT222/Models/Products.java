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
    private long productid;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private String categoryname;

    @Column
    private String brandname;

    @Column
    private String typename;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "productcolors", joinColumns = @JoinColumn(name = "productid"), inverseJoinColumns = @JoinColumn(name = "colorid"))
    private List<Colors> colors = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "productspecvalues", joinColumns = @JoinColumn(name = "productid"), inverseJoinColumns = @JoinColumn(name = "spectypeid"))
    private List<ProductSpecTypes>  productspectypes = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "imageid")
    private List<Images> images = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "productid")
    private ProductSpecValues productSpecValues;
}
