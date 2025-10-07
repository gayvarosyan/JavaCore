package Homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);

        System.out.print("Initial array: ");
        da.print();

        System.out.println("Element at index 2: " + da.getByIndex(2));
        System.out.println("Element at index 10: " + da.getByIndex(10));

        da.set(1, 99);
        System.out.print("After set(1, 99): ");
        da.print();

        da.deleteByIndex(2);
        System.out.print("After deleteByIndex(2): ");
        da.print();

        da.add(1, 50);
        System.out.print("After add(1, 50): ");
        da.print();

    }

}
