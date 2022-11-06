package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Deposit {

    @Id
    @Column
    private long id;

    @Column(name = "start_data")
    private LocalDate startData;

    @Column
    private double amount;

    @Column
    private double interest;

    @Column
    private double charge;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "is_expired")
    private boolean isExpired;

    @Column(name  = "deposit_group",length = 20)
    private String depositGroup;


}
