public class TestProgression {
    public static void main(String[] args) throws Exception {
        Progression prog;

        System.out.println("Default Pregression: ");
        prog = new Progression();
        prog.printProgression(10);

        System.out.println("Progression with start 4: ");
        prog = new Progression(4);
        prog.printProgression(10);

        System.out.println("Arithmetic progression whit defaut increment: ");
        prog = new ArithmeticProgression();
        prog.printProgression(10);

        System.out.println("Arithmetic progression whit increment 5: ");
        prog = new ArithmeticProgression(5);
        prog.printProgression(10);

        System.out.println("Arithmetic progression with start 2: ");
        prog = new ArithmeticProgression(5, 2);
        prog.printProgression(10);

        System.out.println("Geometric progression with default base: ");
        prog = new GeoometricProgression();
        prog.printProgression(10);

        System.out.println("Geometric progression with base 3: ");
        prog = new GeoometricProgression(3);
        prog.printProgression(10);

        System.out.println("Fibonacci progression with default start values: ");
        prog = new FibonacceProgression();
        prog.printProgression(10);

        System.out.println("Fibonacci progression with start values 4 and 6: ");
        prog = new FibonacceProgression(4, 6);
        prog.printProgression(8);

    }
}
