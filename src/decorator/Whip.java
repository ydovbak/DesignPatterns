package decorator;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage b) {
        beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
