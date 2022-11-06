package entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class WizardDeposit {




    @Column
    private String depositGroup;
    @Column
    private String depositStartData;
    @Column
    private String depositAmount;
    @Column
    private String depositInterest;
    @Column
    private String depositCharge;
    @Column
    private String depositExpirationDate;
    @Column
    private boolean isDepositExpired;


}
