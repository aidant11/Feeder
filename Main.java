public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder();
        System.out.println(f);

        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());

        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));

        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5, 10));
    }
}