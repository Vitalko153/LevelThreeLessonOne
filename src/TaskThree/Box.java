package TaskThree;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List<T> boxFruit;

    public <T>Box() {
        this.boxFruit = new ArrayList<>();
    }

    //Высчитываем вес коробки.
    public int getWeight(){
        int weightBox = 0;
        for (T fruit : boxFruit) {
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box<?> boxTwo){
        return Math.abs(this.getWeight() - boxTwo.getWeight()) < 0.00001;
    }

    public void moveFruit(Box<T> boxTwo){
        boxTwo.boxFruit.addAll(this.boxFruit);
        this.boxFruit.removeAll(boxFruit);
    }

    public void  addFruit(T fruit){
        boxFruit.add(fruit);
    }

}
