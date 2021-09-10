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
@Table(name = "productspecvalues")
public class ProductSpecValues {

    @Id
    private long productid;

    @Column
    private long spectypeid;

    @Column
    private String specvalue;

}
