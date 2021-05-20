package strategy;

public class Main {
    /*Strategy - defines a family of algorithms,
encapsulates each one, and makes them
interchangeable. Strategy lets the algorithm
vary independently from clients that use it*/
    public static void main(String[] args) {

        // mallard duck
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        mallardDuck.setFlyBehaviour(new FlyNoWay());
        mallardDuck.performFly();

        // model duck
        System.out.println("MODEL DUCK");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        // change behaviour
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
