package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course extends BaseEntity {

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 3000, nullable = false)
    private String description;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column
    private int credits;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}