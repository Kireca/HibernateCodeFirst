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
@Table(name = "store_locations")
public class StoreLocation extends  BaseEntity{

    @Column(name = "location_name")
    private String locationName;

    @OneToMany(targetEntity = Sale.class,mappedBy = "storeLocation")
    private Set<Sale> sales;

}
