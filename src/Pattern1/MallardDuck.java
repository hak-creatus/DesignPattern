package Pattern1;

public class MallardDuck extends Duck{
    public MallardDuck()
    {
        flyBehavior     = new FlyWithWings();
        quackBehavior   = new Quack();
    }

    @Override
    public void display() {

    }
}
