package entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "players")
public class Player extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(name = "squad_number",nullable = false)
    private int squadNumber;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Position position;

    @Column(name = "is_currently_injured")
    private boolean isCurrentlyInjured;
}
