 abstract class Car{//we cannot instantiate an abstract class, which means we cannot create objects of an abstract.
    int maxSpeed;
    abstract void accelerate();
    abstract void brake();
    //omly Declared but not implemented - itt is without the body.
    // they are created to force the child classes to implement them before using. we will use them after over.
    }

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying Breaks");
    }
}
public class AbstractStudy {
    public static void main(String[] args) {
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();
    }
}
