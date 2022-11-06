package entities;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "colors")
public class Color extends BaseEntity {

    @Column
    private String name;


}
