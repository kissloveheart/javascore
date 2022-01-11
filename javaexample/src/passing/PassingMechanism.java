package passing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PassingMechanism {

    public static void main(String[] args) {
        int a= 5;
        int b= 6;
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));

        modifyPrimitive(a,b);
        System.out.println("After call method: a= "+a+" ,b= "+b);
        modifyObject(list);
        System.out.println("After call method: "+listToString(list));
    }

    public static void modifyPrimitive(int a, int b){
        System.out.println("Before modify: a= "+a+" ,b= "+b);
        a =7;
        b= 8;
        System.out.println("After modify: a= "+a+" ,b= "+b);
    }

    public static void modifyObject(List<Integer> list){
        System.out.println("\nBefore modify: "+listToString(list));
        list.add(4);
        list.add(5);
        System.out.println("After modify: "+listToString(list));
    }
    public static String listToString(List<Integer> list){
        return list.stream().map(String::valueOf).collect(Collectors.joining("-","{","}"));
    }

}
