package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes circle=new Circle();
        Shapes square=new Square();
        square.area();
    }
}
