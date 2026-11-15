package pl.wsb.gym.reservation.entity;

import jakarta.persistence.*;
import pl.wsb.gym.member.entity.Member;
import pl.wsb.gym.classes.entity.FitnessClass;
import java.time.LocalDate;

@Entity
@Table(name = "class_reservation")
public class ClassReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacja do Klubowicza (wiele rezerwacji wskazuje na jednego klubowicza)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    // Relacja do Zajęć (wiele rezerwacji wskazuje na jedne zajęcia)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fitness_class_id", nullable = false)
    private FitnessClass fitnessClass;

    @Column(name = "reservation_date", nullable = false)
    private LocalDate reservationDate;

    protected ClassReservation() {}

    public ClassReservation(Member member, FitnessClass fitnessClass, LocalDate reservationDate) {
        this.member = member;
        this.fitnessClass = fitnessClass;
        this.reservationDate = reservationDate;
    }

    public Long getId() { return id; }
    public Member getMember() { return member; }
    public FitnessClass getFitnessClass() { return fitnessClass; }
    public LocalDate getReservationDate() { return reservationDate; }
}