package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "result_predictions")
public class ResultPrediction extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "result_prediction_value")
    private ResultPredictionValues resultPrediction;


}
