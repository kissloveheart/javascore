package abstractvsinterface;

public class Bird extends Animal implements AnimalSleep, AnimalBreath{
    private Integer wing;

    public Bird(String name, Integer leg, Integer wing) {
        super(name, leg);
        this.wing = wing;
    }

    @Override
    public void eat() {
        System.out.println("Chim ăn sâu");
    }

    @Override
    public void drink() {
        System.out.println("Chim uống nước");
    }

    @Override
    public void breath() {
        System.out.println("Chim thở");
    }

    @Override
    public void sleep() {
        System.out.println("Chim ngủ " + time);
    }
}
