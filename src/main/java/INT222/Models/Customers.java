package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customers")
public class Customers {

    @Id
    private String userName;
    @Column(name = "firstname")
    private String userFirstName;
    @Column(name = "lastname")
    private String userLastName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private int points;


//    @ManyToOne
//    @JoinColumn(name = "roleId")
//    private Role role;


}
