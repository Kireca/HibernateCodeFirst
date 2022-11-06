package entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Target;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "sales")
public class Sale  extends BaseEntity{

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "costumer_id" , referencedColumnName = "id")
    private Costumer costumer;

    @ManyToOne
    @JoinColumn(name = "store_location_id",referencedColumnName = "id")
    private StoreLocation storeLocation;

    @Column(nullable = false)
    private Date date;

}
