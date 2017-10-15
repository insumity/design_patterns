package decorator;

public class Main {

    public static void main(String[] args) {
        Beverage espr = new Espresso();
        System.out.println(espr.getDescription() + " $" + espr.cost());
        // add some condiments
        espr = new Soy(espr);
        espr = new Mocha(espr);
        espr = new SteamedMilk(espr);
        espr = new Whip(espr);
        System.out.println(espr.getDescription() + " $" + espr.cost());


        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription() + " $" + decaf.cost());
        decaf = new Soy(new Whip(new Whip( new SteamedMilk(decaf))));
        System.out.println(decaf.getDescription() + " $" + decaf.cost());

    }
}
