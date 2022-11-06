package entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private double quantity;

    @Column
    private BigDecimal price;

    @OneToMany(targetEntity = Sale.class,mappedBy = "product")
    private Set<Sale> sales;

}
