package entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "costumers")
public class Costumer extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private String email;

    @Column(name = "credit_card_number")
    private String creditCardNumber;

    @OneToMany(targetEntity = Sale.class,mappedBy = "costumer")
    private Set<Sale> sales;

}
