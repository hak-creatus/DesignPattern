package Pattern1;

public class RedHeadDuck extends Duck{
    public RedHeadDuck()
    {
        quackBehavior   = new Quack();
        flyBehavior     = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
