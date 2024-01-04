package Pattern1;

public class CustomizeDuck extends Duck{
    public CustomizeDuck(QuackBehavior qb, FlyBehavior fb)
    {
        quackBehavior   = qb;
        flyBehavior     = fb;
    }

    @Override
    public void display() {
        System.out.println("I'm your duck");
    }
}
