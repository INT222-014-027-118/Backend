package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Rating_of_product")
public class RatingOfProduct {

    @Id
    private long Ratings_id ;
    @Column
    private String score;
    @ManyToOne
    @JoinColumn(name = "id")
    private Products products;
}
