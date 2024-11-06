package farmerproject;

public class Horse extends Animal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Horse eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse makes noise");
    }
}
