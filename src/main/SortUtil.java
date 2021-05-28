package main;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class SortUtil {

    public static <T extends iPrecedable<T>> void ordenar(T[] arr, Method criterio) throws InvocationTargetException, IllegalAccessException {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if((int)criterio.invoke(arr[j], arr[j+1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static <T extends iPrecedable<T>> void ordenar(T[] arr) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if(arr.length == 0) return;
        Method defaultMethod = iPrecedable.class.getMethod("precedeA", Object.class);
        ordenar(arr, defaultMethod);
    }
}
