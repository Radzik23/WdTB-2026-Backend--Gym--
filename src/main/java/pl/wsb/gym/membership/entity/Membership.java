package pl.wsb.gym.membership.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "membership")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "duration_days", nullable = false)
    private Integer durationDays;

    @Column(name = "active", nullable = false)
    private Boolean active;

    protected Membership() {}

    public Membership(String name, BigDecimal price, Integer durationDays, Boolean active) {
        this.name = name;
        this.price = price;
        this.durationDays = durationDays;
        this.active = active;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public BigDecimal getPrice() { return price; }
    public Integer getDurationDays() { return durationDays; }
    public Boolean getActive() { return active; }
}