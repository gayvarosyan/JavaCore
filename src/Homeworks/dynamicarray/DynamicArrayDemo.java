package Homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);

        da.print();

        System.out.println(da.getByIndex(2));
        System.out.println(da.getByIndex(10));
    }
}
