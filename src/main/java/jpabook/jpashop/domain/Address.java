package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    /**
     * Embeddable는 기본 생성자를 public 또는 protected로 설정해야한다.
     * protected로 설정하는 것이 안전하므로 아래와 같이 설정했다.
     */
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
