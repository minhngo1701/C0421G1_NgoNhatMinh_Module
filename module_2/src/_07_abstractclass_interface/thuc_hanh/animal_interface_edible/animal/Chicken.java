package _07_abstractclass_interface.thuc_hanh.animal_interface_edible.animal;

import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makesound() {
        return "Chicken: chíp chíp";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
