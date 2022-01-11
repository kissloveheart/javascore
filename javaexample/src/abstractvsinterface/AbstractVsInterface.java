package abstractvsinterface;

public class AbstractVsInterface {

    public static void main(String[] args) {
        Animal cat = new Cat("Mèo nhật",4,"đỏ");
        Animal bird = new Bird("Chim én",2,2);

        Cat cat1 = (Cat) cat;
        Bird bird1 = (Bird) bird;

        System.out.println("------- Mèo ---------");
        cat.drink();
        cat.eat();
        cat.whatIsAnimal();
        cat.toString();

        cat1.breath();
        cat1.sleep();


        System.out.println("-------- Chim ----------");
        bird.drink();
        bird.eat();
        bird.whatIsAnimal();
        cat.toString();

        bird1.breath();
        bird1.sleep();
    }
}

