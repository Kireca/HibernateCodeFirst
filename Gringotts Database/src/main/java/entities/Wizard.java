package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Wizard {

    @Id
    @Column
    private long id;

    @Column(name = "first_name",length = 50)
    private String firstName;

    @Column(name = "last_name",length = 60,nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(length = 1000)
    private String notes;

    @OneToOne
    @JoinColumn(name = "magic_wand")
    private MagicWand magicWand;

    @OneToMany
    private List<Deposit> deposits;
}
