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
@Table(name = "Categories")
public class Categories {

    @Id
    private long id;

    @Column
    private String category;


    @Column(name = "parent_id",nullable = true)
    private String parentId;


}
