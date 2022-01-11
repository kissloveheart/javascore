package overidingvsorverloading;

public class Overriding extends OverridingVsOverloading {

        @Override
        public Integer sum(Integer a, Integer b) {
            System.out.println("Đây là phép cộng đã overriding");
            return super.sum(a, b);
        }

        @Override
        public Integer sum(Integer a, Integer b, Integer c) {
            System.out.println("Đây là phép cộng đã overriding");
            return super.sum(a, b, c);
        }



}
