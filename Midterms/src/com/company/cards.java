package com.company;

import java.util.Objects;

public class cards {
    private int cardid;
    private String cardn;

    @Override
    public String toString() {
        return "cards{" +
                "cardid=" + cardid +
                ", cardn='" + cardn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cards cards = (cards) o;
        return cardid == cards.cardid && Objects.equals(cardn, cards.cardn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardid, cardn);
    }

    public cards(int cardid, String cardn) {
        this.cardid = cardid;
        this.cardn = cardn;
    }

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

    public String getCardn() {
        return cardn;
    }

    public void setCardn(String cardn) {
        this.cardn = cardn;
    }
}
