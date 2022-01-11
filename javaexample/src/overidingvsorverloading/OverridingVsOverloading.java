package overidingvsorverloading;

public class OverridingVsOverloading {

    public OverridingVsOverloading() {
    }

    public Integer sum(Integer a, Integer b){
        System.out.println("--- sum 2 Integer ---");
        return a+b;
    }

    public Integer sum(Integer a, Integer b, Integer c){
        System.out.println("---- sum 3 Integer ----");
        return a+b+c;
    }

    public Double sum(Double a, Double b){
        System.out.println("---- sum 2 Double-----");
        return a + b;
    }



    public static void main(String[] args) {
        OverridingVsOverloading overloading = new OverridingVsOverloading();
        OverridingVsOverloading overriding = new Overriding();

        System.out.println(overloading.sum(5,6));
        System.out.println(overloading.sum(5,6,7));
        System.out.println(overloading.sum(1.5,2.5));
        System.out.println("---------------------");
        System.out.println(overriding.sum(5,6));
        System.out.println(overriding.sum(5,6,7));
        System.out.println(overriding.sum(2.5,3.5));


    }
}
