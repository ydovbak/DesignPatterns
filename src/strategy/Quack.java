package strategy;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Loud quack");
    }
}
