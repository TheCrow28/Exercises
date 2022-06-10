package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes", fetch = FetchType.LAZY)
    private List<Enrollments> enrollments;

}
