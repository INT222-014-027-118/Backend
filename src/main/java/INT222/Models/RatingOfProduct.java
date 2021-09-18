package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Rating_of_product")
public class RatingOfProduct {

    @Id
    private long Reviews_id ;

    @ManyToOne
    @JoinColumn(name = "ratings_id")
    private Ratings ratings;
    @Column
    private String score;
//    @ManyToOne
//    @JoinColumn(insertable = false,updatable = false,name = "reviews_id")
//    private Reviews reviews;

    @Column
    private long  product_id ;

}
