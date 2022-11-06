package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class MagicWand {

    @Id
    @Column
    private long id;


    @Column(length = 100)
    private String creator;
    @Column
    private int size;


}
