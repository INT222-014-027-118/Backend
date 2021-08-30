package Models;

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
@Table(name = "colors")
public class Color {

    @Id
    @Column(name = "colorId")
    private long colorId;

    @Column(name = "colorName")
    private String colorName;

    @Column(name = "colorHex")
    private String colorHex;
}
