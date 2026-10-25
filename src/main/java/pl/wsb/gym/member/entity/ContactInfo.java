package pl.wsb.gym.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ContactInfo {

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "city", length = 60)
    private String city;

    protected ContactInfo() {}

    public ContactInfo(String phone, String city) {
        this.phone = phone;
        this.city = city;
    }

    public String getPhone() { return phone; }
    public String getCity() { return city; }
}