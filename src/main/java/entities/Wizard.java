package entities;

import com.sun.istack.NotNull;
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
public class Wizard {

    @Id
    @Column
    private long id;

    @Column(length = 50)
    private String firstName;

    @Column(length = 60)
    @NotNull
    private String lastName;

    @Column
    @NotNull
    private int age;

    @Column(length = 1000)
    private String notes;


}
