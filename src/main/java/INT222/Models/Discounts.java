package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Discounts")
public class Discounts {

    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private float discount_percent;
    @Column
    private int active;
}
