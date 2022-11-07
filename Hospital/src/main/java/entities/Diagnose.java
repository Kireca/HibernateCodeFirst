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
@Table(name = "diagnoses")
public class Diagnose extends BaseEntity {

    @Column(nullable = false, length = 30)
    private String name;

    @Column(length = 100)
    private String comments;

    @ManyToMany(mappedBy = "diagnoses")
    private Set<Patient> patients;

}