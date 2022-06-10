package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name="enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Students students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classes_id")
    private Classes classes;

}
