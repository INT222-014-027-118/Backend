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
@Table(name = "ProductSpecTypes")
public class ProductSpecTypes {

    @Id
    @Column(name = "specTypeId")
    private long specTypeId;

    @Column(name = "specTypeName")
    private long specTypeName;

}
