package Pattern1;

public class DecoyDuck extends Duck{
    public DecoyDuck()
    {
        quackBehavior   = new MuteQuack();
        flyBehavior     = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
