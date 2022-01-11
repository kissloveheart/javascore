package abstractvsinterface;

public class Cat extends Animal implements AnimalBreath,AnimalSleep{
    private String color;

    public Cat(String name, Integer leg, String color) {
        super(name,leg);
        this.color = color;
    }


    @Override
    public void eat() {
        System.out.println("Mèo ăn cá");
    }

    @Override
    public void drink() {
        System.out.println("Mèo uống nước lọc");
    }

    @Override
    public void breath() {
        System.out.println("Mèo thở");
    }

    @Override
    public void sleep() {
        System.out.println("Mèo ngủ "+ time);
    }
}
