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
@Table(name = "Shippings")
public class Shippings {

    @Id
    private long id;

    @Column
    private String status;

    @Column(name = "company_shipping")
    private String companyShipping;

    @Column(name = "tracking_number ")
    private String trackingNumber;


}
