package TaskThree;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBoxEmpty = new Box<>();
        Box<Apple> appleBoxEmpty = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println("Коробка с апельсинами весит " + orangeBox.getWeight());
        System.out.println("Коробка с яблоками весит " + appleBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        orangeBox.moveFruit(orangeBoxEmpty);
    }


}
