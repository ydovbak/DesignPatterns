package strategy;

public class Main {
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
