package string;

import abstractvsinterface.Cat;

import java.util.GregorianCalendar;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println("----- String pool------");
        String s1 = "String pool";
        String s2 = "String pool";
        String s3 = new String("String pool");
        String s4 = s3.intern();
        System.out.println("compare reference");
        System.out.println("Compare s1 and s2: "+(s1 == s2));
        System.out.println("Compare s1 and s3: "+(s1 == s3));
        System.out.println("Compare s1 and s4: "+(s1 == s4));


        String st = "-- String is immutable --";
        System.out.println(st);
        System.out.println(st.hashCode());
        st = st.substring(1);
        System.out.println(st.hashCode());

        StringBuilder stringBuilder = new StringBuilder("-- StringBuilder is mutable");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.hashCode());

        StringBuffer stringBuffer = new StringBuffer("-- StringBuilder is mutable");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.hashCode());

    }

}
