


class Singleton {

    private static Singleton instanace;// static instance

    // private constructor
    private Singleton() {
        System.out.println("constructor called");
    }

    public static Singleton getInstance() {
        if (instanace == null) {
            instanace = new Singleton();
            return instanace;
        } else {
            return instanace;
        }
    }

    void display() {
        System.out.println("Display called on object");
    }

}

class Demo {
    public static void main(String args[]) {
        Singleton obj1 = Singleton.getInstance();
        obj1.display();
        Singleton obj2 = Singleton.getInstance();
        obj2.display();
        System.out.println(obj1 == obj2);// means obj1 and obj2 have same object
    }
}