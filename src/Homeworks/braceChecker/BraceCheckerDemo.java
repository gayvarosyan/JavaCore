package Homeworks.braceChecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        bc1.check();
        System.out.println("-----------");

        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        bc2.check();
        System.out.println("-----------");

        BraceChecker bc3 = new BraceChecker("({[()]})");
        bc3.check();
        System.out.println("-----------");

        BraceChecker bc4 = new BraceChecker("({[})");
        bc4.check();
    }
}
