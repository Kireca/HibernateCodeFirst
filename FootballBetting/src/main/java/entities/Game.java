package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "games")
public class Game extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "home_team")
    private Team homeTeam;

    @OneToOne
    @JoinColumn(name = "away_team")
    private Team awayTeam;

    @Column(name = "home_goals")
    private short homeGoals;

    @Column(name = "away_goals")
    private short awayGoals;

    @Column(name = "date_and_time")
    private Date dateAndTime;

    @Column(name = "home_team_win_bet_rate")
    private double homeTeamWinBetRate;

    @Column(name = "away_team_win_bet_rate")
    private double awayTeamWinBetRate;

    @Column(name = "draw_game_bet_rate")
    private double drawGameBetRate;

    @ManyToOne
    @JoinColumn
    private Round round;

    @ManyToOne
    @JoinColumn
    private Competition competition;



}
