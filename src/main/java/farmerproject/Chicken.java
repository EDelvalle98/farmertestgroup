package farmerproject;

public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;

    @Override
    public void yieldEdible() {
        System.out.println("Yeild Edible");
    }

    @Override
    public void eat() {
        System.out.println("Chicken eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chicken makes noise");
    }
}
