package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class ProductsHome {
    @Id
    private long id;

    @Column(name = "product_name")
    private String productName;

    @Column
    private double price;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "quantity_stock")
    private int quantityStock;

    @NonNull
    @JoinColumn(nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Discounts discount;

    @OneToMany
    @JoinColumn(name = "id",insertable = true, updatable = true)
    private List<Images> images = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "Products_has_categories", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Categories> catergories = new ArrayList<>();


}
