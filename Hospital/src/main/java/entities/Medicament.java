package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "medications")
public class Medicament extends BaseEntity {

    @Column(nullable = false, length = 40)
    private String name;

    @ManyToMany(mappedBy = "prescriptions")
    private Set<Patient> patients;

}