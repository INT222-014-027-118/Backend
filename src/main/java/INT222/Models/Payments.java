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
@Table(name = "Payment")
public class Payments {

    @Id
    private long id;

    @Column
    private String type;

    @Column
    private String status;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "security_code")
    private String securityCode;

    @Column(name = "expired_card")
    private String expiredCard;

    @Column
    private String provider;

    @Column(name = "transaction_date")
    private String transactionDate;

    @Column(name = "slip_image ")
    private String slipImage;

    @Column(name = "paid_date ")
    private String paidDate;
}
