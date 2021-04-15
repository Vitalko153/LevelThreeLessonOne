package TaskThree;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List<T> boxFruit;

    public <T>Box() {
        this.boxFruit = new ArrayList<>();
    }

    //Высчитываем вес коробки.
    public int getWeight(int weightFruit){
        int weightBox = 0;
        for (int i = 0; i < boxFruit.size(); i++) {
            weightBox += weightFruit;
        }
        return weightBox;
    }


    public void  addFruit(T fruit){
        boxFruit.add(fruit);
    }

}
