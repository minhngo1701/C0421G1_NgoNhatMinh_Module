package _07_abstractclass_interface.thuc_hanh.animal_interface_edible;

import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.animal.Animal;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.animal.Chicken;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.animal.Tiger;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.edible.Edible;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.fruit.Apple;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.fruit.Fruit;
import _07_abstractclass_interface.thuc_hanh.animal_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal animal1 : animal) {
            System.out.println(animal1.makesound());
            if (animal1 instanceof Chicken) {
                Edible edible = (Chicken) animal1;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
