package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
//    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//    @JoinTable(name = "rating_of_product", joinColumns = @JoinColumn(name = "Reviews_id"), inverseJoinColumns = @JoinColumn(name = "Ratings_id"))
//    private List<Ratings> ratings = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "reviews_id")
    private List<RatingOfProduct> ratingOfProducts = new ArrayList<>();

}
