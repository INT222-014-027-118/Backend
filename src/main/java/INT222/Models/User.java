package INT222.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userName;
    @Column
    private String userFirstName;
    @Column
    private String userLastName;
    @Column
    private String userPassword;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private Role role;


}
