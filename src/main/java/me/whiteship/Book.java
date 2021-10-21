package me.whiteship;

public class Book {

    public static String A = "A";

    private String B = "B";

    public Book() {
    }

    public Book(String b) {
        B = b;
    }

    private void c() {
        System.out.println("C");
    }

    public int d(int left, int right) {
        return left + right;
    }
}
