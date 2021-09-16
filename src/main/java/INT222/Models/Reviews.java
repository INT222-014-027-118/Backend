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
@Table(name = "Reviews")
public class Reviews {

    @Id
    private long id;
    @Column
    private int star;
    @Column
    private String comment;
    @Column(name = "review_date")
    private String reviewDate;
    @Column
    private long customer_id;

}
