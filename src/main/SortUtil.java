package main;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class SortUtil {

    public static <T extends iPrecedable<T>> void ordenar(T[] arr, Method criterio) throws InvocationTargetException, IllegalAccessException {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if((int)criterio.invoke(new Main(),arr[j], arr[j+1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
