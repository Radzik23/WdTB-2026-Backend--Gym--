package pl.wsb.gym.classes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fitness_class")
public class FitnessClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name", nullable = false, length = 60)
    private String className;

    @Column(name = "instructor_name", nullable = false, length = 80)
    private String instructorName;

    @Column(name = "max_participants", nullable = false)
    private Integer maxParticipants;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, length = 20)
    private ClassCategory category;

    protected FitnessClass() {}

    public FitnessClass(String className, String instructorName, Integer maxParticipants, ClassCategory category) {
        this.className = className;
        this.instructorName = instructorName;
        this.maxParticipants = maxParticipants;
        this.category = category;
    }

    public Long getId() { return id; }
    public String getClassName() { return className; }
    public String getInstructorName() { return instructorName; }
    public Integer getMaxParticipants() { return maxParticipants; }
    public ClassCategory getCategory() { return category; }
}