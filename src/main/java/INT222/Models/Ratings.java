package INT222.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Ratings")
public class Ratings {

    @Id
    private long id;
    @Column
    private String name;

    @Column(name = "description",nullable = true)
    private String description;

//    @OneToMany
//    @JoinColumn(name = "ratings_id")
//    private List<RatingOfProduct> ratingOfProducts;

}
