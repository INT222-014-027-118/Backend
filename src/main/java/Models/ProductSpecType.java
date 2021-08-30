package Models;

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
@Table(name = "productspectypes")
public class ProductSpecType {

    @Id
    @Column(name = "specTypeId")
    private long specTypeId;

    @Column(name = "specTypeName")
    private long specTypeName;

}
