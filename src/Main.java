import anonymous.*;

public class Main {


    static void renderShape(Shape shape) {
        shape.render();
    }

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape square = new Square();
        Shape polygon = new Polygon();

        Shape triangle = new Shape() {
            @Override
            public void render() {
                System.out.println("Rendering triangle...");
            }
        };

        renderShape(circle);
        renderShape(triangle);
        renderShape(new Shape() {
            @Override
            public void render() {
                System.out.println("Rendering triangle...");
            }
        });

        renderShape(() -> System.out.println("Hello")); // create anonymous class and object

        Circle circle2 = new Circle();
        circle2.render();

        circle.render();
        square.render();
        polygon.render();



        Shape triangle2 = () -> {
            String name = "triangle";
            System.out.println("Rendering" + name + "...");
        };

        Shape triangle3 = () -> System.out.println("Rendering Triangle ...");


        Countable countable = (a) -> {
            System.out.println("Count: " + a); // override la metoda add
        };


        Returnable returnable2 = new Returnable() {
            @Override
            public int returnValue() {
                return 2;
            }
        };

        Returnable returnable = () -> {
            int x = 2;
            return x;
        };

        Suma suma = (a, b) -> {
            return a + b;
        };

        Suma suma1 = new Suma() {
            @Override
            public int calculateSum(int a, int b) {
                return a + b;
            }
        };

        int m = suma1.calculateSum(3, 5);

        int t = suma.calculateSum(2, 3);

        System.out.println(t);

        Suma suma2 = new AdunareNumere();
        suma2.calculateSum(3, 4);


        Automobil automobil = new Automobil() {
            @Override
            public void afiseazaVechimea() {
                System.out.println("Mercedes");
            }
        };


        Afisare afisare = (a, b) -> {
            String x = "Value" + b;

            return 2.0;
        };

        Double c = 2.0d;

    }
}