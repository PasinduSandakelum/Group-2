package com.virtusa.pasindu.spring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String type;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<LoyaltyCard> loyaltyCards;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LoyaltyCard> getLoyaltyCards() {
        return loyaltyCards;
    }

    public void setLoyaltyCards(List<LoyaltyCard> loyaltyCards) {
        this.loyaltyCards = loyaltyCards;
    }
}
