package main;

public class StringUtil {

    public static <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.println(t);
        }
        System.out.println('\n');
    }
}
