package com.goit.gojavaonline.module3.flowers;

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
