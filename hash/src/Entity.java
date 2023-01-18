public class Entity
{

    public String value;
    public Entity next;

    public Entity(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "["+this.value+"]";
    }
}