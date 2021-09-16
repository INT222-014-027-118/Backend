package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order_items")
public class OrderItems {

    @Id
    private long id;

    @Column
    private long quantity;

    @Column(name = "discount_price")
    private float discountPrice;

    @OneToOne
    @JoinColumn(name = "id" )
    private Products products;



}
