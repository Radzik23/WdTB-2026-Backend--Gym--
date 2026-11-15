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


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "trainer_id", nullable = false)
    private pl.wsb.gym.trainer.entity.Trainer trainer;

    @Column(name = "max_participants", nullable = false)
    private Integer maxParticipants;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, length = 20)
    private ClassCategory category;

    protected FitnessClass() {}

    public FitnessClass(String className, String instructorName, Integer maxParticipants, ClassCategory category) {
        this.className = className;
        this.maxParticipants = maxParticipants;
        this.category = category;
    }

    public Long getId() { return id; }
    public String getClassName() { return className; }
    public Integer getMaxParticipants() { return maxParticipants; }
    public ClassCategory getCategory() { return category; }
}