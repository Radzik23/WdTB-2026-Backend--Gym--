package pl.wsb.gym.member.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 60)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 60)
    private String lastName;

    @Column(name = "join_date", nullable = false)
    private LocalDate joinDate;

    @Embedded
    private ContactInfo contactInfo;

    protected Member() {}

    public Member(String firstName, String lastName, LocalDate joinDate, ContactInfo contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.contactInfo = contactInfo;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getJoinDate() { return joinDate; }
    public ContactInfo getContactInfo() { return contactInfo; }
}