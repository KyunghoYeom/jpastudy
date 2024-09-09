package jpashop.jpastudy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Address {
    @Column(length = 10)
    private String name;
    private String city;
    private String zipcode;

    protected Address() {

    }

    public Address(String name, String city, String zipcode) {
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getName(), address.getName()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getZipcode(), address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getZipcode());
    }
}
