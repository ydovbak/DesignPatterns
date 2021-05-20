package decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " £" + houseBlend.cost());

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + " £" + espresso.cost());


        Beverage decaf = new Decaf();
        decaf = new Soy(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription() + " £" + decaf.cost());
    }
}
