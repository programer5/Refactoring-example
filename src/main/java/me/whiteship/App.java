package me.whiteship;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("me.whiteship.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class);

        Book book = (Book) constructor.newInstance("myBook");
        System.out.println("book = " + book);

        Method c = Book.class.getDeclaredMethod("d", int.class, int.class);
        int invoke = (int) c.invoke(book, 1, 2);
        System.out.println("invoke = " + invoke);

    }
}
