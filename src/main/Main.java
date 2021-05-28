package main;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Main {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //Creamos las personas
        Persona p1 = new Persona("Lujan", 3);
        Persona p2 = new Persona("Nico", 5);
        Persona p3 = new Persona("Mati", 1);
        Persona p4 = new Persona("Yo", 8);

        //Creamos los celulares con sus respectivas personas
        Celular c1 = new Celular(123456, p1);
        Celular c2 = new Celular(23456, p2);
        Celular c3 = new Celular(3456, p3);
        Celular c4 = new Celular(456, p4);
        Celular[] celus = new Celular[]{c1,c2,c3,c4};

        Method metodoNombre = Celular.class.getMethod("compPorNombre", Celular.class, Celular.class);
        Method metodoNumero = Celular.class.getMethod("compPorNumero", Celular.class, Celular.class);
        Method metodoOriginal = Celular.class.getMethod("precedeA", Celular.class, Celular.class);


        System.out.println("Entrada");
        StringUtil.printArray(celus);
        SortUtil.ordenar(celus, metodoOriginal);

        System.out.println("Ordenado por dni de la persona (original persona)");
        StringUtil.printArray(celus);
        SortUtil.ordenar(celus, metodoNombre);

        System.out.println("Ordenado por nombre de la persona");
        StringUtil.printArray(celus);
        SortUtil.ordenar(celus, metodoNumero);

        System.out.println("Ordenado por numero de telefono");
        StringUtil.printArray(celus);
    }
}
