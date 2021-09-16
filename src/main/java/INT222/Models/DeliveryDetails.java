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
@Table(name = "Delivery_details")
public class DeliveryDetails {

    @Id
    private long id;

    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String phone;
    @Column
    private String province;
    @Column
    private String district;
    @Column(name = "sub_district")
    private String subDistrict;
    @Column(name = "postal_code")
    private String postCode;
    @Column
    private String address;
    @Column(name = "customer_id")
    private long customerId;
}
