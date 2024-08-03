package Abstration;

abstract class Emp {
    abstract void work();
}

class Person extends Emp {
    @Override
    void work() {
        System.out.println("Working");
    }

    // void display() {
    // System.out.println("Displaying");
    // }
}

public class abstractv {
    public static void main(String[] args) {
        Emp e = new Person();
        e.work();
        // e.display();
    }
}
