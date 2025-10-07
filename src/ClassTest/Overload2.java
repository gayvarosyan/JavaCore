package ClassTest;

public class Overload2 {
    public static void main(String[] args) {
        OverloaDemo ob = new OverloaDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}
