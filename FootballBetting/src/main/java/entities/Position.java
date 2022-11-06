package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "positions")
public class Position {

    @Id
    @Column(length = 2, nullable = false, unique = true)
    private String id;

    @Column(nullable = false)
    private String description;
}
