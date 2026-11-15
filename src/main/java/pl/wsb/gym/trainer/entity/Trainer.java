package pl.wsb.gym.trainer.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 60)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 60)
    private String lastName;

    @Column(name = "specialization", nullable = false, length = 60)
    private String specialization;

    @Column(name = "hourly_rate", nullable = false, precision = 10, scale = 2)
    private BigDecimal hourlyRate;

    @OneToMany(mappedBy = "trainer")
    private java.util.List<pl.wsb.gym.classes.entity.FitnessClass> classes = new java.util.ArrayList<>();

    protected Trainer() {}

    public Trainer(String firstName, String lastName, String specialization, BigDecimal hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialization() { return specialization; }
    public BigDecimal getHourlyRate() { return hourlyRate; }
}