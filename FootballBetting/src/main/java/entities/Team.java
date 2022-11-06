package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "teams")
public class Team  extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column
    private String logo;

    @Column(length = 5,nullable = false)
    private String initials;

    @ManyToOne
    @JoinColumn(name = "primary_kit_color")
    private Color primaryColor;


    @ManyToOne()
    @JoinColumn(name = "secondary_kit_color")
    private Color secondaryColor;


    @ManyToOne
    private Town town;

    @Column
    private BigDecimal budget;
}
