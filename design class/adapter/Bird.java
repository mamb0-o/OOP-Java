package adapter;

public class Bird
    extends Moveable
{
    @Override
    public void move()
    {
        System.out.println("flap");
    }

    public void sing()
    {
        System.out.println("tweet");
    }
}
