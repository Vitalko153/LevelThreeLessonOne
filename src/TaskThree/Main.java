package TaskThree;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println(orangeBox.getWeight(Orange.getWeight()));
        System.out.println(appleBox.getWeight(Apple.getWeight()));



    }


}
