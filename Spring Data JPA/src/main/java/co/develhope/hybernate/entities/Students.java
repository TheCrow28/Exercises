package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "students", fetch = FetchType.LAZY)
    private List<Enrollments> enrollments;

}
