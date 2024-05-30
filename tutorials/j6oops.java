
class Animal {

    int legs; // default public
    private int legs2 = 4;

    int get() {
        return legs2;
    }

    void eat() { // if static void than without object Animal.eat() other vise variable than
                 // anml.eat()
        System.out.println("eating...");
    }

}

class cat extends Animal {

    public void swim() {
        legs = 1;
    }
}

interface swimming {
    void swim();

    void hello(int a, int b);

    void hello(int a);
}

interface flying {
    void fly();
}

class bird implements swimming, flying {
    public void swim() {
    }

    public void hello(int a, int b) {
    };

    public void hello(int a) {
    };

    public void fly() {
    }
}

public class j6oops {
    public static void main(String[] args) {
        Animal anml = new Animal();
        anml.eat();
        anml.legs = 1;

        // Animal.eat(); only if static

        cat catvar = new cat();
        // cat.legs = 1;

    }
}
