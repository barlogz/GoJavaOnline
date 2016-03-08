package com.goit.gojavaonline.M3.Flowers;

import java.util.List;

public class Bouquet {
    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    private List<Flower> flowers;
}
