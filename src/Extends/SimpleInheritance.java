package Extends;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb: ");
        superOb.showij();
        System.out.println();
        superOb.i = 7;
        superOb.j = 8;
        System.out.println("Coдepжимoe объекта subOb: ");
        superOb.showij();
        superOb.showij();

        System.out.println();
        System.out.println("Cyммa i,j и k в объекте subOb:");
        subOb.sum();

    }
}
