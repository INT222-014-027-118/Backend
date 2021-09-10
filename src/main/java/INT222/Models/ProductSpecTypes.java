package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Productspectypes")
public class ProductSpecTypes {

    @Id
    private long productspecid;

    @Column
    private String name;

//    @OneToOne
//    @JoinColumn(name = "spectypeid")
//    private ProductSpecValues productSpecValues;

}
