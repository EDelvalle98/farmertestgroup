package farmerproject;

public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;

    @Override
    public void yieldEdible() {
        System.out.println("Yeild Edible");
    }
}
