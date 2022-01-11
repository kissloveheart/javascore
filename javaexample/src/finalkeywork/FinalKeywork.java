package finalkeywork;

import abstractvsinterface.Animal;
import abstractvsinterface.Bird;
import abstractvsinterface.Cat;

public final class FinalKeywork extends TestExtend{

    static final int MAX = 10;

    public FinalKeywork(Integer number) {
        super(number);
    }

    /* Methods marked as final cannot be overridden. */
    //@Override
    //public void testOverriding()

    public static void main(String[] args) {
        final int a = 3;
        /* Variables marked as final can't be reassigned.*/
        //a =4;

        final Animal animal = new Cat("meomeo",4,"red");
        //animal = new Bird("hihi",2,2);

    }

    public  static void argument(final int b){
        System.out.println("A final argument can’t be changed inside a method:");
        //b = 5;
    }

}
